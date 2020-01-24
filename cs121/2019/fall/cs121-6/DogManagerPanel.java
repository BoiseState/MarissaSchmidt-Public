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
		this.setPreferredSize(new Dimension(500, 400));	

		// Step 1: Instantiate components
		title = new JLabel("Welcome to Ultimate Dog Manager");
		
		// Step 2: Add components to this panel
		add(title);
		
		// Create a new Dog object.
		Dog rover = new Dog("Rover", 1234);
		rover.setBreed(Dog.Breed.GOLDEN_RETRIEVER);
		rover.setImagePath("1234-rover.jpg");
		
		// Create and add a button for the dog to this panel.
		DogButton dogButton1 = new DogButton(rover);
		this.add(dogButton1);
		
		// Create a second Dog object.
		Dog cloud = new Dog("Cloud", 1235);
		cloud.setBreed(Dog.Breed.POMERANIAN);
		cloud.setImagePath("1235-cloud.jpg");
		
		// Create and add a button for the dog to this panel.
		DogButton dogButton2 = new DogButton(cloud);
		this.add(dogButton2);
		
		// Create a third Dog object.
		Dog beethoven = new Dog("Beethoven", 1235);
		beethoven.setBreed(Dog.Breed.ST_BERNARD);
		beethoven.setImagePath("1236-beethoven.jpg");
		
		// Create and add a button for the dog to this panel.
		DogButton dogButton3 = new DogButton(beethoven);
		this.add(dogButton3);
	}
}



