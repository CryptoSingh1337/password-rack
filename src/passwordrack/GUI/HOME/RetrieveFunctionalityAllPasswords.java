package passwordrack.GUI.HOME;

import passwordrack.Home.Action;
import java.awt.Color;
//import java.awt.EventQueue;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import java.awt.Toolkit;

public class RetrieveFunctionalityAllPasswords {

	protected JFrame retrieveActionAllPasswordFrame;

	/**
	 * Launch the application.
	 */
/*	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RetrieveFunctionalityAllPasswords window = new RetrieveFunctionalityAllPasswords();
					window.retrieveActionAllPasswordFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the application.
	 */
	public RetrieveFunctionalityAllPasswords() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		retrieveActionAllPasswordFrame = new JFrame();
		retrieveActionAllPasswordFrame.setIconImage(Toolkit.getDefaultToolkit().getImage(RetrieveFunctionalityAllPasswords.class.getResource("/passwordrack/Images/RetrieveAllPasswordIcon.png")));
		retrieveActionAllPasswordFrame.getContentPane().setBackground(new Color(255, 255, 255));
		retrieveActionAllPasswordFrame.getContentPane().setLayout(null);
		retrieveActionAllPasswordFrame.setSize(331,300 );
		retrieveActionAllPasswordFrame.setResizable(false);
		retrieveActionAllPasswordFrame.setTitle("Retrieve Password");
		retrieveActionAllPasswordFrame.setSize(314, 310);
		retrieveActionAllPasswordFrame.setLocationRelativeTo(null);
		retrieveActionAllPasswordFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		JLabel lblNewLabel = new JLabel("All Passwords that are stored in Database");
		lblNewLabel.setBounds(10, 10, 281, 26);
		lblNewLabel.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		retrieveActionAllPasswordFrame.getContentPane().add(lblNewLabel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 46, 281, 216);
		retrieveActionAllPasswordFrame.getContentPane().add(scrollPane);
		
		JTextArea textAreaMain = new JTextArea();
		textAreaMain.setBackground(new Color(192, 192, 192));
		textAreaMain.setEditable(false);
		scrollPane.setViewportView(textAreaMain);
		Action obj = new Action();
		int noofrows = Action.rows;
		String result[][] = obj.retrieveActionAllRecord();
		for(int i = 0; i < noofrows; i++)
		{
				for(int j = 0; j < 2; j++)
					{
						textAreaMain.append(result[i][j]+"              ");
					}
				textAreaMain.append("\n");	
			}
		}
}
