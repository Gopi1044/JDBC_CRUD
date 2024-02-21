package com.task.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class EmployeeUtil {
	public static String url="jdbc:mysql://localhost:3306/task";
	public static String username="root";
	public static String password="Gopi@1044";
	public static Connection connection=null;
	public static Connection getDbConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		connection=DriverManager.getConnection(url,username,password);
		return connection;
	}
	public static void getDBDestroyConnection() throws SQLException {
		connection.close();
	}
}