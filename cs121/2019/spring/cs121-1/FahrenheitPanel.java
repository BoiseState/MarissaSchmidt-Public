import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

/**
 * Demonstrates the use of text fields.
 * @author: Java Foundations
 * 
 */

@SuppressWarnings("serial")
public class FahrenheitPanel extends JPanel
{
	private static final Color LIGHT_GREEN = new Color(206, 255, 199);
	
	private JLabel inputLabel, outputLabel, resultLabel;
	private JTextField inputTextField;
	private JButton calculateButton;

	/**
	 * Constructor: Sets up the main GUI components.
	 */
	public FahrenheitPanel()
	{
		// Use box layout in y axis
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		
		// This is a subpanel for the faherenheit input
		JPanel inputPanel = new JPanel();
		inputPanel.setBackground(Color.CYAN);
		
		inputLabel = new JLabel("Temperature in Fahrenheit:");
		inputTextField = new JTextField("5", 5);
		
		inputPanel.add(inputLabel);
		inputPanel.add(inputTextField);
		
		JPanel buttonPanel = new JPanel();
		buttonPanel.setBackground(Color.MAGENTA);
		
		calculateButton = new JButton("Calculate");
		buttonPanel.add(calculateButton);
		
		JPanel outputPanel = new JPanel();
		outputPanel.setBackground(Color.YELLOW);
		
		outputLabel = new JLabel("Temperature in Celsius: ");
		resultLabel = new JLabel("-");
		
		outputPanel.add(outputLabel);
		outputPanel.add(resultLabel);
		

		// Add the same action listener to text field (for when we hit enter key)
		// and the enter button. They should have same effect.
		TempListener listener = new TempListener();
		inputTextField.addActionListener(listener);
		calculateButton.addActionListener(listener);

		// Add all components to the this panel.
		add(inputPanel);
		add(buttonPanel);
		add(outputPanel);
		

		setBackground(LIGHT_GREEN);
		//setPreferredSize(new Dimension(275, 80));
	}

	/**
	 * Represents an action listener for the temperature input field.
	 */
	private class TempListener implements ActionListener
	{
		/**
		 * Performs the conversion when the enter key is pressed in
		 * the text field.
		 */
		public void actionPerformed(ActionEvent event)
		{
			// Get the text from the text field
			String text = inputTextField.getText();
			
			if(text == null || text.isEmpty())
			{
				JOptionPane.showMessageDialog(null, "Enter a F temp", 
						"Input Error", JOptionPane.ERROR_MESSAGE);
			}
			else
			{

				double fahrenheitTemp = Double.parseDouble(text);
				double celsiusTemp = (fahrenheitTemp - 32) * 5.0 / 9;
				String result = String.format("%6.2f", celsiusTemp);
	
				resultLabel.setText(result);
			}
		}
	}
}
