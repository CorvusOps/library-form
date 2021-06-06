package declarations;

public class Book {
	private static int BookCode, PubYear;
	private static String BookName, Description, Edition, ISBN, LocDescription, Author;
	
	//Integer Fields 
	public int getBookCode() {
		return BookCode;
	}
	
	public void setBookCode(int id) {
		BookCode = id;
	}
	
	public int getPubYear() {
		return PubYear;
	}
	
	public void setPubYear(int id) {
		PubYear = id;
	}
	
	// String Fields
	public String getBookName () {
		return BookName;
	}
	
	public void setBookName (String param) {
		BookName = param;
	}
	
	public String getDescription () {
		return Description;
	}
	
	public void setDescription (String param) {
		Description = param;
	}
	
	public String getEdition () {
		return Edition;
	}
	
	public void setEdition (String param) {
		Edition = param;
	}
	
	public String getISBN () {
		return ISBN;
	}
	
	public void setISBN (String param) {
		ISBN = param;
	}
	
	public String getLocDescription () {
		return LocDescription;
	}
	
	public void setLocDescription (String param) {
		LocDescription = param;
	}
	
	public String getAuthor () {
		return Author;
	}
	
	public void setAuthor (String param) {
		Author = param;
	}
}
