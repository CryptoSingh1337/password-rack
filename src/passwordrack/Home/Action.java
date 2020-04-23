package passwordrack.Home;

import passwordrack.GUI.Login;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class Action {
	
	private static String url;
	private static String user;
	private static String pass;
	private static String username;
	private String sql;
	
	public Action()
	{
		url = "jdbc:oracle:thin:@localhost:1521:xe";
		user = "system";
		pass = "manager";
	}
	
	public void addAction1(String password_tag, String password) 
	{
		try 
		{
			username = Login.Username;
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection connect = DriverManager.getConnection(url,user,pass);
			sql = "insert into PasswordRackUserData values(?,?,?)";
			PreparedStatement ps = connect.prepareStatement(sql);
			ps.setString(1, username);
			ps.setString(2, password_tag);
			ps.setString(3, password);
			ps.execute();
			JOptionPane.showMessageDialog(null,"Data Saved Successfully !!");
		} 
		catch(SQLException e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, e, "ERROR", JOptionPane.ERROR_MESSAGE);
		}
		catch (Exception e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, e, "ERROR", JOptionPane.ERROR_MESSAGE);
		}
	}
}

	//public void retrieveAction()
