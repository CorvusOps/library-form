package execs;

import java.sql.Date;
import java.util.ArrayList;

import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;

import declarations.Account;
import declarations.BorrowForm;
import declarations.ISBN;
import general.classComboItem;

public class BorrowFormEXE {
	
	public static void setValues (BorrowForm borrowform, int accountID,int bookCode,
			Date Start_Date,Date Due_Date,Date Returned_Date,
			float Fine, int IssuedBy) {
		borrowform.setAccountID(accountID);
		borrowform.setBookCode(bookCode);
		borrowform.setStart_Date(Start_Date);
		borrowform.setDue_Date(Due_Date);
		borrowform.setReturned_Date(Returned_Date);
		borrowform.setFine(Fine);
		borrowform.setIssuedBy(IssuedBy);	
	}
	
	public static String exeInsertStatements (BorrowForm borrowform) {
		int intRes = BorrowFormCRUD.CreateBorrowForm(borrowform);
		
		if (intRes > 0) {
			return "Saved Changes. Please exit then reload this window.";
		} else {
			return "Changes failed to reflect in the database. Try Again";
		}
	}
	public static void RetrieveAccount (String table, JComboBox<classComboItem> comboBox) {
		ArrayList<Account> users = BorrowFormCRUD.RetrieveAccount(table);
		
		comboBox.addItem(new classComboItem("- select -", 0));
		
		for (Account account: users) {	 
			comboBox.addItem(new classComboItem(account.getAccountName(), account.getAccountID()));
		}
	}
	public static void RetrieveBook (String table, JComboBox<classComboItem> comboBox) {
		ArrayList<ISBN> items = BorrowFormCRUD.RetrieveBook(table);
		
		comboBox.addItem(new classComboItem("- select -", 0));
		
		for (ISBN book: items) {	 
			comboBox.addItem(new classComboItem(book.getISBN() + ", " + book.getBookName(), book.getISBNID()));
		}
	}
	public static void RetrieveLibrarian (String table, JComboBox<classComboItem> comboBox) {
		ArrayList<Account> users = BorrowFormCRUD.RetrieveLibrarian(table);
		
		comboBox.addItem(new classComboItem("- select -", 0));
		
		for (Account account: users) {	 
			comboBox.addItem(new classComboItem(account.getAccountName(), account.getAccountID()));
		}
	}
	
	public static void ReadBorrowFormTable(DefaultTableModel table) {
		ArrayList<BorrowForm> form = BorrowFormCRUD.ReadBorrowForm();
		
		for (BorrowForm forms : form) {
			Object objList[] = {
					forms.getFormID(),
					forms.getAccountString(), 
					forms.getBookString(),
					forms.getStart_Date(),
					forms.getDue_Date(),
					forms.getReturned_Date(),
					forms.getFine(),
					forms.getLibrarianString(),
								};
			table.addRow(objList);
		}
		
	}


}
