package passwordrack.GUI.HOME;

import javax.swing.JFrame;

public class Delete {

	protected JFrame deleteFrame;
	
	/**
	 * Create the application.
	 */
	public Delete() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		deleteFrame = new JFrame();
		deleteFrame.setBounds(100, 100, 450, 300);
		deleteFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
