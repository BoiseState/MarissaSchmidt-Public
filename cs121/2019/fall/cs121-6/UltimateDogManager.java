import javax.swing.JFrame;

/**
 * Lesson 18-19: Activity - Dog Manager GUI
 * 
 * This is the driver class.
 *
 * @author CS121 Instructors
 * @version [semester]
 * @author [your name]
 */
@SuppressWarnings("serial")
public class UltimateDogManager extends JFrame
{
	public static void main(String[] args)
	{
		JFrame frame = new JFrame("Ultimate Dog Manager");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		DogManagerPanel panel = new DogManagerPanel();
		frame.getContentPane().add(panel);
		
		frame.pack();
		frame.setVisible(true);
	}
}