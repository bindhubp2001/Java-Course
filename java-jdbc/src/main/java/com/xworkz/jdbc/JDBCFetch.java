package com.xworkz.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCFetch {
	
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

		String fetchQuery = "Select * from address";// Delete Query
		try {
			Connection conn = DriverManager.getConnection(jdbcUrl, userName, password);// step 2;Establish connection
			Statement stmt = conn.createStatement();// Step 3: Create Statement

			ResultSet rs= stmt.executeQuery(fetchQuery);//to Execute DML statements
			while(rs.next()) {
				//System.out.println("Result present in result Set");
				System.out.println("ID : "+rs.getInt(1));
				System.out.println("Name : "+rs.getString("name"));
				
				System.out.println("City : "+rs.getString("city"));
				System.out.println("Pincode : "+rs.getInt("pincode")); 
				System.out.println("State : "+rs.getString("state"));//getZZZZ --> zzz-string,int
				System.out.println("--------------------------------");
			}
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
