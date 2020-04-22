package passwordrack.GUI.HOME;

import javax.swing.JFrame;

public class Retrieve {

	private JFrame retrieveFrame;

	/**
	 * Create the application.
	 */
	public Retrieve() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		retrieveFrame = new JFrame();
		retrieveFrame.setBounds(100, 100, 450, 300);
		retrieveFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
