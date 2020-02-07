package com.salwa.ecommer.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ConnectDataBase {
	
	public void connection(String userName, String password,String email,String contact) 
	{
	
	try {
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","System03","system");
		PreparedStatement stmt=conn.prepareStatement("insert into register values(?,?,?,?)");
	   
		stmt.setString(1, userName);
		stmt.setString(2, password);
		stmt.setString(3, email);
		stmt.setString(4, contact);
		stmt.executeUpdate();
		
	}
	catch(SQLException sqe)
	
	{
		System.out.println("Error");
		sqe.printStackTrace();
	}
	}
	public void connectionP(String productId, String productName,String productPrice,String productDescription) 
	{
	
	try {
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","System03","system");
		PreparedStatement stmt=conn.prepareStatement("insert into register values(?,?,?,?)");
	   
		stmt.setString(1, productId);
		stmt.setString(2, productName);
		stmt.setString(3, productPrice);
		stmt.setString(4, productDescription);
	
		stmt.executeUpdate();
		
	}
	catch(SQLException sqe)
	
	{
		System.out.println("Error");
		sqe.printStackTrace();
	}
	}

}
