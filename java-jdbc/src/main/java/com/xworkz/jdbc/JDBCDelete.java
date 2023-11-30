package com.xworkz.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDelete {

	public static void main(String[] args) {

		String jdbcUrl = "jdbc:mysql://localhost:3306/place";
		String userName = "root";
		String password = "Binmysql@222001";

		try {
			Class.forName("com.mysql.jdbc.Driver");// step 1
			System.out.println("Establish Connection....");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String deleteQuery = "Delete from address where city='Banglore'";// Delete Query
		try {
			Connection conn = DriverManager.getConnection(jdbcUrl, userName, password);// step 2;Establish connection
			Statement stmt = conn.createStatement();// Step 3: Create Statement

			int a = stmt.executeUpdate(deleteQuery);//to Execute DML statements
			System.out.println(a);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
