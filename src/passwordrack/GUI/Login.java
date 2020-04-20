package passwordrack.GUI;

import passwordrack.Login.LoginValidation;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.SwingConstants;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Toolkit;

public class Login {

	protected JFrame frame2;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
/*	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.frame2.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

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
		frame2 = new JFrame();
		frame2.setIconImage(Toolkit.getDefaultToolkit().getImage(Login.class.getResource("/passwordrack/Images/Logo.jpg")));
		frame2.setTitle("Password Rack");
		frame2.setBounds(100, 100, 400, 400);
		frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame2.getContentPane().setLayout(null);
		frame2.setResizable(false);
		
		JLabel lblNewLabel = new JLabel("LOGIN");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 35));
		lblNewLabel.setBounds(144, 27, 110, 50);
		frame2.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Username");
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(39, 121, 94, 22);
		frame2.getContentPane().add(lblNewLabel_1);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Arial", Font.PLAIN, 20));
		lblPassword.setBounds(39, 207, 94, 22);
		frame2.getContentPane().add(lblPassword);
		
		textField =new JTextField();
		textField.setBounds(179, 121, 181, 22);
		frame2.getContentPane().add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setColumns(10);
		passwordField.setBounds(179, 207, 181, 22);
		frame2.getContentPane().add(passwordField);
		
		JButton btnNewButton= new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String pass,username1;
				int i;
				username1 = textField.getText().trim();
				pass = passwordField.getText();
				LoginValidation obj = new LoginValidation();
				i = obj.checkValidation(username1,pass);
				if(i == 1)
					JOptionPane.showMessageDialog(frame2, "Login Successful!!");
				else
					JOptionPane.showMessageDialog(frame2, "Login UnSuccessful!!");
			}
		});
		btnNewButton.setBounds(255, 277, 104, 37);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		frame2.getContentPane().add(btnNewButton);
		
		JButton btnBack = new JButton("Back");
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							frame2.setVisible(false);
							Open window = new Open();
							window.frame.setVisible(true);
							frame2.dispose();
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnBack.setBounds(41, 277, 104, 37);
		frame2.getContentPane().add(btnBack);
		
		frame2.setLocationRelativeTo(null);    //To display JFrame at the center of the screen
	}
}
