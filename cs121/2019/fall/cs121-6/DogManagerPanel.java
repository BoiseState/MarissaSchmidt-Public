import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
	private JLabel title;
	private DogButton dogButton;
	
	/**
	 * Creates a new DogManagerPanel.
	 */
	public DogManagerPanel()
	{
		Dog dog = new Dog("Norman", 123);
		dog.setBreed(Dog.Breed.BEAGLE);
		
		// Step 1: Instantiate components
		title = new JLabel("Welcome to Ultimate Dog Manager");
		dogButton = new DogButton(dog);
		
		// Step 2: Add components to this panel
		add(title);
		add(dogButton);
		
		this.setPreferredSize(new Dimension(300, 400));		
	}
}



