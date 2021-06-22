package declarations;

public class ISBN {
	private int PubYear;
	private String  ISBN,
					BookName, 
					Description, 
					Edition, 
					Author;
	
	public int getPubYear() {
		return PubYear;
	}
	public void setPubYear(int pubYear) {
		PubYear = pubYear;
	}
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	public String getBookName() {
		return BookName;
	}
	public void setBookName(String bookName) {
		BookName = bookName;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public String getEdition() {
		return Edition;
	}
	public void setEdition(String edition) {
		Edition = edition;
	}
	public String getAuthor() {
		return Author;
	}
	public void setAuthor(String author) {
		Author = author;
	}
	
}
