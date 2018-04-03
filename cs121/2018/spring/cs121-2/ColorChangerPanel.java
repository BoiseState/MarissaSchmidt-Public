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
		setLayout(new GridLayout(dimension, dimension));
		ColorButtonListener listener = new ColorButtonListener();
		
		colorButtons = new ColorButton[dimension][dimension];
		for(int i = 0; i < colorButtons.length; i++) // rows
		{
			for(int j = 0; j < colorButtons[i].length; j++)
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
			System.out.println("Clicked!");
			// Get the button that was clicked
			JButton clicked = (JButton) e.getSource();
			clicked.setBackground(Color.BLACK);
		}
	}
}
