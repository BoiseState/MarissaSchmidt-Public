import java.awt.Color;

import javax.swing.JButton;

/**
 * This represents a custom ColorButton. We are extending JButton so we can inherit
 * all the methods and attributes from a JButton.
 * 
 * @author marissa
 * @author cs121-2
 * @version Spring 2018
 */
@SuppressWarnings("serial")
public class ColorButton extends JButton
{
	private int clickCount;
	private Color color;
	
	public ColorButton(Color color)
	{
		setOpaque(true);
		setBorderPainted(false);
		clickCount = 0;
		this.color = color;
		
		setBackground(color);
	}
	
	public void setColor(Color color)
	{
		this.color = color;
		setBackground(color);
	}
	
	public Color getColor()
	{
		return color;
	}
}
