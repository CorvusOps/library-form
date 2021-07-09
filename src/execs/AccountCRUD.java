package execs;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import connection.DbConnection;
import declarations.Account;

public class AccountCRUD {
	static Connection conn = null;
	static PreparedStatement objPreparedStatementObject = null;
	static ResultSet ojbResultSetObject = null;
	
	public static  String setFields() {
		String strfields = 
						"(AccountName,"    +
						"Address,"         +
						"City,"            +
						"Province,"        +
						"Country,"         +
						"Role,"			   +
						"ContactNum,"	   +
						"Email)";
		return strfields;
	}
	
	public static  String setValues() {
		String strfields = "VALUES(?,"+
								"?,"  + 
								"?,"  +
							    "?,"  +
							    "?,"  +
							    "?,"  +
							    "?,"  +
							    "?)";
		return strfields;
	}
	
	public static int CreateAccount (Account account) {
		conn =   DbConnection.getConnection();
		int intResult = 0;

		try {
			objPreparedStatementObject = conn.prepareStatement("INSERT INTO account_table " + setFields()
					+ setValues());
			objPreparedStatementObject.setString(1, account.getAccountName());
			objPreparedStatementObject.setString(2, account.getAddress());
			objPreparedStatementObject.setString(3, account.getCity());
			objPreparedStatementObject.setString(4, account.getProvince());
			objPreparedStatementObject.setString(5, account.getCountry());
			objPreparedStatementObject.setString(6, account.getRole());
			objPreparedStatementObject.setString(7, account.getContactNum());
			objPreparedStatementObject.setString(8, account.getEmail());
			intResult = objPreparedStatementObject.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return intResult;
	}
}
