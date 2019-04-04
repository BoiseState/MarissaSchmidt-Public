import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

@SuppressWarnings("serial")
public class BoxButton extends JButton
{
	private Box box;
	
	public BoxButton(Box box)
	{
		this.box = box;
		
		// set button text
		setText(box.toString());
		setBackground(Color.orange);
		
		addActionListener(new BoxButtonListener());
	}

	private class BoxButtonListener implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e)
		{
			box.setFull(true);
			
			setBackground(Color.GRAY);
			
			// make sure to update text on button
			setText(box.toString());
		}
	}
	
	
}
