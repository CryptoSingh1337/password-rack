package passwordrack.Home;

import passwordrack.GUI.Login;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class GetNoOfRows {
	
	private static String url;
	private static String user;
	private static String pass;
	private static String username;
	private String sql;
	
	public GetNoOfRows()
	{
		url = "jdbc:oracle:thin:@localhost:1521:xe";
		user = "system";
		pass = "manager";
	}
	
	public int getNoofRowCount() 
	{
		int count = 0;
		try 
		{
			username = Login.Username;
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection connect = DriverManager.getConnection(url,user,pass);
			sql = "select * from PasswordRackUserData where Username = '"+username+"'";
			PreparedStatement ps = connect.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next())
				count++;
			
			connect.close();
		} 
		catch(SQLException e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Data not found !!", "ERROR", JOptionPane.ERROR_MESSAGE);
		}
		catch (Exception e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, e, "ERROR", JOptionPane.ERROR_MESSAGE);
		}
		
		return count;
	}
}
