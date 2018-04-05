import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JPanel;
/**
 * This is the class for the Color grid panel. 
 * @author marissa
 * @author cs121-5
 * @version Spring 2018
 */
@SuppressWarnings("serial")
public class ColorGridPanel extends JPanel
{
	private ColorButton[][] colorButtons;
	
	/**
	 * Creates a new color grid panel.
	 * @param n The width/height of the grid
	 * @param listener The listener to add to all ColorButtons
	 */
	public ColorGridPanel(int n, ActionListener listener)
	{
		setLayout(new GridLayout(n, n));
		
		colorButtons = new ColorButton[n][n];
		
		for(int i = 0; i < colorButtons.length; i++)
		{
			for(int j = 0; j < colorButtons[i].length; j++)
			{
				Random rand = new Random();
				Color c = new Color(rand.nextInt(256), rand.nextInt(256),rand.nextInt(256));
				
				colorButtons[i][j] = new ColorButton(c);
				add(colorButtons[i][j]);
				colorButtons[i][j].addActionListener(listener);
			}
		}
	}
}
