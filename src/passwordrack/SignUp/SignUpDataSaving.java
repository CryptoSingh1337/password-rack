package passwordrack.SignUp;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class SignUpDataSaving {
	
	private String url;
	private String username;
	private String password;
	
	public void setDataSubmit(String Name,String Username,String Password,String Email,String Mobileno)
	{
		try {
			url = "jdbc:oracle:thin:@localhost:1521:xe";
			username = "system";
			password = "manager"; 

			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection connect = DriverManager.getConnection(url,username,password);
			String sql = "insert into PasswordRackAccounts values(?,?,?,?,?)";
			PreparedStatement p = connect.prepareStatement(sql);
			p.setString(1, Name);
			p.setString(2, Username);
			p.setString(3, Password);
			p.setString(4, Email);
			p.setString(5, Mobileno);
			p.execute();
			
			JOptionPane.showMessageDialog(null, "Saved Data Successfully!!");
			
			connect.close();
			}
		catch(SQLException e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Username Already Exists !!", "ERROR", JOptionPane.ERROR_MESSAGE);
		}
		catch(Exception e){
			JOptionPane.showMessageDialog(null, e, "ERROR", JOptionPane.ERROR_MESSAGE);
		}
	}
}


