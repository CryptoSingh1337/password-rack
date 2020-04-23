package passwordrack.GUI;

import java.awt.Desktop;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.net.URI;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Cursor;

import javax.swing.border.LineBorder;
import java.awt.Toolkit;

public class Open {

	public JFrame openFrame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Open window = new Open();
					window.openFrame.setVisible(true);
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
		openFrame = new JFrame("Password Rack");
		openFrame.setResizable(false);
		openFrame.setIconImage(Toolkit.getDefaultToolkit().getImage(Open.class.getResource("/passwordrack/Images/LogoIcon.png")));			//Main Icon
		openFrame.setBackground(new Color(153, 180, 209));
		openFrame.setSize(600, 500);
		openFrame.getContentPane().setLayout(null);
		openFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		openFrame.setLocationRelativeTo(null);					//To display JFrame at the center of the screen
		
		JButton btnSignup = new JButton("SignUp");
		btnSignup.setBackground(new Color(192, 192, 192));
		btnSignup.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		btnSignup.setBounds(390, 80, 160, 65);
		btnSignup.setFont(new Font("Segoe UI", Font.PLAIN, 24));
		btnSignup.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));			//Set Cursor to Hand Cursor
		btnSignup.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							SignUp window1 = new SignUp();
							window1.signupFrame.setVisible(true);
							openFrame.setVisible(false);
							openFrame.dispose();				//This Dispose method release all the memory that is consumed
						} catch (Exception e) {					//by the frame to the OS
							e.printStackTrace();
						}
					}
				});
			}
		});
		openFrame.getContentPane().add(btnSignup);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setBackground(new Color(192, 192, 192));
		btnLogin.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		btnLogin.setBounds(390, 206, 160, 65);
		btnLogin.setFont(new Font("Segoe UI", Font.PLAIN, 24));
		btnLogin.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));			//Set Cursor to Hand Cursor
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							Login window2 = new Login();
							window2.loginFrame.setVisible(true);
							openFrame.setVisible(false);
							openFrame.dispose();				//This Dispose method release all the memory that is consumed
						} catch (Exception e) {					//by the frame to the OS
							e.printStackTrace();
						}
					}
				});
			}
		});
		openFrame.getContentPane().add(btnLogin);
		
		JButton btnReadme = new JButton("Readme");
		btnReadme.setBackground(new Color(192, 192, 192));
		btnReadme.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		btnReadme.setBounds(390, 327, 160, 65);
		btnReadme.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));			//Set Cursor to Hand Cursor
		btnReadme.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Desktop.getDesktop().browse(new URI("file:///E:/Workspace/PasswordRack/File/blank.pdf"));				//This will open Readme text file
				}
				
				catch(Exception f) {
					JOptionPane.showMessageDialog(null, "Error in Opening File  !!","ERROR", JOptionPane.ERROR_MESSAGE);
				}	
			}
		});
		btnReadme.setFont(new Font("Segoe UI", Font.PLAIN, 24));
		openFrame.getContentPane().add(btnReadme);
		
		JLabel passwordLogoLbl = new JLabel("Password");
		passwordLogoLbl.setForeground(new Color(255, 255, 255));
		passwordLogoLbl.setFont(new Font("Impact", Font.PLAIN, 70));
		passwordLogoLbl.setHorizontalAlignment(SwingConstants.CENTER);
		passwordLogoLbl.setBounds(25, 55, 291, 101);
		openFrame.getContentPane().add(passwordLogoLbl);
		
		JLabel rackLogolbl = new JLabel("Rack");
		rackLogolbl.setForeground(new Color(255, 255, 255));
		rackLogolbl.setHorizontalAlignment(SwingConstants.CENTER);
		rackLogolbl.setFont(new Font("Impact", Font.PLAIN, 70));
		rackLogolbl.setBounds(25, 117, 291, 101);
		openFrame.getContentPane().add(rackLogolbl);
		
		JLabel developLbl = new JLabel("Developed By ");
		developLbl.setForeground(new Color(192, 192, 192));
		developLbl.setFont(new Font("Tahoma", Font.PLAIN, 25));
		developLbl.setHorizontalAlignment(SwingConstants.CENTER);
		developLbl.setBounds(38, 270, 258, 92);
		openFrame.getContentPane().add(developLbl);
		
		JLabel devnameLbl = new JLabel("Saransh Kumar");
		devnameLbl.setHorizontalAlignment(SwingConstants.CENTER);
		devnameLbl.setForeground(Color.LIGHT_GRAY);
		devnameLbl.setFont(new Font("Tahoma", Font.PLAIN, 35));
		devnameLbl.setBounds(38, 305, 258, 92);
		openFrame.getContentPane().add(devnameLbl);
		
		JLabel versionLbl = new JLabel("v1.0");
		versionLbl.setFont(new Font("Tahoma", Font.PLAIN, 13));
		versionLbl.setHorizontalAlignment(SwingConstants.CENTER);
		versionLbl.setBounds(549, 10, 37, 23);
		openFrame.getContentPane().add(versionLbl);
		
		JPanel leftPanel = new JPanel();
		leftPanel.setBackground(new Color(0, 0, 0));
		leftPanel.setBounds(0, 0, 343, 472);
		openFrame.getContentPane().add(leftPanel);
		
		JPanel rightPanel = new JPanel();
		rightPanel.setBackground(new Color(255, 255, 224));
		rightPanel.setBounds(343, 0, 253, 472);
		openFrame.getContentPane().add(rightPanel);
	}
}
