import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
/**
 * This class represents a DieButton. It extends the JButton class and keeps
 * track of the die object it represents.
 * @author marissa
 */
@SuppressWarnings("serial")
public class DieButton extends JButton
{
	// Instance variables
	private Die die;
	
	// Constructor(s)
	/**
	 * This creates a new DieButton.
	 */
	public DieButton()
	{
		die = new Die();
		
		// Set the text on the die button to the toString value of the die.
		setText(die.toString());
		
		// Increase the font size of the button text.
		setFont(new Font("Arial", Font.BOLD, 36));
		
		// Change the background color to blue.
		setOpaque(true);
		setBackground(new Color(45, 67, 240));
		
		// Set tooltip of this button.
		setToolTipText("Click to roll the die.");
		

		// Add the action listener to this button.
		addActionListener(new DieButtonListener());
	}
	
	private class DieButtonListener implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e)
		{
			// 1. Roll the die.
			die.roll();
			
			// 2. Update the text on the button with the new face value.
			setText(die.toString());
		}
	}
	
	// Methods
}
