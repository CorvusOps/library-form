package declarations;

public class Account {
	private  int BorrowerID;
	private  String BorrowerName, Address, City, Province, Country, Role;
	
	public int getBorrowerID() {
		return BorrowerID;
	}
	
	public void setBorrowerID(int id) {
		BorrowerID = id;
	}
	
	// String Fields
	public String getBorrowerName () {
		return BorrowerName;
	}
	
	public void setBorrowerName (String param) {
		BorrowerName = param;
	}
	
	public String getAddress () {
		return Address;
	}
	
	public void setAddress (String param) {
		Address = param;
	}
	
	public String getCity () {
		return City;
	}
	
	public void setCity (String param) {
		City = param;
	}
	
	public String getProvince () {
		return Province;
	}
	
	public void setProvince (String param) {
		Province = param;
	}
	
	public String getCountry () {
		return Country;
	}
	
	public void setCountry (String param) {
		Country = param;
	}
	
	public String getRole () {
		return Role;
	}
	
	public void setRole (String param) {
		Role = param;
	}
	
}
