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
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.border.LineBorder;

import passwordrack.GUI.SignUp;

public class SignUp {

	protected JFrame frame1;		// make protected to access this JFrame object in other class and to make it visibl_1;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_4;
	private JTextField textField_5;
	private JPasswordField passwordField_3;
	
	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignUp window = new SignUp();
					window.frame1.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/
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
		frame1 = new JFrame("Password Rack");
		frame1.setIconImage(Toolkit.getDefaultToolkit().getImage(SignUp.class.getResource("/passwordrack/Images/Logo.jpg")));
		frame1.getContentPane().setBackground(new Color(255, 255, 255));
		frame1.setSize(600,500);
		frame1.setResizable(false);	
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame1.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("SignUp");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("SansSerif", Font.BOLD, 45));
		lblNewLabel.setBounds(27, 45, 160, 76);
		frame1.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel_1.setFont(new Font("Consolas", Font.PLAIN, 24));
		lblNewLabel_1.setBounds(258, 130, 110, 28);
		frame1.getContentPane().add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBorder(new LineBorder(new Color(171, 173, 179)));
		textField_1.setBounds(391, 130, 181, 20);
		frame1.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(391, 175, 181, 22);
		frame1.getContentPane().add(textField_2);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setHorizontalAlignment(SwingConstants.TRAILING);
		lblUsername.setFont(new Font("Consolas", Font.PLAIN, 24));
		lblUsername.setBounds(258, 175, 110, 28);
		frame1.getContentPane().add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setHorizontalAlignment(SwingConstants.TRAILING);
		lblPassword.setFont(new Font("Consolas", Font.PLAIN, 24));
		lblPassword.setBounds(258, 225, 110, 28);
		frame1.getContentPane().add(lblPassword);
		
		JLabel lblEmail = new JLabel("E-mail");
		lblEmail.setHorizontalAlignment(SwingConstants.TRAILING);
		lblEmail.setFont(new Font("Consolas", Font.PLAIN, 24));
		lblEmail.setBounds(258, 273, 110, 28);
		frame1.getContentPane().add(lblEmail);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(391, 273, 181, 22);
		frame1.getContentPane().add(textField_4);
		
		JLabel lblMobileNo = new JLabel("Mobile No.");
		lblMobileNo.setHorizontalAlignment(SwingConstants.TRAILING);
		lblMobileNo.setFont(new Font("Consolas", Font.PLAIN, 24));
		lblMobileNo.setBounds(228, 323, 140, 28);
		frame1.getContentPane().add(lblMobileNo);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(391, 323, 181, 22);
		frame1.getContentPane().add(textField_5);
		
		passwordField_3 = new JPasswordField();
		passwordField_3.setBounds(391, 225, 181, 22);
		frame1.getContentPane().add(passwordField_3);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.setBackground(new Color(192, 192, 192));
		btnNewButton.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name,username,email,mobileno;
				String password;
				name = textField_1.getText();
				username = textField_2.getText();
				password = passwordField_3.getText();
				email = textField_4.getText();
				mobileno = textField_5.getText();
				if(name.isEmpty() || username.isEmpty() || email.isEmpty() || mobileno.isEmpty() || password.isEmpty())
					JOptionPane.showMessageDialog(frame1,"Invalid Data!!");
				else
				{
				SignUpDataSaving obj = new SignUpDataSaving();
				obj.setDataSubmit(name,username,password,email,mobileno);
				}
			}
		});
		btnNewButton.setFont(new Font("Segoe UI", Font.PLAIN, 28));
		btnNewButton.setBounds(441, 388, 120, 40);
		frame1.getContentPane().add(btnNewButton);
		
		JButton btnBack = new JButton("Back");
		btnBack.setBackground(new Color(192, 192, 192));
		btnBack.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							frame1.setVisible(false);
							Open window = new Open();
							window.frame.setVisible(true);
							frame1.dispose();
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		btnBack.setFont(new Font("Segoe UI", Font.PLAIN, 28));
		btnBack.setBounds(258, 388, 120, 40);
		frame1.getContentPane().add(btnBack);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(SignUp.class.getResource("/passwordrack/Images/Registered User.png")));
		lblNewLabel_2.setBounds(27, 191, 160, 160);
		frame1.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Create Your Account");
		lblNewLabel_3.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		lblNewLabel_3.setBackground(new Color(245, 245, 245));
		lblNewLabel_3.setFont(new Font("Segoe UI Semilight", Font.BOLD, 36));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(228, 23, 352, 70);
		frame1.getContentPane().add(lblNewLabel_3);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(105, 105, 105));
		panel.setBounds(0, 0, 214, 472);
		frame1.getContentPane().add(panel);
		
		frame1.setLocationRelativeTo(null);   //To display JFrame at the center of screen
	}
}
	
