import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Color;

/**
 * Lesson 4: Activity - Using Classes and Objects
 * 
 * Uses the MiniFig class to draw a custom avatar.
 * 
 * @author CS121 instructors
 * @author Marissa Schmidt
 */
@SuppressWarnings("serial")
public class MyAvatar extends JPanel
{
	public final int INITIAL_WIDTH = 800;
	public final int INITIAL_HEIGHT = 600;
	
	/**
	 * Draws the picture in the panel. This is where all of your
	 * code will go.
	 * @param canvas The drawing area of the window.
	 */
	public void paintComponent (Graphics g)
	{
		/* Store the height and width of the panel at the time
		 * the paintComponent() method is called.
		 */
		int currentHeight = getHeight();
		int currentWidth = getWidth();
		
		/* This is the anchor point for the MiniFig (x,y) -> (mid,top) */
		int mid = currentWidth / 2;
		int top = 50;
		
		/* This is the scaler that is used to calculate the dimensions (height / width) 
		 * of each of the MiniFig components. It uses the Math.min() function to select
		 * the smaller of currentWidth/INITIAL_WIDTH and currentHeight/INITIAL_HEIGHT.
		 * This way all the components are scaled to fit within the smaller of the two 
		 * panel dimensions.
		 */
		double scaleFactor = Math.min(currentWidth/(double)INITIAL_WIDTH,currentHeight/(double)INITIAL_HEIGHT );

		// TODO: 1. Instantiate a new Point object called "anchor". Use "mid" as your x value and
		//       "top" as your y value.
		Point anchor = new Point(mid, top);
		
		// TODO: 2. Instantiate a new MiniFig object and give the reference variable a name of a person, 
		//       such as "bob". Use the MiniFig constructor with the following
		//       parameters: MiniFig(g, scaleFactor, anchor)
		MiniFig bob = new MiniFig(g, scaleFactor, anchor);
		
		// TODO: 3. Create a new custom Color object. An example is shown below.
		Color color = new Color(45, 120, 0);
		
		// TODO: 4. Invoke the setTorsoColor(Color color) method on your MiniFig instance.
		//       Use your color object as a parameter to change the shirt color.
		//       This lets you change the color of "bob's" shirt. :)
		bob.setTorsoColor(color);
		
		// TODO: 5. Invoke the draw() method on your MiniFig instance. This is where "bob" is displayed on the screen.
		
		
		// TODO: 6. Adjust the size of your Avatar's window. Notice how the avatar does not stay grounded
		//       on the grass. To fix this, use the getBaseMidPoint() method to find the the base mid point of your
		//       MiniFig. This method returns a Point object that represents the x,y coordinates at the
		//       base of the MiniFig, right between its feet. 
		//       Replace the hard-coded value of grassYOffset with the y value 
		//       of the returned point.
		Point feet = bob.getBaseMidPoint();
		int grassYOffset = feet.y;
		
		//****
		// Draw grass.
		//****
		Color grassGreen = new Color (60,80,38);
		g.setColor(grassGreen);
		g.fillRect(0, grassYOffset, currentWidth, currentHeight - grassYOffset);
		
		//****
		// Draw tree.
		//****
		// draw trunk
		Color treeTrunk = new Color(87, 35, 7);
		g.setColor(treeTrunk);
		g.fillRect(150, grassYOffset - 200, 100, (int)(200*scaleFactor));
		
		// draw leaves
		g.setColor(grassGreen);
		g.fillOval(-100, grassYOffset - 100 - 500, (int)(scaleFactor*500), (int)(scaleFactor*500));
		
		
		//****
		// An alternative (better) way of drawing tree using variables.
		//****
		// draw trunk
		int trunkX = (int)(scaleFactor*150);
		int trunkY = grassYOffset - (int)(scaleFactor*200);
		int trunkW = (int)(scaleFactor*100);
		int trunkH = (int)(scaleFactor*200);
		g.fillRect(trunkX, trunkY, trunkW, trunkH);
		
		// draw leaves
		int leavesW = 2*trunkW;
		int leavesH = leavesW;
		int leavesX = trunkX + trunkW/2 - leavesW/2;
		int leavesY = trunkY - leavesH;
		g.fillOval(leavesX, leavesY, leavesW, leavesH);
		
		// draw avatar
		bob.draw();
		
		// Draw a pizza hat (or mohawk) relative to cap point.
		Point cap = bob.getCapPoint();
		int faceWidth = bob.getFaceWidth();
		int faceHeight = bob.getFaceHeight();
		g.setColor(Color.MAGENTA);
		g.fillArc(cap.x - faceWidth/2, cap.y - faceHeight/4, faceWidth, faceHeight, 45, 90);
		
		String hello = "Hello!";
		
		g.setFont(new Font("Serif", Font.ITALIC, currentHeight/20));
		
		// Get Font's metrics to allows us to figure out it's size
		FontMetrics metrics = g.getFontMetrics();
		
		int stringX = cap.x - (metrics.stringWidth(hello) / 2);
		//int stringY = (height + metrics.getHeight()) / 2;
		
		g.drawString(hello, stringX, cap.y - faceHeight/2);
	}


	/**
	 * Constructor (panel initialization)
	 */
	public MyAvatar()
	{
		this.setBackground(Color.white);
		this.setPreferredSize(new Dimension(INITIAL_WIDTH, INITIAL_HEIGHT));
	}

	/**
	 * Sets up a JFrame and the MiniFigDriver panel.
	 * @param args unused
	 */
	public static void main(String[] args)
	{
		JFrame frame = new JFrame("MyAvatar");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(new MyAvatar());
		frame.pack();
		frame.setVisible(true);
	}
}