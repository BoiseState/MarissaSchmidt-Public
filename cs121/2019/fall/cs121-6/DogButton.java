import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

/**
 * A dog button is a JButton with additional functionality.
 * This is a button that represents a dog.
 * @author marissaschmidt
 */
@SuppressWarnings("serial")
public class DogButton extends JButton
{
	private Dog dog;
	
	/**
	 * Creates a new Dog button representing the given dog.
	 * @param dog The dog this button represents.
	 */
	public DogButton(Dog dog)
	{
		this.dog = dog;
		setText(dog.toString());
		addActionListener(new DogButtonListener());
	}
	
	/**
    * Represents a listener for button push (action) events.
    */
   private class DogButtonListener implements ActionListener
   {
      /**
       * Updates the counter and label when the button is pushed.
       */
      public void actionPerformed(ActionEvent event)
      {
         // When the button is clicked toggle between "adopted" and "available"
    	  if(dog.isAdopted())
    	  {
    		  dog.setAdopted(false);
    		  setText(dog.toString());
    		  setBackground(Color.GREEN);
    		  setForeground(Color.MAGENTA);
    	  }
    	  else
    	  {
    		  dog.setAdopted(true);
    		  setText(dog.toString());
    		  setBackground(Color.ORANGE);
    		  setForeground(Color.PINK);
    	  }
      }
   }
	
}
