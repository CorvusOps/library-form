package execs;

import declarations.Account;

public class AccountEXE {

	public static void setValues (Account account, String AccountName, 
			String Address, String City, String Province, String Country, 
			String Role, String ContactNum, String Email) {
		account.setAccountName(AccountName);
		account.setAddress(Address);
		account.setCity(City);
		account.setProvince(Province);
		account.setCountry(Country);
		account.setRole(Role);
		account.setContactNum(ContactNum);
		account.setEmail(Email);
	}
	
	public static String exeInsertStatements (Account account) {
		int intRes = AccountCRUD.CreateAccount(account);
		
		if (intRes > 0) {
			return "Saved Changes. Please exit then reload this window.";
		} else {
			return "Changes failed to reflect in the database. Try Again";
		}
	}
}
