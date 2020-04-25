package passwordrack.GUI.HOME;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import passwordrack.Home.Action;

public class DeleteFunctionality {

	protected JFrame deleteFunctionailtyFrame;

	/**
	 * Create the application.
	 */
	public DeleteFunctionality() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		deleteFunctionailtyFrame = new JFrame();
		deleteFunctionailtyFrame.setResizable(false);
		deleteFunctionailtyFrame.setTitle("Delete Password");
		deleteFunctionailtyFrame.setIconImage(Toolkit.getDefaultToolkit().getImage(RetrieveFunctionality.class.getResource("/passwordrack/Images/RetrieveIcon.png")));
		deleteFunctionailtyFrame.getContentPane().setBackground(new Color(255, 255, 255));
		deleteFunctionailtyFrame.setBounds(100, 100, 300, 140);
		deleteFunctionailtyFrame.setLocationRelativeTo(null);
		deleteFunctionailtyFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		deleteFunctionailtyFrame.getContentPane().setLayout(null);
		
		JButton btnDeleteAPassword = new JButton("Delete a Password");
		btnDeleteAPassword.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String password_tag = JOptionPane.showInputDialog(deleteFunctionailtyFrame, "Enter Password Tag", "Input", JOptionPane.PLAIN_MESSAGE);
				password_tag.trim();
				Action obj = new Action();
				obj.deleteOnePasswords(password_tag);
			}
		});
		btnDeleteAPassword.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnDeleteAPassword.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		btnDeleteAPassword.setBackground(new Color(192, 192, 192));
		btnDeleteAPassword.setBounds(50, 10, 190, 30);
		deleteFunctionailtyFrame.getContentPane().add(btnDeleteAPassword);
		
		JButton btnDeleteAllPassword = new JButton("Delete all Passwords");
		btnDeleteAllPassword.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int selectedoption = JOptionPane.showConfirmDialog(deleteFunctionailtyFrame, 
						"Do you want to delete all Passwords?", "Confirmation", JOptionPane.YES_NO_OPTION);
				if(selectedoption==JOptionPane.YES_OPTION) 
				{
					Action obj = new Action();
					obj.deleteAllPasswords();
				}
			}
		});
		btnDeleteAllPassword.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnDeleteAllPassword.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		btnDeleteAllPassword.setBackground(new Color(192, 192, 192));
		btnDeleteAllPassword.setBounds(50, 60, 190, 30);
		deleteFunctionailtyFrame.getContentPane().add(btnDeleteAllPassword);
	}

}
