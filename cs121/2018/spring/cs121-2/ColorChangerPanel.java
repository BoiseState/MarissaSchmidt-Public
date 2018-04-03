import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

/**
 * This is the class for the main panel. Contains the ActionListeners and instantiates
 * all the sub-components.
 * @author marissa
 * @author cs121-2
 * @version Spring 2018
 */
@SuppressWarnings("serial")
public class ColorChangerPanel extends JPanel
{
	private ColorButton[][] colorButtons;
	
	public ColorChangerPanel(int dimension)
	{
		// change layout of this panel to grid layout
		setLayout(new GridLayout(dimension, dimension));
		
		// create one listener instance that will be shared among all buttons
		ColorButtonListener listener = new ColorButtonListener();
		
		// instantiate 2D array of buttons
		colorButtons = new ColorButton[dimension][dimension];
		
		for(int i = 0; i < colorButtons.length; i++) // rows
		{
			for(int j = 0; j < colorButtons[i].length; j++) // cols
			{
				// instantiate buttons
				colorButtons[i][j] = new ColorButton();
				// Mac Fix
				colorButtons[i][j].setOpaque(true);
				colorButtons[i][j].setBorderPainted(false);
				// add buttons
				add(colorButtons[i][j]);
				// add listeners
				colorButtons[i][j].addActionListener(listener);
			}
		}
	}
	
	private class ColorButtonListener implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e)
		{
			// Get the button that was clicked and change background color
			JButton clicked = (JButton) e.getSource();
			clicked.setBackground(Color.BLACK);
		}
	}
}
