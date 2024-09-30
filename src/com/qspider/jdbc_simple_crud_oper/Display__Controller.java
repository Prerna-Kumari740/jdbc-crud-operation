package com.qspider.jdbc_simple_crud_oper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Display__Controller {
	public static void main(String[] args) {
		
		try {
			//Step1: load/ register driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//Step2: Create Connection (Establishing a connection)
			String url = "jdbc:mysql://localhost:3306/jdbc-db";
			String username = "root";
			String password = "root";
			
			Connection connection = DriverManager.getConnection(url, username, password);
			
			//step3: create statement
			Statement statement = connection.createStatement();
			
			//Step 4 execute query
			String displayQuery  = "select* from product ;";
			
			ResultSet rs = statement.executeQuery(displayQuery);
			
			while(rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				double price = rs.getDouble("price");
				String color = rs.getString("color");
				
				System.out.println(" Id : " +id+", " + "Name : " +name+", "+ "Price: "+price+","+  "Color: "+color);
				
				System.out.println();
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			System.out.println("Data not displayed");
		}
	}

}
