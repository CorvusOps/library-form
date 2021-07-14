package execs;

import java.util.ArrayList;

import javax.swing.table.DefaultTableModel;

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

	public static void ReadAccountTable(DefaultTableModel table) {
		ArrayList<Account> account = AccountCRUD.ReadAccount();
		
		for (Account accounts : account) {
			Object objList[] = {
								accounts.getAccountID(),
								accounts.getAccountName(), 
								accounts.getAddress(),
								accounts.getCity(),
								accounts.getProvince(),
								accounts.getCountry(),
								accounts.getRole(),
								accounts.getContactNum(),
								accounts.getEmail()
								};
			table.addRow(objList);
		}
		
	}
}
