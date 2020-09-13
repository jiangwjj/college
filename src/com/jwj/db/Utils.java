package com.jwj.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class Utils {
	public final static ResourceBundle rb = ResourceBundle
			.getBundle("com.jwj.db.config");

	private Utils() {
	}

	static {
		try {
			Class.forName(rb.getString("driver"));
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static Connection getConnection() {
		Connection con = null;
		try {
			con = DriverManager.getConnection(rb.getString("url"),
					rb.getString("username"), rb.getString("password"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;

	}

}
