package declarations;

import java.sql.Date;

public class BorrowForm {
	private  int id, IssuedBy;
	private  Date Start_Date, Due_Date, Returned_Date;
	private  float Fine;
	private Account accountID;
	private Book bookCode;
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public Account getAccountID() {
		return accountID;
	}

	public void setAccountID(Account accountID) {
		this.accountID = accountID;
	}

	public Book getBookCode() {
		return bookCode;
	}

	public void setBookCode(Book bookCode) {
		this.bookCode = bookCode;
	}
	
}
