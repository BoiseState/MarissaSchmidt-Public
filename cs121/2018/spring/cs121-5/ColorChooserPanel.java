import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
/**
 * This is the class for the main panel. Contains the ActionListeners and instantiates
 * all the sub-components.
 * @author marissa
 * @author cs121-5
 * @version Spring 2018
 */
@SuppressWarnings("serial")
public class ColorChooserPanel extends JPanel
{
	private ColorGridPanel gridPanel;
	private JPanel previewPanel;
	
	/**
	 * Creates a new color chooser panel.
	 */
	public ColorChooserPanel()
	{
		setLayout(new BorderLayout());
		
		gridPanel = new ColorGridPanel(3, new ColorButtonListener());
		
		previewPanel = new JPanel();
		previewPanel.setPreferredSize(new Dimension(150, 150));
		
		add(gridPanel, BorderLayout.CENTER);
		add(previewPanel, BorderLayout.EAST);
	}
	
	/**
	 * Action listener that will be added to all ColorButtons.
	 */
	private class ColorButtonListener implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e)
		{
			System.out.println("Clicked!");
			
			ColorButton clicked = (ColorButton) e.getSource();
			clicked.updateClickCount();
			
			previewPanel.setBackground(clicked.getColor());
		}
	}
}
