package com.excilys.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConnectionSQL {
	
	private static String user="admincdb";
	private static String mdp="qwerty1234";
	private static String url = "jdbc:mysql://localhost/computer-database-db";
	
	private static Connection connection;
	
	public static Connection seConnecter() {
		
		if(connection == null) {
			
			try {
				connection = DriverManager.getConnection(url, user, mdp);
				System.out.println("bien connecté");
			} catch (SQLException e) {
				e.printStackTrace();
			} 
		}
		
		return connection;
	}
	
}
