import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * This is the class for the main panel. Contains the ActionListeners and instantiates
 * all the sub-components.
 * @author marissa
 * @author cs121-5
 * @version Spring 2018
 */
@SuppressWarnings("serial")
public class NumberDialerPanel extends JPanel
{
	private JButton[][] numberButtons;
	private JLabel phoneNumberLabel;
	//private int[] pushedNumbers;
	
	public NumberDialerPanel()
	{
		// change layout of this panel to grid layout
		setLayout(new GridLayout(3, 3));
		
		// instantiate 2D array of buttons
		numberButtons = new JButton[3][3];
		
		for(int i = 0; i < numberButtons.length; i++) // rows
		{
			for(int j = 0; j < numberButtons[i].length; j++) // cols
			{
				int value = 3 * i + j + 1;
				// instantiate buttons
				numberButtons[i][j] = new JButton(Integer.toString(value));
				// add buttons to panel
				add(numberButtons[i][j]);
				// add action listeners to buttons
				numberButtons[i][j].addActionListener(new NumberButtonListener());
			}
		}
		
		// instantiate label
	}
	
	private class NumberButtonListener implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e)
		{
			System.out.println("Clicked!");
			
			JButton clicked = (JButton) e.getSource();
			clicked.setBackground(Color.RED);
		}
	}
}
