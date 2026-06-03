package 
import java.sql.Connection;
import java.sql.DriverManager;


public class jdbcDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String ur1 = "jdbc:oracle:thin;@localhost:1521:ex";
		String username = "sys as SYSDBA";
		String password = "pass123";
		
try(Connection conn = DriverManager.getConnection(ur1, username, password)){
	if(conn != null) {
		System.out.println("Connected successfully!");
	
	}
	catch(Exception e) {
		e.printStackTrace();
	}
}


	}

}
