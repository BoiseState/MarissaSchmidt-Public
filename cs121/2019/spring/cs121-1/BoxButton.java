import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class BoxButton extends JButton
{
	private Box box;
	
	public BoxButton(Box box)
	{
		this.box = box;
		
		setText(this.box.toString());
		setBackground(Color.ORANGE);
		addActionListener(new BoxButtonListener());
	}
	
	private class BoxButtonListener implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e)
		{
			// turn gray
			setBackground(Color.GRAY);
			
			// set box to full
			box.setFull(true);
			
			//update text on button
			setText(box.toString()); 
		}
		
	}

}
