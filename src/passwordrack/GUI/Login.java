package passwordrack.GUI;

import passwordrack.Login.LoginValidation;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Toolkit;

public class Login {

	protected JFrame loginFrame;										// make protected to access this JFrame object in other class
	private JTextField usernameTxtField;								//and to make it visible
	private JPasswordField passwordField;

	 /**
	 * Create the application.
	 */
	public Login() {
		initialize();
	}
	 /**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		loginFrame = new JFrame();
		loginFrame.setIconImage(Toolkit.getDefaultToolkit().getImage(Login.class.getResource("/passwordrack/Images/Logo.jpg")));	//Main Icon
		loginFrame.setTitle("Password Rack");
		loginFrame.setBounds(0, -28, 600, 500);
		loginFrame.getContentPane().setBackground(new Color(255, 255, 255));
		loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		loginFrame.setResizable(false);
		loginFrame.getContentPane().setLayout(null);
		
		JLabel loginLabel = new JLabel("Login");
		loginLabel.setBounds(27, 45, 160, 76);
		loginLabel.setHorizontalAlignment(SwingConstants.CENTER);
		loginLabel.setFont(new Font("SansSerif", Font.BOLD, 45));
		loginFrame.getContentPane().add(loginLabel);
		
		JLabel loginIcon = new JLabel("");
		loginIcon.setBounds(27, 191, 160, 160);
		loginIcon.setIcon(new ImageIcon(Login.class.getResource("/passwordrack/Images/Login.png")));			//Login Icon
		loginFrame.getContentPane().add(loginIcon);
		
		JLabel loginAccLabel = new JLabel("Login Your Account");
		loginAccLabel.setBounds(230, 129, 352, 70);
		loginAccLabel.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		loginAccLabel.setBackground(new Color(245, 245, 245));
		loginAccLabel.setFont(new Font("Segoe UI Semilight", Font.BOLD, 36));
		loginAccLabel.setHorizontalAlignment(SwingConstants.CENTER);
		loginFrame.getContentPane().add(loginAccLabel);
		
		JLabel usernameLabel = new JLabel("Username");
		usernameLabel.setHorizontalAlignment(SwingConstants.TRAILING);
		usernameLabel.setBounds(247, 253, 110, 28);
		usernameLabel.setFont(new Font("Consolas", Font.PLAIN, 24));
		loginFrame.getContentPane().add(usernameLabel);
		
		JLabel passwordLabel = new JLabel("Password");
		passwordLabel.setBounds(247, 321, 110, 28);
		passwordLabel.setHorizontalAlignment(SwingConstants.TRAILING);
		passwordLabel.setFont(new Font("Consolas", Font.PLAIN, 24));
		loginFrame.getContentPane().add(passwordLabel);
		
		usernameTxtField =new JTextField();
		usernameTxtField.addKeyListener(new KeyAdapter() {
			@Override													//This method is used to move pointer
			public void keyPressed(KeyEvent e) {						//to next TextField when the user press
				if(e.getKeyCode()==KeyEvent.VK_ENTER)					//'ENTER' Key
					passwordField.requestFocus();
				}
		});
		usernameTxtField.setBounds(387, 253, 181, 22);
		usernameTxtField.setColumns(10);
		loginFrame.getContentPane().add(usernameTxtField);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(387, 321, 181, 22);
		passwordField.setColumns(10);
		loginFrame.getContentPane().add(passwordField);
		
		JButton btnNewButton= new JButton("Submit");
		btnNewButton.setBackground(new Color(192, 192, 192));			//This color defines as 'Lower Buttons color'
		btnNewButton.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String pass,username1;
				int i;
				username1 = usernameTxtField.getText().trim();			//Trim is used to remove Spaces from string that we get from TxtFields
				pass = passwordField.getText();
				LoginValidation obj = new LoginValidation();
				if(username1.isEmpty() || pass.isEmpty())				//This if condition checks whether the textfields are empty or not
				{
					JOptionPane.showMessageDialog(loginFrame,"Invalid Data  !!");
				}
				else
				{
					i = obj.checkValidation(username1,pass);			//This method checkValidation return an integer
					if(i == 1)
						{
							JOptionPane.showMessageDialog(loginFrame, "Login Successful  !!");
						
							loginFrame.setVisible(false);
							Home window = new Home();
							window.homeFrame.setVisible(true);
							loginFrame.dispose();
						}
					else
						JOptionPane.showMessageDialog(loginFrame, "Login Unsuccessful  !!");
				}
				
			}
		});
		btnNewButton.setFont(new Font("Segoe UI", Font.PLAIN, 24));
		btnNewButton.setBounds(289, 422, 110, 30);
		loginFrame.getContentPane().add(btnNewButton);
		
		JButton btnBack = new JButton("Back");
		btnBack.setBackground(new Color(192, 192, 192));				//This color defines as 'Lower Buttons color'
		btnBack.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							loginFrame.setVisible(false);
							Open window = new Open();
							window.openFrame.setVisible(true);
							loginFrame.dispose();						//This Dispose method release all the memory that is consumed
						} catch (Exception e) {							//by the frame to the OS
							e.printStackTrace();
						}
					}
				});
			}
		});
		btnBack.setFont(new Font("Segoe UI", Font.PLAIN, 24));
		btnBack.setBounds(452, 422, 110, 30);
		loginFrame.getContentPane().add(btnBack);
		
		JPanel leftPanel = new JPanel();								//used for background color (Dark Grey)
		leftPanel.setBounds(0, 0, 214, 410);
		leftPanel.setBorder(null);
		leftPanel.setBackground(new Color(105, 105, 105));
		loginFrame.getContentPane().add(leftPanel);
		
		JPanel lowerPanel = new JPanel();								//used for background color (Light Grey)
		lowerPanel.setBounds(0, 409, 596, 63);
		lowerPanel.setBorder(null);
		lowerPanel.setBackground(new Color(230, 230, 250));
		loginFrame.getContentPane().add(lowerPanel);
		
		JPanel topPanel = new JPanel();
		topPanel.setBackground(new Color(0, 0, 0));
		topPanel.setBounds(213, 0, 383, 70);
		loginFrame.getContentPane().add(topPanel);
		
		loginFrame.setLocationRelativeTo(null);    						//To display JFrame at the center of the screen
	}
}
