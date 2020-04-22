package passwordrack.GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Toolkit;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;

import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.border.LineBorder;

public class Home {

	protected JFrame homeFrame;
     /**
	 * Create the application.
	 */
	public Home() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		homeFrame = new JFrame();
		homeFrame.setTitle("Password Rack");
		homeFrame.setIconImage(Toolkit.getDefaultToolkit().getImage(Home.class.getResource("/passwordrack/Images/Logo.jpg")));			//Main Icon
		homeFrame.getContentPane().setBackground(new Color(255, 255, 255));
		homeFrame.getContentPane().setLayout(null);
		homeFrame.setSize(600, 500);
		homeFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		homeFrame.setLocationRelativeTo(null);    				//To display JFrame at the center of the screen
		
		JPanel topPanel = new JPanel();
		topPanel.setBackground(new Color(0, 0, 0));
		topPanel.setBounds(0, 0, 586, 83);
		homeFrame.getContentPane().add(topPanel);
		topPanel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Choose An Option");
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("SansSerif", Font.PLAIN, 55));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(10, 10, 566, 63);
		topPanel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setIcon(new ImageIcon(Home.class.getResource("/passwordrack/Images/logout.png")));
		lblNewLabel_1.setBounds(534, 93, 30, 30);
		homeFrame.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("ADD");
		btnNewButton.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		btnNewButton.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		btnNewButton.setBackground(new Color(192, 192, 192));
		btnNewButton.setBounds(88, 169, 110, 40);
		homeFrame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("RETRIEVE");
		btnNewButton_1.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		btnNewButton_1.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		btnNewButton_1.setBackground(new Color(192, 192, 192));
		btnNewButton_1.setBounds(350, 169, 110, 40);
		homeFrame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("EXPORT");
		btnNewButton_2.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		btnNewButton_2.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		btnNewButton_2.setBackground(new Color(192, 192, 192));
		btnNewButton_2.setBounds(88, 307, 110, 40);
		homeFrame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("EXIT");
		btnNewButton_3.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		btnNewButton_3.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		btnNewButton_3.setBackground(new Color(192, 192, 192));
		btnNewButton_3.setBounds(350, 307, 110, 40);
		homeFrame.getContentPane().add(btnNewButton_3);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(230, 230, 250));
		panel_1.setBounds(0, 384, 586, 80);
		homeFrame.getContentPane().add(panel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(0, 82, 15, 302);
		panel_2.setBackground(new Color(230, 230, 250));
		homeFrame.getContentPane().add(panel_2);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setBounds(571, 82, 15, 302);
		panel_2_1.setBackground(new Color(230, 230, 250));
		homeFrame.getContentPane().add(panel_2_1);
		
		JLabel lblNewLabel_2 = new JLabel("Add Password into");
		lblNewLabel_2.setFont(new Font("Consolas", Font.PLAIN, 20));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(25, 109, 238, 40);
		homeFrame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_4 = new JLabel("Database");
		lblNewLabel_2_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_4.setFont(new Font("Consolas", Font.PLAIN, 20));
		lblNewLabel_2_4.setBounds(25, 130, 238, 40);
		homeFrame.getContentPane().add(lblNewLabel_2_4);
		
		JLabel lblNewLabel_2_1 = new JLabel("Retrieve Password from");
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setFont(new Font("Consolas", Font.PLAIN, 20));
		lblNewLabel_2_1.setBounds(276, 109, 250, 40);
		homeFrame.getContentPane().add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_4_1 = new JLabel("Database");
		lblNewLabel_2_4_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_4_1.setFont(new Font("Consolas", Font.PLAIN, 20));
		lblNewLabel_2_4_1.setBounds(285, 130, 238, 40);
		homeFrame.getContentPane().add(lblNewLabel_2_4_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("Export all Passwords");
		lblNewLabel_2_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_2.setFont(new Font("Consolas", Font.PLAIN, 20));
		lblNewLabel_2_2.setBounds(25, 246, 238, 40);
		homeFrame.getContentPane().add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_4_2 = new JLabel("into a txt file");
		lblNewLabel_2_4_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_4_2.setFont(new Font("Consolas", Font.PLAIN, 20));
		lblNewLabel_2_4_2.setBounds(25, 267, 238, 40);
		homeFrame.getContentPane().add(lblNewLabel_2_4_2);
		
		JLabel lblNewLabel_2_3 = new JLabel("Want nothing");
		lblNewLabel_2_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_3.setFont(new Font("Consolas", Font.PLAIN, 20));
		lblNewLabel_2_3.setBounds(285, 246, 238, 40);
		homeFrame.getContentPane().add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_2_4_3 = new JLabel("just Exit");
		lblNewLabel_2_4_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_4_3.setFont(new Font("Consolas", Font.PLAIN, 20));
		lblNewLabel_2_4_3.setBounds(285, 267, 238, 40);
		homeFrame.getContentPane().add(lblNewLabel_2_4_3);
	}
}
