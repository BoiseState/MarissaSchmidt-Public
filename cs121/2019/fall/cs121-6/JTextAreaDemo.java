import javax.swing.JFrame;

/**
 * Demonstrates putting a JTextArea in a JScrollPane.
 * @author marissa
 */
public class JTextAreaDemo
{
	/**
	 * @param args unused
	 */
	public static void main(String[] args)
	{
		JFrame frame = new JFrame("Text Area Test");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JTextAreaDemoPanel panel = new JTextAreaDemoPanel();
		
		frame.getContentPane().add(panel);
		frame.pack();
		frame.setVisible(true);
	}
}