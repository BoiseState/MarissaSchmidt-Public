import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;

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
	private JTextField fahrenheitInput;
	private JButton calculateButton;

	/**
	 * Constructor: Sets up the main GUI components.
	 */
	public FahrenheitPanel()
	{
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		// Create the input sub-panel
		JPanel inputPanel = new JPanel();
		inputPanel.setBackground(Color.CYAN);
		
		// Initialize all components of input sub-panel	
		inputLabel = new JLabel("Temperature in Fahrenheit:");
		fahrenheitInput = new JTextField(5);
		
		// Add all components on input sub-panel to the inputPanel
		inputPanel.add(inputLabel);
		inputPanel.add(fahrenheitInput);
		
		
		// Create the button sub-panel
		JPanel buttonPanel = new JPanel();
		buttonPanel.setBackground(Color.MAGENTA);
		
		// Initialize all components of button sub-panel
		calculateButton = new JButton("Calculate");
		
		// Add all components related to buttons to the buttonPanel
		buttonPanel.add(calculateButton);
		
		
		// Create the output sub-panel
		JPanel outputPanel = new JPanel();
		outputPanel.setBackground(Color.YELLOW);
		
		// Initialize output related components
		outputLabel = new JLabel("Temperature in Celsius: ");
		resultLabel = new JLabel("-");
		
		// Add all components related to output to the outputPanel
		outputPanel.add(outputLabel);
		outputPanel.add(resultLabel);
		
		
		// Add the same action listener to text field (for when we hit enter key)
		// and the enter button. They should have same effect.
		TempListener listener = new TempListener();
		fahrenheitInput.addActionListener(listener);
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
			String text = fahrenheitInput.getText();
			
			// Validate the input is not empty
			if(text.isBlank())
			{
				JOptionPane.showMessageDialog(null, "Input cannot be blank. Please enter a valid temperature.",
						"Invalid Input", JOptionPane.ERROR_MESSAGE);
			}
			else
			{
				try
				{
					double fahrenheitTemp = Double.parseDouble(text);
					double celsiusTemp = (fahrenheitTemp - 32) * 5.0 / 9;
				
					DecimalFormat fmt = new DecimalFormat("#.##");
	
					resultLabel.setText(fmt.format(celsiusTemp));
				}
				catch(NumberFormatException e)
				{
					JOptionPane.showMessageDialog(null, "Input must be a valid temperature.",
							"Invalid Input", JOptionPane.ERROR_MESSAGE);
				}
			}
		}
	}
}
