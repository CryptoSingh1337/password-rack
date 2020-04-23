package passwordrack.GUI.HOME;

import java.awt.EventQueue;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Toolkit;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.border.LineBorder;

import passwordrack.GUI.Open;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Home {

	public JFrame homeFrame;
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
		homeFrame.setIconImage(Toolkit.getDefaultToolkit().getImage(Home.class.getResource("/passwordrack/Images/LogoIcon.png")));			//Main Icon
		homeFrame.getContentPane().setBackground(new Color(230, 230, 250));
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
		
		JLabel logoutIcon = new JLabel("");
		logoutIcon.setToolTipText("Logout");
		logoutIcon.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
					EventQueue.invokeLater(new Runnable() {
						public void run() {
							try 
							{
								Open window = new Open();
								window.openFrame.setVisible(true);
								homeFrame.setVisible(false);
								homeFrame.dispose();
							} 
							catch (Exception e) 
							{
							e.printStackTrace();
							}
						}
					});
				}
		});
		logoutIcon.setVerticalAlignment(SwingConstants.TOP);
		logoutIcon.setHorizontalAlignment(SwingConstants.RIGHT);
		logoutIcon.setIcon(new ImageIcon(Home.class.getResource("/passwordrack/Images/LogoutIcon.png")));
		logoutIcon.setBounds(534, 89, 30, 30);
		logoutIcon.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));			//Set Cursor to Hand Cursor
		homeFrame.getContentPane().add(logoutIcon);
		
		JButton addButton = new JButton("ADD");
		addButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddFunctionality window = new AddFunctionality();
				window.addFunctionalityFrame.setVisible(true);
			}
		});
		addButton.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		addButton.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		addButton.setBackground(new Color(128, 128, 128));
		addButton.setBounds(88, 181, 110, 40);
		addButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));			//Set Cursor to Hand Cursor
		homeFrame.getContentPane().add(addButton);
		
		JButton retrieveButton = new JButton("RETRIEVE");
		retrieveButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//	Retrieve window = new Retrieve();
			//	window.retrieveFrame.setVisible(true);
			}
		});
		retrieveButton.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		retrieveButton.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		retrieveButton.setBackground(new Color(128, 128, 128));
		retrieveButton.setBounds(388, 181, 110, 40);
		retrieveButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));			//Set Cursor to Hand Cursor
		homeFrame.getContentPane().add(retrieveButton);
		
		JButton exportButton = new JButton("EXPORT");
		exportButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//	Export window = new Export();
			//	window.exportFrame.setVisible(true);
			}
		});
		exportButton.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		exportButton.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		exportButton.setBackground(new Color(128, 128, 128));
		exportButton.setBounds(88, 287, 110, 40);
		exportButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));			//Set Cursor to Hand Cursor
		homeFrame.getContentPane().add(exportButton);
		
		JButton deleteButton = new JButton("DELETE");
		deleteButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//	Delete window = new Delete();
			//	window.deleteFrame.setVisible(true);
			}
		});
		deleteButton.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		deleteButton.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		deleteButton.setBackground(new Color(128, 128, 128));
		deleteButton.setBounds(388, 287, 110, 40);
		deleteButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));			//Set Cursor to Hand Cursor
		homeFrame.getContentPane().add(deleteButton);
		
		JButton exitButton = new JButton("EXIT");
		exitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int selectedoption = JOptionPane.showConfirmDialog(homeFrame, 
						"Do you want to Exit?", "Confirmation", JOptionPane.YES_NO_OPTION);
				if(selectedoption==JOptionPane.YES_OPTION)
				{
					System.exit(0);
				}
			}
		});
		exitButton.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		exitButton.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		exitButton.setBackground(new Color(128, 128, 128));
		exitButton.setBounds(239, 378, 110, 40);
		exitButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));			//Set Cursor to Hand Cursor
		homeFrame.getContentPane().add(exitButton);
		
		JLabel addLabel_1 = new JLabel("Add Password into");
		addLabel_1.setFont(new Font("Consolas", Font.PLAIN, 20));
		addLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		addLabel_1.setBounds(25, 121, 238, 40);
		homeFrame.getContentPane().add(addLabel_1);
		
		JLabel addLabel_2 = new JLabel("Database");
		addLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		addLabel_2.setFont(new Font("Consolas", Font.PLAIN, 20));
		addLabel_2.setBounds(25, 142, 238, 40);
		homeFrame.getContentPane().add(addLabel_2);
		
		JLabel retrieveLabel_1 = new JLabel("Retrieve Password");
		retrieveLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		retrieveLabel_1.setFont(new Font("Consolas", Font.PLAIN, 20));
		retrieveLabel_1.setBounds(314, 121, 250, 40);
		homeFrame.getContentPane().add(retrieveLabel_1);
		
		JLabel retrieveLabel_2 = new JLabel("from Database");
		retrieveLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		retrieveLabel_2.setFont(new Font("Consolas", Font.PLAIN, 20));
		retrieveLabel_2.setBounds(323, 142, 238, 40);
		homeFrame.getContentPane().add(retrieveLabel_2);
		
		JLabel exportLabel_1 = new JLabel("Export all Passwords");
		exportLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		exportLabel_1.setFont(new Font("Consolas", Font.PLAIN, 20));
		exportLabel_1.setBounds(25, 226, 238, 40);
		homeFrame.getContentPane().add(exportLabel_1);
		
		JLabel exportLabel_2 = new JLabel("into a txt file");
		exportLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		exportLabel_2.setFont(new Font("Consolas", Font.PLAIN, 20));
		exportLabel_2.setBounds(25, 247, 238, 40);
		homeFrame.getContentPane().add(exportLabel_2);
		
		JLabel deleteLabel_1 = new JLabel("Delete Password");
		deleteLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		deleteLabel_1.setFont(new Font("Consolas", Font.PLAIN, 20));
		deleteLabel_1.setBounds(323, 226, 238, 40);
		homeFrame.getContentPane().add(deleteLabel_1);
		
		JLabel deleteLabel_2 = new JLabel("from Database");
		deleteLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		deleteLabel_2.setFont(new Font("Consolas", Font.PLAIN, 20));
		deleteLabel_2.setBounds(323, 247, 238, 40);
		homeFrame.getContentPane().add(deleteLabel_2);
		
		JLabel exitLabel_1 = new JLabel("Want nothing");
		exitLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		exitLabel_1.setFont(new Font("Consolas", Font.PLAIN, 20));
		exitLabel_1.setBounds(174, 317, 238, 40);
		homeFrame.getContentPane().add(exitLabel_1);
		
		JLabel exitLabel_2 = new JLabel("just Exit");
		exitLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		exitLabel_2.setFont(new Font("Consolas", Font.PLAIN, 20));
		exitLabel_2.setBounds(174, 338, 238, 40);
		homeFrame.getContentPane().add(exitLabel_2);
		
		JPanel leftLineBorder = new JPanel();
		leftLineBorder.setBackground(new Color(0, 0, 0));
		leftLineBorder.setBounds(15, 80, 2, 368);
		homeFrame.getContentPane().add(leftLineBorder);
		
		JPanel rightLineBorder = new JPanel();
		rightLineBorder.setBackground(new Color(0, 0, 0));
		rightLineBorder.setBounds(568, 80, 3, 368);
		homeFrame.getContentPane().add(rightLineBorder);
		
		JPanel lowerLineBorder = new JPanel();
		lowerLineBorder.setBackground(new Color(0, 0, 0));
		lowerLineBorder.setBounds(15, 445, 556, 3);
		homeFrame.getContentPane().add(lowerLineBorder);
		
		JPanel lowerBorder = new JPanel();
		lowerBorder.setBackground(new Color(230, 230, 250));
		lowerBorder.setBounds(0, 448, 586, 15);
		homeFrame.getContentPane().add(lowerBorder);
		
		JPanel leftBorder = new JPanel();
		leftBorder.setBounds(0, 80, 15, 370);
		leftBorder.setBackground(new Color(230, 230, 250));
		homeFrame.getContentPane().add(leftBorder);
		
		JPanel rightBorder = new JPanel();
		rightBorder.setBounds(571, 80, 15, 370);
		rightBorder.setBackground(new Color(230, 230, 250));
		homeFrame.getContentPane().add(rightBorder);
	}
}