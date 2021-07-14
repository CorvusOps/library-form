package execs;

import java.sql.Date;
import java.util.ArrayList;

import javax.swing.table.DefaultTableModel;

import declarations.ISBN;

public class ISBNEXE {
	
	public static void setValues (ISBN isbn, String ISBN, 
			String BookName, String Description, String Edition, 
			Date PubYear, String Author) {
		isbn.setISBN(ISBN);
		isbn.setBookName(BookName);
		isbn.setDescription(Description);
		isbn.setEdition(Edition);
		isbn.setPubYear(PubYear);
		isbn.setAuthor(Author);

	}
	
	public static String exeInsertStatements (ISBN isbn) {
		int intRes = ISBNCRUD.CreateISBN(isbn);
		
		if (intRes > 0) {
			return "Saved Changes. Please exit then reload this window.";
		} else {
			return "Changes failed to reflect in the database. Try Again";
		}
	}
	
	public static void ReadISBNTable(DefaultTableModel table) {
		ArrayList<ISBN> isbn = ISBNCRUD.ReadISBN();
		
		for (ISBN ISBNS : isbn) {
			Object objList[] = {
					ISBNS.getISBNID(),
					ISBNS.getISBN(), 
					ISBNS.getBookName(),
					ISBNS.getDescription(),
					ISBNS.getEdition(),
					ISBNS.getPubYear(),
					ISBNS.getAuthor(),
								};
			table.addRow(objList);
		}
		
	}

}
