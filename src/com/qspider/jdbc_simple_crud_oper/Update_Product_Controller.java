package com.qspider.jdbc_simple_crud_oper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Update_Product_Controller {
	
	public static void main(String[] args) {
		
		try {
			//Step1: load/register driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//Step2: Create Connection (Establishing a connection)
			String url = "jdbc:mysql://localhost:3306/jdbc-db" ;
			String username =  "root";
			String password = "root";
			
			Connection connection = DriverManager.getConnection(url, username, password);
			
			//Step3: create statement
			Statement statement = connection.createStatement();
			//Step4: Execute query
			
			//String updateQuery = "update product set color = 'aquagreen' where id ="+5;
			// String  updateQuery = "update product set name = 'krishu' where id ="+5;
			String  updateQuery = "update product set price= 110  where id ="+5;
			
			
			int update = statement.executeUpdate(updateQuery);
			
			if(update ==1) {
				System.out.println("Data updated..");
			} else {
				System.out.println("Not updated...");
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			System.out.println("Data not Stored");
		}
	}

}
