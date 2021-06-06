package execs;

import connection.DbConnection;
import java.sql.*;
import java.util.ArrayList;

import declarations.BorrowForm;

public class BorrowFormCRUD {
	static Connection conn = null;
	static PreparedStatement objPreparedStatementObject = null;
	static ResultSet ojbResultSetObject = null;
	
	public static  String setFields() {
		String strfields = 
						"(id,"           +
						"BorrowerID"     +
						"BookCode,"      +
						"Start_Date,"    +
						"Due_Date,"      +
						"Returned_Date," +
						"Fine,"          +
						"IssuedBy)";
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
}
