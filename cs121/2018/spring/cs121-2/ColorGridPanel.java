import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JPanel;

/**
 * This is the class for the Color grid panel. 
 * @author marissa
 * @author cs121-2
 * @version Spring 2018
 */
@SuppressWarnings("serial")
public class ColorGridPanel extends JPanel
{
	private ColorButton[][] colorButtons;
	
	/**
	 * Creates and adds color buttons to this panel
	 * @param dimension The width/height of the color grid.
	 * @param listener The action listener to add to the buttons in the grid.
	 */
	public ColorGridPanel(int dimension, ActionListener listener)
	{
		setLayout(new GridLayout(dimension, dimension));
		
		colorButtons = new ColorButton[dimension][dimension];
		
		for(int i = 0; i < colorButtons.length; i++)
		{
			for(int j = 0; j < colorButtons[i].length; j++)
			{
				Random rand = new Random();
				
				colorButtons[i][j] = new ColorButton(new Color(rand.nextInt(256),rand.nextInt(256),rand.nextInt(256)));
				
				colorButtons[i][j].addActionListener(listener);
				
				add(colorButtons[i][j]);
			}
		}
	}
}
