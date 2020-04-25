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
	public static int rows;
	private String sql;
	
	public Action()
	{
		url = "jdbc:oracle:thin:@localhost:1521:xe";
		user = "system";
		pass = "manager";
		rows = new GetNoOfRows().getNoofRowCount();
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
			connect.close();
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
			
			connect.close();
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
	
	public String[][] retrieveActionAllRecord()
	{
		String result[ ][ ]= new String[rows][2];
		String temp_passtag,temp_pass;
		try 
		{	int i = 0;
			username = Login.Username;
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection connect = DriverManager.getConnection(url,user,pass);
			sql = "select Password_Tag,Password from PasswordRackUserData where Username = '"+username+"'";
			PreparedStatement ps = connect.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE , ResultSet.CONCUR_UPDATABLE ,ResultSet.HOLD_CURSORS_OVER_COMMIT);
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
					if(rs.absolute(i+1))
					{
						temp_passtag = rs.getString(1);
						temp_pass = rs.getString(2);
						result[i][0] = temp_passtag;
						result[i][1] = temp_pass;
						i++;
					}
			}
			connect.close();
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
	
	public void deleteOnePasswords(String password_tag)
	{
		try{
			username = Login.Username;
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection connect = DriverManager.getConnection(url,user,pass);
			sql = "delete from PasswordRackUserData where Username = '"+username+"' AND Password_Tag = '"+password_tag.toUpperCase()+"'";
			PreparedStatement ps = connect.prepareStatement(sql);
			ps.execute(sql);
			
			JOptionPane.showMessageDialog(null, "Successfully deleted your Password !!", "Message", JOptionPane.PLAIN_MESSAGE);
			connect.close();
		}
		
		catch(SQLException e)
		{
			JOptionPane.showMessageDialog(null, e, "ERROR", JOptionPane.ERROR_MESSAGE);
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, e, "ERROR", JOptionPane.ERROR_MESSAGE);
		}
		
	}
	
	public void deleteAllPasswords()
	{
		try{
			username = Login.Username;
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection connect = DriverManager.getConnection(url,user,pass);
			sql = "delete from PasswordRackUserData where Username = '"+username+"'";
			PreparedStatement ps = connect.prepareStatement(sql);
			ps.execute(sql);
			
			JOptionPane.showMessageDialog(null, "Successfully deleted all Passwords !!", "Message", JOptionPane.PLAIN_MESSAGE);
			connect.close();
			}
		catch(SQLException e)
		{
			JOptionPane.showMessageDialog(null, e, "ERROR", JOptionPane.ERROR_MESSAGE);
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, e, "ERROR", JOptionPane.ERROR_MESSAGE);
		}
		
	}
}
