package passwordrack.Login;

import java.sql.*;

public class LoginValidation {
	
	private String url;
	private String username;
	private String password;
	
	void checkValidation(String Username1, String Password1)
	{
		try {
			url = "jdbc:oracle:thin:@localhost:1521:xe";
			username = "system";
			password = "manager";
			
			Class.forName("orcale.jdbc.driver.OracleDriver");
			Connection connect = DriverManager.getConnection(url, username, password);
			 
		}
		
		catch(Exception e){
			
		}	
	}
	
}
