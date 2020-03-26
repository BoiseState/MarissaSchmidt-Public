import javax.swing.JPanel;

/**
 * This class represents the main panel of the SnakeEyes GUI application.
 * It extends JPanel, which means it is a JPanel + more.
 * @author marissa
 *
 */
@SuppressWarnings("serial")
public class DicePanel extends JPanel
{
	// Instance Variables
	private DieButton dieButton1;
	private DieButton dieButton2;
	
	// Constructor(s)
	/**
	 * Creates the DicePanel by creating all sub-components and adding them
	 * to this panel.
	 */
	public DicePanel()
	{
		dieButton1 = new DieButton();
		dieButton2 = new DieButton();
		
		add(dieButton1);
		add(dieButton2);
	}
	
	
	// Other methods
}
