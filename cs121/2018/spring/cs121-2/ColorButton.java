import java.awt.Color;

import javax.swing.JButton;

/**
 * This represents a custom ColorButton. We are extending JButton so we can inherit
 * all the methods and attributes from a JButton.
 * @author marissa
 * @author cs121-2
 * @version Spring 2018
 */
@SuppressWarnings("serial")
public class ColorButton extends JButton
{
	private int clickCount;
	private Color color;
	
	public ColorButton()
	{
		clickCount = 0;
		color = Color.WHITE;
	}
}
