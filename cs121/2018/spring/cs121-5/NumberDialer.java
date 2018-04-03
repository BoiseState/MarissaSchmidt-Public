import javax.swing.JFrame;

/**
 * A number dialer GUI. This is the driver class. Creates the JFrame and adds
 * the NumberDialerPanel to it.
 * 
 * @author marissa
 * @author cs121-5
 * @version Spring 2018
 */
public class NumberDialer
{
	/**
	 * Creates and displays the main program frame.
	 * 
	 * @param args
	 */
	public static void main(String[] args)
	{
		JFrame frame = new JFrame("Number Dialer");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		NumberDialerPanel panel = new NumberDialerPanel();
		frame.getContentPane().add(panel);

		frame.pack();
		frame.setVisible(true);
	}
}
