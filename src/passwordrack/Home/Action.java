package passwordrack.Home;

import passwordrack.GUI.Login;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.swing.JOptionPane;

public class Action {
	
	private static String url;
	private static String user;
	private static String pass;
	private static String username;
	
	public Action()
	{
		url = "jdbc:oracle:thin:@localhost:1521:xe";
		user = "system";
		pass = "manager";
	}
	
	public void addAction(String password_tag, String password) 
	{
		try 
		{
			username = Login.Username;
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection connect = DriverManager.getConnection(url,user,pass);
			String sql = "insert into PasswordRackUserData values(?,?,?)";
			PreparedStatement ps = connect.prepareStatement(sql);
			ps.setString(1, username);
			ps.setString(2, password_tag);
			ps.setString(3, password);
			ps.execute();
			JOptionPane.showMessageDialog(null,"Data Saved Successfully !!");
		} 
		catch (Exception e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Data Not Saved !!");
		}
	}
}

	//public void retrieveAction()
