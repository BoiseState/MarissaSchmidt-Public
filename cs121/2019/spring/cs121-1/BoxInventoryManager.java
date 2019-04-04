import javax.swing.JFrame;

/**
 * The driver class for the GUI. Creates the JFrame and adds a BoxInventoryPanel to it.
 * @author marissa
 */
public class BoxInventoryManager
{
	public static void main(String[] args)
	{
		JFrame frame = new JFrame("Box Inventory Manager");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		BoxInventoryPanel panel = new BoxInventoryPanel();
		frame.getContentPane().add(panel);
		
		frame.pack();
		frame.setVisible(true);
	}

}
