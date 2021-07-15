package declarations;

public class Book {
	private int BookCode, ISBN;
	private String LocDescription, ISBNstr;
	
	public int getBookCode() {
		return BookCode;
	}
	public void setBookCode(int bookCode) {
		BookCode = bookCode;
	}
	public int getISBN() {
		return ISBN;
	}
	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}
	public String getLocDescription() {
		return LocDescription;
	}
	public void setLocDescription(String locDescription) {
		LocDescription = locDescription;
	}
	public String getISBNstr() {
		return ISBNstr;
	}
	public void setISBNstr(String iSBNstr) {
		ISBNstr = iSBNstr;
	}


}
