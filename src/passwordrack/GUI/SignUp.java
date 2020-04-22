package passwordrack.GUI;

import passwordrack.SignUp.*;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JTextField;
//import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.border.LineBorder;

import passwordrack.GUI.SignUp;

public class SignUp {

	protected JFrame signupFrame;								// make protected to access this JFrame object in other class
	private JTextField nameTxtField;							//and to make it visible
	private JTextField usernameTxtField;
	private JPasswordField passwordField;
	private JTextField emailTxtField;
	private JTextField mobilenoTxtField;
	
	/**
	 * Create the application.
	 */
	public SignUp() {
		initialize1();
	}
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize1() {
		signupFrame = new JFrame("Password Rack");
		signupFrame.setIconImage(Toolkit.getDefaultToolkit().getImage(SignUp.class.getResource("/passwordrack/Images/LogoIcon.png")));	//Main Icon
		signupFrame.getContentPane().setBackground(new Color(255, 255, 255));
		signupFrame.setSize(600,500);
		signupFrame.setResizable(false);
		signupFrame.getContentPane().setLayout(null);
		signupFrame.setLocationRelativeTo(null);   				//To display JFrame at the center of the screen
		signupFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel signupLabel = new JLabel("SignUp");		
		signupLabel.setHorizontalAlignment(SwingConstants.CENTER);
		signupLabel.setFont(new Font("SansSerif", Font.BOLD, 45));
		signupLabel.setBounds(27, 45, 160, 76);
		signupFrame.getContentPane().add(signupLabel);
		
		JLabel signupIcon = new JLabel("");						
		signupIcon.setIcon(new ImageIcon(SignUp.class.getResource("/passwordrack/Images/SignUpIcon.png")));			//SignUp Icon
		signupIcon.setBounds(27, 191, 160, 160);
		signupFrame.getContentPane().add(signupIcon);
		
		JLabel createAccLabel = new JLabel("Create Your Account");
		createAccLabel.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		createAccLabel.setBackground(new Color(245, 245, 245));
		createAccLabel.setFont(new Font("Segoe UI Semilight", Font.BOLD, 36));
		createAccLabel.setHorizontalAlignment(SwingConstants.CENTER);
		createAccLabel.setBounds(228, 10, 356, 70);
		signupFrame.getContentPane().add(createAccLabel);
		
		JLabel nameLabel = new JLabel("Name");
		nameLabel.setHorizontalAlignment(SwingConstants.TRAILING);
		nameLabel.setFont(new Font("Consolas", Font.PLAIN, 24));
		nameLabel.setBounds(258, 100, 110, 28);
		signupFrame.getContentPane().add(nameLabel);
		
		JLabel usernameLabel = new JLabel("Username");
		usernameLabel.setHorizontalAlignment(SwingConstants.TRAILING);
		usernameLabel.setFont(new Font("Consolas", Font.PLAIN, 24));
		usernameLabel.setBounds(258, 145, 110, 28);
		signupFrame.getContentPane().add(usernameLabel);
		
		JLabel passwordLabel = new JLabel("Password");
		passwordLabel.setHorizontalAlignment(SwingConstants.TRAILING);
		passwordLabel.setFont(new Font("Consolas", Font.PLAIN, 24));
		passwordLabel.setBounds(258, 195, 110, 28);
		signupFrame.getContentPane().add(passwordLabel);
		
		JLabel emailLabel = new JLabel("E-mail");
		emailLabel.setHorizontalAlignment(SwingConstants.TRAILING);
		emailLabel.setFont(new Font("Consolas", Font.PLAIN, 24));
		emailLabel.setBounds(258, 243, 110, 28);
		signupFrame.getContentPane().add(emailLabel);
		
		JLabel mobilenoLabel = new JLabel("Mobile No.");
		mobilenoLabel.setHorizontalAlignment(SwingConstants.TRAILING);
		mobilenoLabel.setFont(new Font("Consolas", Font.PLAIN, 24));
		mobilenoLabel.setBounds(228, 293, 140, 28);
		signupFrame.getContentPane().add(mobilenoLabel);
		
		nameTxtField = new JTextField();
		nameTxtField.addKeyListener(new KeyAdapter() {
			@Override											//This method is used to move pointer
			public void keyPressed(KeyEvent e) {				//to next TextField when the user press
				if(e.getKeyCode()==KeyEvent.VK_ENTER)			//'ENTER' Key
					usernameTxtField.requestFocus();
				}
		});
		nameTxtField.setColumns(10);
		nameTxtField.setBounds(391, 100, 181, 22);
		nameTxtField.setToolTipText("Enter your name");			//Shows a tip when user point on that label
		signupFrame.getContentPane().add(nameTxtField);
		
		usernameTxtField = new JTextField();
		usernameTxtField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {				//This method is used to move pointer
				if(e.getKeyCode()==KeyEvent.VK_ENTER)			//to next TextField when the user press
					passwordField.requestFocus();				//'ENTER' Key
				}
		});
		usernameTxtField.setColumns(10);
		usernameTxtField.setBounds(391, 145, 181, 22);
		usernameTxtField.setToolTipText("<html>Enter your Username<br>and it must be unique</html>");			//Shows a tip when user point on that label
		signupFrame.getContentPane().add(usernameTxtField);
		
		passwordField = new JPasswordField();
		passwordField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {				//This method is used to move pointer
				if(e.getKeyCode()==KeyEvent.VK_ENTER)			//to next TextField when the user press
					emailTxtField.requestFocus();				//'ENTER' Key
				}
		});
		passwordField.setColumns(10);
		passwordField.setBounds(391, 195, 181, 22);
		passwordField.setToolTipText("Enter your password");			//Shows a tip when user point on that label
		signupFrame.getContentPane().add(passwordField);
		
		emailTxtField = new JTextField();
		emailTxtField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {				//This method is used to move pointer
				if(e.getKeyCode()==KeyEvent.VK_ENTER)			//to next TextField when the user press
					mobilenoTxtField.requestFocus();			//'ENTER' Key
				}
		});
		emailTxtField.setColumns(10);
		emailTxtField.setBounds(391, 243, 181, 22);
		emailTxtField.setToolTipText("Enter your E-mail ID");			//Shows a tip when user point on that label
		signupFrame.getContentPane().add(emailTxtField);
		
		mobilenoTxtField = new JTextField();
		mobilenoTxtField.setColumns(10);
		mobilenoTxtField.setBounds(391, 293, 181, 22);
		mobilenoTxtField.setToolTipText("Enter your mobile number");			//Shows a tip when user point on that label
		signupFrame.getContentPane().add(mobilenoTxtField);
		
		JLabel passwordTipLabel = new JLabel("<html><ul>" + 	//This HTML script used to show Password tips inside Label
				"<li>Password must contain at least 8 characters</li>" + 
				"<li>Password must contain an uppercase letter</li>" + 
				"<li>Password must contain an lowercase letter</li>" + 
				"</ul></html>");
		passwordTipLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		passwordTipLabel.setHorizontalAlignment(SwingConstants.CENTER);
		passwordTipLabel.setBounds(228, 331, 356, 68);
		signupFrame.getContentPane().add(passwordTipLabel);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.setBackground(new Color(192, 192, 192));
		btnNewButton.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name,username,email,mobileno;
				String password;
				name = nameTxtField.getText().trim();			//Trim is used to remove Spaces from string that we get from TxtFields
				username = usernameTxtField.getText().trim();
				password = passwordField.getText();
				email = emailTxtField.getText().trim();
				mobileno = mobilenoTxtField.getText().trim();
				if(name.isEmpty() || username.isEmpty() || email.isEmpty() || mobileno.isEmpty() || password.isEmpty())			//This if condition checks whether the textfields are empty or not
				{																											
					JOptionPane.showMessageDialog(signupFrame,"Invalid Data  !!");
				}
				else if(mobileno.length()>10)					//This condition checks whether the mobileno is not more than 10 digits
				{
						JOptionPane.showMessageDialog(signupFrame,"Mobile Number exceeds 10 digits  !!");
				}
				else
				{
						SignUpDataSaving obj = new SignUpDataSaving();
						obj.setDataSubmit(name,username,password,email,mobileno);
				}
			}
		});
		btnNewButton.setFont(new Font("Segoe UI", Font.PLAIN, 24));
		btnNewButton.setBounds(289, 422, 110, 30);
		signupFrame.getContentPane().add(btnNewButton);
		
		JButton btnBack = new JButton("Back");
		btnBack.setBackground(new Color(192, 192, 192));
		btnBack.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							signupFrame.setVisible(false);
							Open window = new Open();
							window.openFrame.setVisible(true);
							signupFrame.dispose();				//This Dispose method release all the memory that is consumed
						} catch (Exception e) {					//by the frame to the OS
							e.printStackTrace();
						}
					}
				});
			}
		});
		btnBack.setFont(new Font("Segoe UI", Font.PLAIN, 24));
		btnBack.setBounds(452, 422, 110, 30);
		signupFrame.getContentPane().add(btnBack);
		
		JPanel leftpanel = new JPanel();						//used for background color (Dark Grey)
		leftpanel.setBorder(null);
		leftpanel.setBackground(new Color(105, 105, 105));
		leftpanel.setBounds(0, 0, 214, 410);
		signupFrame.getContentPane().add(leftpanel);
		
		JPanel lowerpanel = new JPanel();						//used for background (Light Grey)
		lowerpanel.setBorder(null);
		lowerpanel.setBackground(new Color(230, 230, 250));
		lowerpanel.setBounds(0, 409, 596, 63);
		signupFrame.getContentPane().add(lowerpanel);
	}
}
	
