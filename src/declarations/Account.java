package declarations;

public class Account {
	
	private  int BorrowerID;
	private  String BorrowerName,
					Address,
					City,
					Province,
					Country,
					Role;
	

	public int getBorrowerID() {
		return BorrowerID;
	}
	public void setBorrowerID(int borrowerID) {
		BorrowerID = borrowerID;
	}
	public String getBorrowerName() {
		return BorrowerName;
	}
	public void setBorrowerName(String borrowerName) {
		BorrowerName = borrowerName;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getProvince() {
		return Province;
	}
	public void setProvince(String province) {
		Province = province;
	}
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		Country = country;
	}
	public String getRole() {
		return Role;
	}
	public void setRole(String role) {
		Role = role;
	}
	
}
