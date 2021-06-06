package declarations;

import java.sql.Date;

public class BorrowForm {
	private  int id, BorrowerID, BookCode, IssuedBy;
	private  Date Start_Date, Due_Date, Returned_Date;
	private  float Fine;
	
	//Integer Fields 
	public int getid() {
		return id;
	}
	
	public void setid(int i) {
		id = i;
	}
	
	public int getBorrowerID() {
		return BorrowerID;
	}
	
	public void setBorrowerID(int id) {
		BorrowerID = id;
	}
	
	public int getBookCode() {
		return BookCode;
	}
	
	public void setBookCode(int id) {
		BookCode = id;
	}
	
	public int getIssuedBy() {
		return IssuedBy;
	}
	
	public void setIssuedBy(int id) {
		IssuedBy = id;
	}
	
	// Date Field
	public Date getStart_Date () {
		return Start_Date;
	}
	
	public void setStart_Date (Date date) {
		Start_Date = date;
	}
	
	public  Date getDue_Date () {
		return Due_Date;
	}
	
	public void setDue_Date (Date date) {
		Due_Date = date;
	}
	
	public Date getReturned_Date() {
		return Returned_Date;
	}
	
	public void setReturned_Date(Date date) {
		Returned_Date = date;
	}
	
	// Float Field
	public float getFine() {
		return Fine;
	}
	
	public void setFine(float fine) {
		Fine= fine;
	}
}
