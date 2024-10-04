package com.qspider.jdbc_simple_crud_oper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Delete_Product_Controller {
	public static void main(String[] args) {
		try {
			//Step1: load/register driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//Step2: Create connection(Establishing a connection)
			
			String url = "jdbc:mysql://localhost:3306/jdbc-db";
			String username = "root";
			String password = "root";
			
			Connection connection = DriverManager.getConnection(url, username, password);
			
			//Step3: create statement 
			Statement statement = connection.createStatement();
			
			//Step4: Execute query
			
			String deleteQuery = "delete from product where id = 5; ";
			statement.execute(deleteQuery);
			System.out.println("Data Delete");
			
			
		} catch (ClassNotFoundException | SQLException e)
		{
			e.printStackTrace();
			System.out.println("Data not deleted..");
		}
	}

}
