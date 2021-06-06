package execs;

import connection.DbConnection;
import java.sql.*;
import java.util.ArrayList;

import declarations.Account;

public class AccountCRUD {
	static Connection conn = null;
	static PreparedStatement objPreparedStatementObject = null;
	static ResultSet ojbResultSetObject = null;
	
	public static  String setFields() {
		String strfields = 
						"(BorrowerID,"      +
						"BorrowerName,"     +
						"Address,"          +
						"City,"             +
						"Province,"         +
						"Country,"          +
						"Role)";
		return strfields;
	}
	
	public static  String setValues() {
		String strfields = "VALUES(?,"+
								"?,"  + 
								"?,"  +
							    "?,"  +
							    "?,"  +
							    "?,"  +
							    "?)";
		return strfields;
	}
}
