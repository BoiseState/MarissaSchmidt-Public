import javax.swing.JFrame;

/**
 * A color changer GUI. This is the driver class. Creates the JFrame and adds
 * the ColorChangerPanel to it.
 * 
 * @author marissa
 * @author cs121-2
 * @version Spring 2018
 */
public class ColorChanger
{
	/**
	 * Creates and displays the main program frame.
	 * 
	 * @param args
	 */
	public static void main(String[] args)
	{
		JFrame frame = new JFrame("Color Changer");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		ColorChangerPanel panel = new ColorChangerPanel(3);
		frame.getContentPane().add(panel);

		frame.pack();
		frame.setVisible(true);
	}
}
