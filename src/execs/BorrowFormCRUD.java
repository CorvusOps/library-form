package execs;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import connection.DbConnection;
import declarations.Account;
import declarations.Book;
import declarations.BorrowForm;
import declarations.ISBN;

public class BorrowFormCRUD {
	static Connection conn = null;
	static PreparedStatement objPreparedStatementObject = null;
	static ResultSet ojbResultSetObject = null;
	
	public static  String setFields() {
		String strfields = 
						"(borrowformID," +
						"accountID,"     +
						"BookCode,"      +
						"Start_Date,"    +
						"Due_Date,"      +
						"Return_Date," +
						"Fine,"          +
						"IssuedBy)";
		return strfields;
	}
	
	public static  String setValues() {
		String strfields = "VALUES(?,"+
								"?,"  + 
								"?,"  +
							    "?,"  +
							    "?,"  +
							    "?,"  +
							    "?,"  +
							    "?)";
		return strfields;
	}
	
	public static int CreateBorrowForm (BorrowForm borrowform) {
		conn =   DbConnection.getConnection();
		int intResult = 0;

		try {
			objPreparedStatementObject = conn.prepareStatement("INSERT INTO borrowform_table " + setFields()
					+ setValues());
			objPreparedStatementObject.setInt(1, borrowform.getFormID());
			objPreparedStatementObject.setInt(2, borrowform.getAccountID());
			objPreparedStatementObject.setInt(3, borrowform.getBookCode());
			objPreparedStatementObject.setDate(4, borrowform.getStart_Date());
			objPreparedStatementObject.setDate(5, borrowform.getDue_Date());
			objPreparedStatementObject.setDate(6, borrowform.getReturned_Date());
			objPreparedStatementObject.setFloat(7, borrowform.getFine());
			objPreparedStatementObject.setInt(8, borrowform.getIssuedBy());
						
			intResult = objPreparedStatementObject.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return intResult;
	}
	
	public static ArrayList<Account> RetrieveAccount (String table) {
		ArrayList<Account> account = new ArrayList<Account>();
		
		try {
			conn =   DbConnection.getConnection();
			objPreparedStatementObject = conn.prepareStatement("SELECT AccountID,AccountName, Role FROM " + table + 
															" WHERE Role <> 'Librarian' ");  
							
			ojbResultSetObject = objPreparedStatementObject.executeQuery();
			
			while(ojbResultSetObject.next()) {
				Account entity = new Account();
				entity.setAccountID(ojbResultSetObject.getInt("AccountID"));
				entity.setAccountName(ojbResultSetObject.getString("AccountName"));
								
				account.add(entity);
			}
		}
		catch(Exception e){
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		
		return account;
	}
	public static ArrayList<ISBN> RetrieveBook (String table) {
		ArrayList<ISBN> isbn = new ArrayList<ISBN>();
		
		try {
			conn =   DbConnection.getConnection();
			objPreparedStatementObject = conn.prepareStatement("SELECT ISBN_ID, isbn,BookName FROM " + table);  
			ojbResultSetObject = objPreparedStatementObject.executeQuery();
			
			while(ojbResultSetObject.next()) {
				ISBN entity = new ISBN();
				entity.setISBNID(ojbResultSetObject.getInt("ISBN_ID"));
				entity.setISBN(ojbResultSetObject.getString("ISBN"));
				entity.setBookName(ojbResultSetObject.getString("BookName"));
				
				isbn.add(entity);
			}
		}
		catch(Exception e){
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		
		return isbn;
	}
	public static ArrayList<Account> RetrieveLibrarian (String table) {
		ArrayList<Account> librarian = new ArrayList<Account>();
		
		try {
			conn =   DbConnection.getConnection();
			objPreparedStatementObject = conn.prepareStatement("SELECT AccountID, AccountName, Role FROM " + table + 
															" WHERE Role <> 'Borrower' ");  
							
			ojbResultSetObject = objPreparedStatementObject.executeQuery();
			
			while(ojbResultSetObject.next()) {
				Account entity = new Account();
				entity.setAccountID(ojbResultSetObject.getInt("AccountID"));
				entity.setAccountName(ojbResultSetObject.getString("AccountName"));
								
				librarian.add(entity);
			}
		}
		catch(Exception e){
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		
		return librarian;
	}

	public static ArrayList<BorrowForm> ReadBorrowForm() {
		ArrayList<BorrowForm> form = new ArrayList<BorrowForm>();
		try {
			conn =   DbConnection.getConnection();
			objPreparedStatementObject = conn.prepareStatement(" SELECT bf.borrowformID, a.AccountName 	AS 'borrower', i.BookName, "+
										" bf.Start_Date, bf.Due_Date, bf.Return_Date, bf.Fine, l.AccountName AS 'librarian' " + 
										" FROM borrowform_table AS bf " +
										" INNER JOIN book_table AS b ON bf.bookCode = b.BookCode " +
										" INNER JOIN isbn_table AS i ON  b.ISBN = i.ISBN_ID " + 
										" INNER JOIN account_table AS a ON bf.accountID = a.accountID " + 
										" INNER JOIN account_table AS l ON bf.IssuedBy = l.accountID; ");  

			ojbResultSetObject = objPreparedStatementObject.executeQuery();

			while(ojbResultSetObject.next()) {
				BorrowForm forms = new BorrowForm();
				forms.setFormID(ojbResultSetObject.getInt("borrowformID"));
				forms.setAccountString(ojbResultSetObject.getString("borrower"));
				forms.setBookString(ojbResultSetObject.getString("BookName"));
				forms.setStart_Date(ojbResultSetObject.getDate("Start_Date"));
				forms.setDue_Date(ojbResultSetObject.getDate("Due_Date"));
				forms.setReturned_Date(ojbResultSetObject.getDate("Return_Date"));
				forms.setFine(ojbResultSetObject.getFloat("Fine"));
				forms.setLibrarianString(ojbResultSetObject.getString("librarian"));
				
				form.add(forms);
				}
		}
		catch(Exception e){
			// TODO Auto-generated catch block
			e.printStackTrace();
			}  
		return form;

	}
}
