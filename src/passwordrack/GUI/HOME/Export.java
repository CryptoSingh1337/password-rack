package passwordrack.GUI.HOME;

import javax.swing.JFrame;

public class Export {

	private JFrame exportFrame;

	/**
	 * Create the application.
	 */
	public Export() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		exportFrame = new JFrame();
		exportFrame.setBounds(100, 100, 450, 300);
		exportFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
