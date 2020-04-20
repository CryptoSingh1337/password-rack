package passwordrack.Login;

import java.sql.*;

public class LoginValidation {
	
	private String url;
	private String username;
	private String password;
	
	public int checkValidation(String Username1, String Password1)
	{
		int i = 0;
		try {
			url = "jdbc:oracle:thin:@localhost:1521:xe";
			username = "system";
			password = "manager";
			
			String sql = "select Username,Password from PasswordRack where Username = '"+Username1+"' AND Password = '"+Password1+"'";
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection connect = DriverManager.getConnection(url, username, password);
			PreparedStatement ps = connect.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			
			if(rs.next())
				i=1;
		}
		
		catch(Exception e){
			e.printStackTrace();
		}
		
		return i;
	}
	
}
