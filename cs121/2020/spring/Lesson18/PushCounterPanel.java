import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * Demonstrates a graphical user interface and an event listener.
 * 
 * @author Java Foundations
 */
@SuppressWarnings("serial")
public class PushCounterPanel extends JPanel
{
	private int count;
	private JButton incrementButton;
	private JButton decrementButton;
	private JLabel pushesLabel;
	

	/**
	 * Constructor: Sets up the GUI panel
	 */
	public PushCounterPanel()
	{
		count = 0;

		incrementButton = new JButton("Increment");
		incrementButton.addActionListener(new ButtonListener());
		
		decrementButton = new JButton("Decrement");
		decrementButton.addActionListener(new ButtonListener());

		pushesLabel = new JLabel("Pushes: " + count);

		add(decrementButton);
		add(incrementButton);
		add(pushesLabel);
	}

	/**
	 * Represents a listener for button push (action) events.
	 */
	private class ButtonListener implements ActionListener
	{
		/**
		 * Updates the counter and label when the button is pushed.
		 */
		public void actionPerformed(ActionEvent event)
		{
			// How do I know which button was clicked?
			if(event.getSource() == incrementButton)
			{
				count++;
			}
			else
			{
				count--;
			}
			pushesLabel.setText("Pushes: " + count);
		}
	}
}
