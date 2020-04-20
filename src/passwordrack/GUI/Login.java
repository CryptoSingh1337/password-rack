package passwordrack.GUI;

import passwordrack.Login.LoginValidation;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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

	protected JFrame frame2;
	private JTextField textField;
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
		frame2 = new JFrame();
		frame2.setIconImage(Toolkit.getDefaultToolkit().getImage(Login.class.getResource("/passwordrack/Images/Logo.jpg")));
		frame2.setTitle("Password Rack");
		frame2.setBounds(0, -28, 600, 500);
		frame2.getContentPane().setBackground(new Color(255, 255, 255));
		frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame2.setResizable(false);
		frame2.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Login");
		lblNewLabel.setBounds(27, 45, 160, 76);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("SansSerif", Font.BOLD, 45));
		frame2.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Username");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel_1.setBounds(251, 155, 110, 28);
		lblNewLabel_1.setFont(new Font("Consolas", Font.PLAIN, 24));
		frame2.getContentPane().add(lblNewLabel_1);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(251, 223, 110, 28);
		lblPassword.setHorizontalAlignment(SwingConstants.TRAILING);
		lblPassword.setFont(new Font("Consolas", Font.PLAIN, 24));
		frame2.getContentPane().add(lblPassword);
		
		textField =new JTextField();
		textField.setBounds(391, 155, 181, 22);
		frame2.getContentPane().add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(391, 223, 181, 22);
		passwordField.setColumns(10);
		frame2.getContentPane().add(passwordField);
		
		JButton btnNewButton= new JButton("Submit");
		btnNewButton.setBackground(new Color(192, 192, 192));
		btnNewButton.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String pass,username1;
				int i;
				username1 = textField.getText().trim();
				pass = passwordField.getText();
				LoginValidation obj = new LoginValidation();
				if(username1.isEmpty() || pass.isEmpty())
				{
					JOptionPane.showMessageDialog(frame2,"Invalid Data  !!");
				}
				else
				{
					i = obj.checkValidation(username1,pass);
					if(i == 1)
						JOptionPane.showMessageDialog(frame2, "Login Successful  !!");
					else
						JOptionPane.showMessageDialog(frame2, "Login Unsuccessful  !!");
				}
			}
		});
		btnNewButton.setFont(new Font("Segoe UI", Font.PLAIN, 24));
		btnNewButton.setBounds(289, 422, 110, 30);
		frame2.getContentPane().add(btnNewButton);
		
		JButton btnBack = new JButton("Back");
		btnBack.setBackground(new Color(192, 192, 192));
		btnBack.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
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
		btnBack.setFont(new Font("Segoe UI", Font.PLAIN, 24));
		btnBack.setBounds(452, 422, 110, 30);
		frame2.getContentPane().add(btnBack);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(27, 191, 160, 160);
		lblNewLabel_2.setIcon(new ImageIcon(SignUp.class.getResource("/passwordrack/Images/Login.png")));
		frame2.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Login Your Account");
		lblNewLabel_3.setBounds(228, 32, 352, 70);
		lblNewLabel_3.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		lblNewLabel_3.setBackground(new Color(245, 245, 245));
		lblNewLabel_3.setFont(new Font("Segoe UI Semilight", Font.BOLD, 36));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		frame2.getContentPane().add(lblNewLabel_3);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 214, 410);
		panel.setBorder(null);
		panel.setBackground(new Color(105, 105, 105));
		frame2.getContentPane().add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 409, 596, 63);
		panel_1.setBorder(null);
		panel_1.setBackground(new Color(230, 230, 250));
		frame2.getContentPane().add(panel_1);
		
		JLabel lblNewLabel_4 = new JLabel("<html><ul>" + 
										"<li>Password must contain at least 8 characters</li>" + 
										"<li>Password must contain an uppercase letter</li>" + 
										"<li>Password must contain an lowercase letter</li>" + 
										"</ul></html>");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_4.setBounds(228, 276, 344, 95);
		frame2.getContentPane().add(lblNewLabel_4);
		
		frame2.setLocationRelativeTo(null);    //To display JFrame at the center of the screen
	}
}
