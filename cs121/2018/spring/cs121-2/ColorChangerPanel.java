import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
	private ColorGridPanel gridPanel;
	private JPanel displayPanel;
	
	public ColorChangerPanel(int dimension)
	{
		setLayout(new BorderLayout());
		
		// This panel represents the 2D grid of colors
		gridPanel = new ColorGridPanel(dimension, new ColorButtonListener());
		gridPanel.setBackground(Color.YELLOW);
		
		// This is the display panel that the color will be displayed on
		displayPanel = new JPanel();
		displayPanel.setBackground(Color.WHITE);
		displayPanel.setPreferredSize(new Dimension(100, 100));
		
		add(gridPanel, BorderLayout.CENTER);
		add(displayPanel, BorderLayout.EAST);
	}
	
	/**
	 *  Changes the background color of the display panel to the button that was clicked.
	 */
	private class ColorButtonListener implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e)
		{
			// Get the button that was clicked and change background color of display panel
			ColorButton clicked = (ColorButton) e.getSource();
			displayPanel.setBackground(clicked.getColor());
		}
	}
}
