import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;

/**
 * This represents a custom ColorButton. We are extending JButton so we can inherit
 * all the methods and attributes from a JButton.
 * 
 * @author marissa
 * @author cs121-5
 * @version Spring 2018
 */
@SuppressWarnings("serial")
public class ColorButton extends JButton
{
	private Color color;
	private int clicks;
	
	/**
	 * Creates a new button with the specified background color. 
	 * @param color The background color of the button.
	 */
	public ColorButton(Color color)
	{
		this.color = color;
		clicks = 0;
		
		setPreferredSize(new Dimension(75, 75));
		setBackground(color);
		setOpaque(true);
		setBorderPainted(false);
	}
	
	/**
	 * Updates the number of clicks by one and sets the text on 
	 * the button to the number.
	 */
	public void updateClickCount()
	{
		clicks++;
		setText(Integer.toString(clicks));
	}
	
	/**
	 * Returns the current color of this button.
	 * @return The color.
	 */
	public Color getColor()
	{
		return color;
	}
}
