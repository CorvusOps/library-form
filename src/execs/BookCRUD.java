package execs;

import connection.DbConnection;
import java.sql.*;
import java.util.ArrayList;

import declarations.Book;

public class BookCRUD {
	static Connection conn = null;
	static PreparedStatement objPreparedStatementObject = null;
	static ResultSet ojbResultSetObject = null;
	
	public static  String setFields() {
		String strfields = 
						"(BookCode,"      +
						"BookName"        +
						"Description,"    +
						"Edition,"        +
						"PubYear,"        +
						"ISBN,"           +
						"LocDescription," +
						"Author)";
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
