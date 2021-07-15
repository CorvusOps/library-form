package execs;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import connection.DbConnection;
import declarations.Book;
import declarations.ISBN;

public class BookCRUD {
	static Connection conn = null;
	static PreparedStatement objPreparedStatementObject = null;
	static ResultSet ojbResultSetObject = null;
	
	public static  String setFields() {
		String strfields = 
						"(ISBN,"          +
						"LocDescription)";
		return strfields;
	}
	
	public static  String setValues() {
		String strfields = "VALUES(?,"+
								  "?)";
		return strfields;
	}
	
	public static int CreateBook (Book book) {
		conn =   DbConnection.getConnection();
		int intResult = 0;

		try {
			objPreparedStatementObject = conn.prepareStatement("INSERT INTO book_table " + setFields()
					+ setValues());
			objPreparedStatementObject.setInt(1, book.getISBN());
			objPreparedStatementObject.setString(2, book.getLocDescription());
			
			intResult = objPreparedStatementObject.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return intResult;
	}
	
	public static ArrayList<ISBN> RetrieveISBN (String table) {
		ArrayList<ISBN> isbn = new ArrayList<ISBN>();
		
		try {
			conn =   DbConnection.getConnection();
			objPreparedStatementObject = conn.prepareStatement("SELECT ISBN_ID,isbn,BookName FROM " + table);  
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
	
	public static ArrayList<Book> ReadBook() {
		ArrayList<Book> book = new ArrayList<Book>();
		try {
			conn =   DbConnection.getConnection();
			objPreparedStatementObject = conn.prepareStatement("SELECT b.BookCode,i.ISBN,b.LocDescription FROM book_table AS b" + 
															" INNER JOIN isbn_table AS i ON b.ISBN = i.ISBN_ID");  
					
			ojbResultSetObject = objPreparedStatementObject.executeQuery();
		
			while(ojbResultSetObject.next()) {
				Book books = new Book();
				books.setBookCode(ojbResultSetObject.getInt("BookCode"));
				books.setISBNstr(ojbResultSetObject.getString("ISBN"));
				books.setLocDescription(ojbResultSetObject.getString("LocDescription"));
				
				book.add(books);
			}
		}catch(Exception e){
		// TODO Auto-generated catch block
		e.printStackTrace();
		}  
	return book;
	}
	
	
	
}
