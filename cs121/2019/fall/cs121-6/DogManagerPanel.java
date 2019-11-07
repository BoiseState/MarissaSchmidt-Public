import javax.swing.JPanel;
import java.awt.Dimension;

/**
 * Lesson 18-19: Activity - Dog Manager GUI
 * 
 * This class represents the main DogManager JPanel. 
 * 
 * It contains a KennelPanel and the control sub-panel.
 * 
 * @author CS121 Instructors
 * @version [semester]
 * @author [your name]
 */
@SuppressWarnings("serial")
public class DogManagerPanel extends JPanel
{	
	/**
	 * Creates a new DogManagerPanel.
	 */
	public DogManagerPanel()
	{
		this.setPreferredSize(new Dimension(500, 400));		
	}
}