/**
 * This class is created to check whether the Data that 
 * user entered in Password_tag and Password textfield 
 * through 'addFrame' in Home Page i.e. homeFrame
 */


package passwordrack.Home;

import passwordrack.GUI.Login;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class DataChecking {
	
	private static String url;
	private static String username;
	private static String password;
	
	public DataChecking()
	{
		url = "jdbc:oracle:thin:@localhost:1521:xe";
		username = "system";
		password = "manager";
	}
	
	public int getAddPasswordResult(String password_tag, String Password1)
	{
		int i = 0;
		try {
			
			String user = Login.Username;
			String sql = "select Password_Tag, Password from PasswordRackUserData where Password_Tag = '"+password_tag.toUpperCase()+"'AND Password = '"+Password1+"' AND Username = '"+user+"'";
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection connect = DriverManager.getConnection(url, username, password);
			PreparedStatement ps = connect.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			
			if(rs.next())
				i=1;
			connect.close();
			}
		
		catch(SQLException e)
		{
			JOptionPane.showMessageDialog(null, e, "ERROR", JOptionPane.ERROR_MESSAGE);
		}
		catch(Exception e){
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, e, "ERROR", JOptionPane.ERROR_MESSAGE);
		}
		return i;
	}

}
