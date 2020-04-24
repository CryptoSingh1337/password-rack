package passwordrack.GUI.HOME;

import passwordrack.Home.Action;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.JButton;
import java.awt.Cursor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RetrieveFunctionality {

	protected JFrame retrieveFunctionalityFrame;

	/**
	 * Create the application.
	 */
	public RetrieveFunctionality() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		retrieveFunctionalityFrame = new JFrame();
		retrieveFunctionalityFrame.setResizable(false);
		retrieveFunctionalityFrame.setTitle("Retrieve Password");
		retrieveFunctionalityFrame.setIconImage(Toolkit.getDefaultToolkit().getImage(RetrieveFunctionality.class.getResource("/passwordrack/Images/RetrieveIcon.png")));
		retrieveFunctionalityFrame.getContentPane().setBackground(new Color(255, 255, 255));
		retrieveFunctionalityFrame.setBounds(100, 100, 300, 140);
		retrieveFunctionalityFrame.setLocationRelativeTo(null);
		retrieveFunctionalityFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		retrieveFunctionalityFrame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Retrieve a password");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String password_tag = JOptionPane.showInputDialog(retrieveFunctionalityFrame, "Enter Password Tag", "Input", JOptionPane.PLAIN_MESSAGE);
				password_tag.trim();
					Action obj = new Action();
					String result = obj.retrieveActionOneRecord(password_tag);
					if(result.isEmpty())
					{
						
					}
					else
						JOptionPane.showMessageDialog(retrieveFunctionalityFrame, "Password Tag :   "+password_tag.toUpperCase()+"\n        Password :   "+"\t"+result, "Result", JOptionPane.PLAIN_MESSAGE);
			}
		});
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		btnNewButton.setBackground(new Color(192, 192, 192));
		btnNewButton.setBounds(50, 10, 190, 30);
		retrieveFunctionalityFrame.getContentPane().add(btnNewButton);
		
		JButton btnRetrieveAllPassword = new JButton("Retrieve all password");
		btnRetrieveAllPassword.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnRetrieveAllPassword.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		btnRetrieveAllPassword.setBackground(new Color(192, 192, 192));
		btnRetrieveAllPassword.setBounds(50, 60, 190, 30);
		retrieveFunctionalityFrame.getContentPane().add(btnRetrieveAllPassword);
	}
}
