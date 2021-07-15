package execs;

import java.sql.Date;
import java.util.ArrayList;
import general.classComboItem;

import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;

import declarations.Book;
import declarations.ISBN;

public class BookEXE {
	
	public static void setValues (Book book, int ISBN, String LocDescription) {
		book.setISBN(ISBN);
		book.setLocDescription(LocDescription);
	}
	
	public static void RetrieveISBN (String table, JComboBox<classComboItem> comboBox) {
		ArrayList<ISBN> items = BookCRUD.RetrieveISBN(table);
		
		comboBox.addItem(new classComboItem("- select -", 0));
		
		for (ISBN isbn: items) {	 
			comboBox.addItem(new classComboItem(isbn.getISBN() + ", " +
												isbn.getBookName(), isbn.getISBNID()));
		}		
	}
	
	public static String exeInsertStatements (Book book) {
		int intRes = BookCRUD.CreateBook(book);
		
		if (intRes > 0) {
			return "Saved Changes. Please exit then reload this window.";
		} else {
			return "Changes failed to reflect in the database. Try Again";
		}
	}
	
	public static void ReadBookTable(DefaultTableModel table) {
		ArrayList<Book> book = BookCRUD.ReadBook();
		
		for (Book books : book) {
			Object objList[] = {
					books.getBookCode(),
					books.getISBNstr(), 
					books.getLocDescription()
								};
			table.addRow(objList);
		}
		
	}

}
