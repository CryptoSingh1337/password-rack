/**
 * This class contains method for performing
 * operation that user want to perform like 
 * ADD, RETRIEVE, EXPORT,DELETE. These method
 * can only be accessed by Home.java
 */

package passwordrack.Home;

import passwordrack.GUI.Login;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
			ps.setString(2, password_tag.toUpperCase());
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

	public String retrieveActionOneRecord(String password_tag)
	{
		String result = "";
		try 
		{
			username = Login.Username;
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection connect = DriverManager.getConnection(url,user,pass);
			sql = "select Password from PasswordRackUserData where Username = '"+username+"' AND Password_Tag = '"+password_tag.toUpperCase()+"'";
			PreparedStatement ps = connect.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			
			if(rs.next())
			{
				result = rs.getString(1);
			}
			else
				JOptionPane.showMessageDialog(null, "Data not found !!", "ERROR", JOptionPane.ERROR_MESSAGE);
		} 
		catch(SQLException e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, e, "ERROR", JOptionPane.ERROR_MESSAGE);
		}
		catch (Exception e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, e, "ERROR", JOptionPane.ERROR_MESSAGE);
		}
		return result;
	}
}
