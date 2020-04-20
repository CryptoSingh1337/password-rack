package passwordrack.GUI;

//import passwordrack.GUI.SignUp;
//import passwordrack.GUI.Login;

import java.awt.Desktop;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.border.LineBorder;
import java.awt.Toolkit;

public class Open {

	protected JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Open window = new Open();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Open() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Password Rack");
		frame.setResizable(false);
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(Open.class.getResource("/passwordrack/Images/Logo.jpg")));
		frame.setBackground(new Color(153, 180, 209));
		frame.setSize(600, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnSignup = new JButton("SignUp");
		btnSignup.setBackground(new Color(192, 192, 192));
		btnSignup.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		btnSignup.setBounds(390, 80, 160, 65);
		btnSignup.setFont(new Font("Segoe UI", Font.PLAIN, 24));
		btnSignup.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							SignUp window1 = new SignUp();
							window1.frame1.setVisible(true);
							frame.setVisible(false);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		frame.getContentPane().add(btnSignup);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setBackground(new Color(192, 192, 192));
		btnLogin.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		btnLogin.setBounds(390, 206, 160, 65);
		btnLogin.setFont(new Font("Segoe UI", Font.PLAIN, 24));
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							Login window2 = new Login();
							window2.frame2.setVisible(true);
							frame.setVisible(false);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		frame.getContentPane().add(btnLogin);
		
		JButton btnReadme = new JButton("Readme");
		btnReadme.setBackground(new Color(192, 192, 192));
		btnReadme.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		btnReadme.setBounds(390, 327, 160, 65);
		btnReadme.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Desktop.getDesktop().open(new java.io.File("File/readme.txt"));
				}
				
				catch(Exception f) {
					JOptionPane.showMessageDialog(null, "Error in Opening File  !!");
				}	
			}
		});
		btnReadme.setFont(new Font("Segoe UI", Font.PLAIN, 24));
		frame.getContentPane().add(btnReadme);
		
		JLabel label = new JLabel("Password");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Impact", Font.PLAIN, 70));
		
		JLabel label_1 = new JLabel("Password");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setForeground(Color.WHITE);
		label_1.setFont(new Font("Impact", Font.PLAIN, 70));
		
		JLabel lblNewLabel = new JLabel("Password");
		lblNewLabel.setForeground(new Color(255, 255, 224));
		lblNewLabel.setFont(new Font("Impact", Font.PLAIN, 70));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(25, 55, 291, 101);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblRack = new JLabel("Rack");
		lblRack.setForeground(new Color(255, 255, 224));
		lblRack.setHorizontalAlignment(SwingConstants.CENTER);
		lblRack.setFont(new Font("Impact", Font.PLAIN, 70));
		lblRack.setBounds(25, 117, 291, 101);
		frame.getContentPane().add(lblRack);
		
		JLabel lblNewLabel_1 = new JLabel("Developed By ");
		lblNewLabel_1.setForeground(new Color(192, 192, 192));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(38, 270, 258, 92);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblSaranshKumar = new JLabel("Saransh Kumar");
		lblSaranshKumar.setHorizontalAlignment(SwingConstants.CENTER);
		lblSaranshKumar.setForeground(Color.LIGHT_GRAY);
		lblSaranshKumar.setFont(new Font("Tahoma", Font.PLAIN, 35));
		lblSaranshKumar.setBounds(38, 305, 258, 92);
		frame.getContentPane().add(lblSaranshKumar);
		
		JLabel lblNewLabel_2 = new JLabel("v1.0");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(549, 10, 37, 23);
		frame.getContentPane().add(lblNewLabel_2);
		
		JPanel left = new JPanel();
		left.setBackground(new Color(0, 0, 0));
		left.setBounds(0, 0, 343, 472);
		frame.getContentPane().add(left);
		
		JPanel right = new JPanel();
		right.setBackground(new Color(255, 255, 224));
		right.setBounds(343, 0, 253, 472);
		frame.getContentPane().add(right);
		
		frame.setLocationRelativeTo(null);   //To display JFrame at the center of the screen
		
	}
}
