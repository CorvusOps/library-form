package declarations;

public class Book {
	private int BookCode;
	private String LocDescription;
	private ISBN iSBN;

	
	public int getBookCode() {
		return BookCode;
	}
	public void setBookCode(int bookCode) {
		BookCode = bookCode;
	}
	public String getLocDescription() {
		return LocDescription;
	}
	public void setLocDescription(String locDescription) {
		LocDescription = locDescription;
	}
	public ISBN getiSBN() {
		return iSBN;
	}
	public void setiSBN(ISBN iSBN) {
		this.iSBN = iSBN;
	}
	
	
	
	
	
}
