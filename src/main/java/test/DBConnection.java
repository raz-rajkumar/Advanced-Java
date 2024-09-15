package test;

import java.sql.*;

public class DBConnection {
	public static Connection con = null;

	public DBConnection() {
	}
	//static Block
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(DBInfo.dbURL, DBInfo.dbUName, DBInfo.dbPWord);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static Connection getCon() {
		return con;
	}
}
