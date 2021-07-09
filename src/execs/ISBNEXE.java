package execs;

import java.sql.Date;

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

}
