package declarations;

import java.sql.Date;

public class BorrowForm {
	private  int FormID, accountID, bookCode,IssuedBy;
	private  Date Start_Date, Due_Date, Returned_Date;
	private String accountString, librarianString, bookString;
	private  float Fine;
	
	
	public int getFormID() {
		return FormID;
	}
	public void setFormID(int formID) {
		FormID = formID;
	}
	public int getAccountID() {
		return accountID;
	}
	public void setAccountID(int accountID) {
		this.accountID = accountID;
	}
	public int getBookCode() {
		return bookCode;
	}
	public void setBookCode(int bookCode) {
		this.bookCode = bookCode;
	}
	public int getIssuedBy() {
		return IssuedBy;
	}
	public void setIssuedBy(int issuedBy) {
		IssuedBy = issuedBy;
	}
	public Date getStart_Date() {
		return Start_Date;
	}
	public void setStart_Date(Date start_Date) {
		Start_Date = start_Date;
	}
	public Date getDue_Date() {
		return Due_Date;
	}
	public void setDue_Date(Date due_Date) {
		Due_Date = due_Date;
	}
	public Date getReturned_Date() {
		return Returned_Date;
	}
	public void setReturned_Date(Date returned_Date) {
		Returned_Date = returned_Date;
	}
	public float getFine() {
		return Fine;
	}
	public void setFine(float fine) {
		Fine = fine;
	}
	public String getAccountString() {
		return accountString;
	}
	public void setAccountString(String accountString) {
		this.accountString = accountString;
	}
	public String getBookString() {
		return bookString;
	}
	public void setBookString(String bookString) {
		this.bookString = bookString;
	}
	public String getLibrarianString() {
		return librarianString;
	}
	public void setLibrarianString(String librarianString) {
		this.librarianString = librarianString;
	}


}
