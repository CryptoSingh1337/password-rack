/**
 * This class is created to create a GUI to get user data i.e. 
 * Password_tag and password to store in Database when a user 
 * press ADD button from HomePage i.e. from homeFrame and only 
 * trigger if user press ADD button
 */

package passwordrack.GUI.HOME;

import javax.swing.JFrame;
import passwordrack.Home.*;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JRadioButton;
import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AddFunctionality {

	protected JFrame addFunctionalityFrame;
	private JTextField passwordTagTxtField;
	private JPasswordField passwordField;
	private JTextField showPasswordLabel;
	
	/**
	 * Create the application.
	 */
	public AddFunctionality() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		addFunctionalityFrame = new JFrame();
		addFunctionalityFrame.getContentPane().setBackground(new Color(255, 255, 255));
		addFunctionalityFrame.setIconImage(Toolkit.getDefaultToolkit().getImage(AddFunctionality.class.getResource("/passwordrack/Images/AddIcon.png")));
		addFunctionalityFrame.setTitle("Add Password into Database");
		addFunctionalityFrame.setResizable(false);
		addFunctionalityFrame.setSize(350, 200);
		addFunctionalityFrame.setLocationRelativeTo(null);    						//To display JFrame at the center of the screen
		addFunctionalityFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		addFunctionalityFrame.getContentPane().setLayout(null);
		
		JLabel passwordLabel = new JLabel("Password");
		passwordLabel.setFont(new Font("Constantia", Font.PLAIN, 19));
		passwordLabel.setHorizontalAlignment(SwingConstants.CENTER);
		passwordLabel.setBounds(46, 77, 84, 20);
		addFunctionalityFrame.getContentPane().add(passwordLabel);
		
		passwordTagTxtField = new JTextField();
		passwordTagTxtField.setToolTipText("Enter a Unique tag that helps to find this password");
		passwordTagTxtField.setBounds(140, 28, 164, 20);
		addFunctionalityFrame.getContentPane().add(passwordTagTxtField);
		passwordTagTxtField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setToolTipText("Enter Password to save");
		passwordField.setColumns(10);
		passwordField.setBounds(140, 74, 164, 20);
		addFunctionalityFrame.getContentPane().add(passwordField);
		
		JRadioButton showPasswordButton = new JRadioButton("");
		showPasswordButton.addMouseListener(new MouseAdapter() {
			@SuppressWarnings("deprecation")
			@Override
			public void mousePressed(MouseEvent e) {
				showPasswordLabel.setText(passwordField.getText());
				passwordField.setVisible(false);
				showPasswordLabel.setVisible(true);
				showPasswordButton.setSelected(true);
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				passwordField.setVisible(true);
				showPasswordLabel.setVisible(false);
				showPasswordButton.setSelected(false);
			}
		});
		showPasswordButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		showPasswordButton.setToolTipText("Show Password");
		showPasswordButton.setBackground(new Color(255, 255, 255));
		showPasswordButton.setBounds(313, 74, 19, 19);
		addFunctionalityFrame.getContentPane().add(showPasswordButton);
		
		JLabel passwordTagLabel = new JLabel("Password Tag");
		passwordTagLabel.setHorizontalAlignment(SwingConstants.CENTER);
		passwordTagLabel.setFont(new Font("Constantia", Font.PLAIN, 19));
		passwordTagLabel.setBounds(10, 30, 120, 20);
		addFunctionalityFrame.getContentPane().add(passwordTagLabel);
		
		showPasswordLabel = new JTextField();
		showPasswordLabel.setColumns(10);
		showPasswordLabel.setBounds(140, 74, 164, 20);
		addFunctionalityFrame.getContentPane().add(showPasswordLabel);
		
		JButton addfunctionButton = new JButton("ADD");
		addfunctionButton.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent a) {
				String password_tag,password;
				password_tag = passwordTagTxtField.getText().trim();
				password = passwordField.getText();
				if(password_tag.isEmpty() || password.isEmpty())
				{
					JOptionPane.showMessageDialog(addFunctionalityFrame, "Invalid Data !!", "ERROR", JOptionPane.ERROR_MESSAGE);
				}
				else
				{
					int i = new DataChecking().getAddPasswordResult(password_tag, password);
					if(i==1)
						JOptionPane.showMessageDialog(null, "Same Data already exists !!", "ERROR", JOptionPane.ERROR_MESSAGE);
					else
					{
						Action obj2 = new Action();
						obj2.addAction1(password_tag, password);
						int selectedoption = JOptionPane.showConfirmDialog(addFunctionalityFrame, 
								"Do you want to add more Password?", "Confirmation", JOptionPane.YES_NO_OPTION);
						if(selectedoption==JOptionPane.NO_OPTION)
						{
							addFunctionalityFrame.setVisible(false);
							addFunctionalityFrame.dispose();
						}
					}
				}
			}
		});
		addfunctionButton.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		addfunctionButton.setBackground(new Color(192, 192, 192));
		addfunctionButton.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		addfunctionButton.setBounds(56, 119, 84, 29);
		addFunctionalityFrame.getContentPane().add(addfunctionButton);
		
		JButton clearfunctionButton = new JButton("CLEAR");
		clearfunctionButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				passwordTagTxtField.setText(null);
				passwordField.setText(null);
			}
		});
		clearfunctionButton.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		clearfunctionButton.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		clearfunctionButton.setBackground(Color.LIGHT_GRAY);
		clearfunctionButton.setBounds(220, 119, 84, 29);
		addFunctionalityFrame.getContentPane().add(clearfunctionButton);
	}
}
