package com.xworkz.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCExecution {

	public static void main(String[] args) {
		
		String jdbcUrl = "jdbc:mysql://localhost:3306/place";
		String userName="root";
		String password="Binmysql@222001";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");//step 1 
			System.out.println("Establish Connection....");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String query1="Insert into address values(1,'Rajajinagar','Banglore','Karnataka',566011)";
		String query2="Insert into address values(2,'Vijaynagar','Banglore','Karnataka',577011)";
		String query3="Insert into address values(3,'NandiniLayout','Banglore','Karnataka',577899)";
		String query4="Insert into address values(4,'Yashwanthpur','Banglore','Karnataka',588011)";
		String query5="Insert into address values(5,'R T nagar','Banglore','Karnataka',566000)";
		String query6="Insert into address values(6,'Mejastic','Banglore','Karnataka',566002)";
		String query7="Insert into address values(7,'Vidyanagar','Chitradurga','Karnataka',577215)";
		String query8="Insert into address values(8,'Bank Colony','Davanagere','Karnataka',577501)";
		String query9="Insert into address values(9,'Sarawathi nagar','Davanagere','Karnataka',577504)";
		String query10="Insert into address values(10,'Sai city','Chitradurga','Karnataka',577509)";

		try {
			Connection conn=DriverManager.getConnection(jdbcUrl, userName, password);//step 2;Establish connection
			Statement stmt=conn.createStatement();//Step 3: Create Statement
			stmt.execute(query1);//Step 4: Execute Query
			stmt.execute(query2);
			stmt.execute(query3);
			stmt.execute(query4);
			stmt.execute(query5);
			stmt.execute(query6);
			stmt.execute(query7);
			stmt.execute(query8);
			stmt.execute(query9);
			stmt.execute(query10);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
