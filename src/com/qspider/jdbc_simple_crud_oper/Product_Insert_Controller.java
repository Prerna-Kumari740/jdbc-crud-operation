package com.qspider.jdbc_simple_crud_oper;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Product_Insert_Controller {
	public static void main(String[] args) {
		try {
			//Step 1: load / register driver 
			Class.forName("com.mysql.cj.jdbc.Driver");
	
			// step 2: Create Connection (establishing a connection)
			
			String url = "jdbc:mysql://localhost:3306/jdbc-db";
			String username = "root";
			String password = "root";
			
			Connection connection = DriverManager.getConnection(url,username,password);
			
			//Step 3: create statement 
			Statement statement =  connection.createStatement();
			
			//Step 4: Execute query
			String insertQuery ="insert into product(id,name,price,color) values(5,'sotttle',67,'bluegreen')";
			
			// if we want to insert  query we can go for Execute method.
			
			statement.execute(insertQuery);
			System.out.println("Data Stored");
			
			
			
		} catch (ClassNotFoundException  | SQLException e) {
			e.printStackTrace();
			System.out.println("Data not stored.........");
			
		}
		

	}
	

}
