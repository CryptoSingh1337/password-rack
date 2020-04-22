package passwordrack.GUI.HOME;

import javax.swing.JFrame;

import passwordrack.Home.Action;

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

public class Add {

	protected JFrame addFrame;
	private JTextField passwordTagTxtField;
	private JPasswordField passwordField;
	private JTextField showPasswordLabel;
	
	/**
	 * Create the application.
	 */
	public Add() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		addFrame = new JFrame();
		addFrame.getContentPane().setBackground(new Color(255, 255, 255));
		addFrame.setAlwaysOnTop(true);
		addFrame.setIconImage(Toolkit.getDefaultToolkit().getImage(Add.class.getResource("/passwordrack/Images/AddIcon.png")));
		addFrame.setTitle("Add Password into Database");
		addFrame.setResizable(false);
		addFrame.setSize(350, 200);
		addFrame.setLocationRelativeTo(null);    						//To display JFrame at the center of the screen
		addFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		addFrame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setFont(new Font("Constantia", Font.PLAIN, 19));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(46, 77, 84, 20);
		addFrame.getContentPane().add(lblNewLabel_1);
		
		passwordTagTxtField = new JTextField();
		passwordTagTxtField.setBounds(140, 28, 164, 20);
		addFrame.getContentPane().add(passwordTagTxtField);
		passwordTagTxtField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setToolTipText("Enter Password to save");
		passwordField.setColumns(10);
		passwordField.setBounds(140, 74, 164, 20);
		addFrame.getContentPane().add(passwordField);
		
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
		addFrame.getContentPane().add(showPasswordButton);
		
		JLabel lblNewLabel_1_1 = new JLabel("Password Tag");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Constantia", Font.PLAIN, 19));
		lblNewLabel_1_1.setBounds(10, 30, 120, 20);
		addFrame.getContentPane().add(lblNewLabel_1_1);
		
		showPasswordLabel = new JTextField();
		showPasswordLabel.setColumns(10);
		showPasswordLabel.setBounds(140, 74, 164, 20);
		addFrame.getContentPane().add(showPasswordLabel);
		
		JButton addButton = new JButton("ADD");
		addButton.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				String password_tag,password;
				password_tag = passwordTagTxtField.getText().trim();
				password = passwordField.getText();
				if(password_tag.isEmpty() || password.isEmpty())
				{
					JOptionPane.showMessageDialog(addFrame, "Invalid Data !!");
				}
				else
				{
					Action obj = new Action();
					obj.addAction(password_tag, password);
				}
			}
		});
		addButton.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		addButton.setBackground(new Color(192, 192, 192));
		addButton.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		addButton.setBounds(56, 119, 84, 29);
		addFrame.getContentPane().add(addButton);
		
		JButton clearButton = new JButton("CLEAR");
		clearButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				passwordTagTxtField.setText(null);
				passwordField.setText(null);
			}
		});
		clearButton.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		clearButton.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		clearButton.setBackground(Color.LIGHT_GRAY);
		clearButton.setBounds(220, 119, 84, 29);
		addFrame.getContentPane().add(clearButton);
	}
}
