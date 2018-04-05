import javax.swing.JFrame;
/**
 * A color chooser GUI. This is the driver class. Creates the JFrame and adds
 * the ColorChooserPanel to it.
 * 
 * @author marissa
 * @author cs121-5
 * @version Spring 2018
 */
public class ColorChooser
{
	/**
	 * Creates and displays the main program frame.
	 * 
	 * @param args
	 */
	public static void main(String[] args)
	{
		JFrame frame = new JFrame("Color Chooser");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		ColorChooserPanel panel = new ColorChooserPanel();
		frame.getContentPane().add(panel);

		frame.pack();
		frame.setVisible(true);
	}
}
