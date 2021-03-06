import java.awt.Dimension;

import javax.swing.JPanel;

/**
 * This class represents the main panel of the GUI. It will create and manage all
 * of the sub-components.
 * 
 * @author marissa
 */
@SuppressWarnings("serial")
public class BoxInventoryPanel extends JPanel
{
	private Box box;
	private BoxButton boxButton;
	
	public BoxInventoryPanel()
	{
		setPreferredSize(new Dimension(500, 400));
		
		// create button
		box  = new Box(10, 10, 1);
		boxButton = new BoxButton(box);
		
		add(boxButton);
	}
}
