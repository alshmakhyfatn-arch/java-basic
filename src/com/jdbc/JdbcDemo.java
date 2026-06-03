package com.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;



public class JdbcDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String ur1 = "jdbc:oracle:thin:@localhost:1521:xe";
		String username = "sys as SYSDBA";
		String password = "fatin*982";
		
try(Connection conn = DriverManager.getConnection(ur1, username, password)){
	if(conn != null) {
		System.out.println("Connected successfully!");
	
	}
}
	catch(Exception e) {
		System.out.println("Unable to connect");
		e.printStackTrace();
	}



	}

}
