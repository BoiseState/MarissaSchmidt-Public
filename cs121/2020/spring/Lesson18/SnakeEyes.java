import javax.swing.JFrame;

/**
 * The driver class for the GUI application. Creates the JFrame.
 * 
 * @author marissa
 */
public class SnakeEyes
{
	   /**
	    * Creates and displays the main program frame.
	    * @param args
	    */
	   public static void main(String[] args)
	   {
	      JFrame frame = new JFrame("Snake Eyes");
	      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	      DicePanel panel = new DicePanel();
	      frame.getContentPane().add(panel);

	      frame.pack();
	      frame.setVisible(true);
	   }
}
