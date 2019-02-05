import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 * CS 121 Project 1: Traffic Animation
 *
 * Animates a [put your description here]
 *
 * @author BSU CS 121 Instructors
 * @author [put your name here]
 */
@SuppressWarnings("serial")
public class TrafficAnimation extends JPanel
{
	// This is where you declare constants and variables that need to keep their
	// values between calls	to paintComponent(). Any other variables should be
	// declared locally, in the method where they are used.

	/**
	 * A constant to regulate the frequency of Timer events.
	 * Note: 100ms is 10 frames per second - you should not need
	 * a faster refresh rate than this
	 */
	private final int DELAY = 100; //milliseconds

	/**
	 * The anchor coordinate for drawing / animating. All of your vehicle's
	 * coordinates should be relative to this offset value.
	 */
	private int xOffset = 0;

	/**
	 * The number of pixels added to xOffset each time paintComponent() is called.
	 */
	private int stepSize = 10;

	private final Color BACKGROUND_COLOR = Color.black;
	
	public final int INITIAL_WIDTH = 600;
	public final int INITIAL_HEIGHT = 400;

	/* This method draws on the panel's Graphics context.
	 * This is where the majority of your work will be.
	 *
	 * (non-Javadoc)
	 * @see java.awt.Container#paint(java.awt.Graphics)
	 */
	public void paintComponent(Graphics g)
	{
		// Get the current width and height of the window.
		int width = getWidth(); // panel width
		int height = getHeight(); // panel height

		// Fill the graphics page with the background color.
		g.setColor(BACKGROUND_COLOR);
		g.fillRect(0, 0, width, height);

		// Calculate the new xOffset position of the moving object.
		xOffset  = (xOffset + stepSize) % width;

		// TODO: Use width, height, and xOffset to draw your scalable objects
		// at their new positions on the screen

		// This draws a green square. Replace it with your own object.
		int squareSide = height / 5;
		int squareY = height / 2 - squareSide / 2;
		
		g.setColor(Color.green);
		g.fillRect(xOffset, squareY, squareSide, squareSide);
		
		
		/* This is the anchor point for the MiniFig (x,y) -> (mid,top) */
		int mid = width / 2;
		int top = 50;
		
		/* This is the scaler that is used to calculate the dimensions (height / width) 
		 * of each of the MiniFig components. It uses the Math.min() function to select
		 * the smaller of currentWidth/INITIAL_WIDTH and currentHeight/INITIAL_HEIGHT.
		 * This way all the components are scaled to fit within the smaller of the two 
		 * panel dimensions.
		 */
		double scaleFactor = Math.min(width/(double)INITIAL_WIDTH,height/(double)INITIAL_HEIGHT );

		// TODO: 1. Instantiate a new Point object called "anchor". Use "mid" as your x value and
		//       "top" as your y value.
		Point anchor = new Point(xOffset, top);
		
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
		g.fillRect(0, grassYOffset, width, height - grassYOffset);
		
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
		
		g.setFont(new Font("Serif", Font.ITALIC, height/20));
		
		// Get Font's metrics to allows us to figure out it's size
		FontMetrics metrics = g.getFontMetrics();
		
		int stringX = cap.x - (metrics.stringWidth(hello) / 2);
		//int stringY = (height + metrics.getHeight()) / 2;
		
		g.drawString(hello, stringX, cap.y - faceHeight/2);
		
		
		
		
		
		
		
		
		// Put your code above this line. This makes the drawing smoother.
		Toolkit.getDefaultToolkit().sync();
	}


	//==============================================================
	// You don't need to modify anything beyond this point.
	//==============================================================


	/**
	 * Starting point for this program. Your code will not go in the
	 * main method for this program. It will go in the paintComponent
	 * method above.
	 *
	 * DO NOT MODIFY this method!
	 *
	 * @param args unused
	 */
	public static void main (String[] args)
	{
		// DO NOT MODIFY THIS CODE.
		JFrame frame = new JFrame ("Traffic Animation");
		frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(new TrafficAnimation());
		frame.pack();
		frame.setVisible(true);
	}

	/**
	 * Constructor for the display panel initializes necessary variables.
	 * Only called once, when the program first begins. This method also
	 * sets up a Timer that will call paint() with frequency specified by
	 * the DELAY constant.
	 */
	public TrafficAnimation()
	{
		// Do not initialize larger than 800x600. I won't be able to
		// grade your project if you do.
		int initWidth = 600;
		int initHeight = 400;
		setPreferredSize(new Dimension(initWidth, initHeight));
		this.setDoubleBuffered(true);

		//Start the animation - DO NOT REMOVE
		startAnimation();
	}

	/**
	 * Create an animation thread that runs periodically.
	 * DO NOT MODIFY this method!
	 */
	private void startAnimation()
	{
		ActionListener timerListener = new TimerListener();
		Timer timer = new Timer(DELAY, timerListener);
		timer.start();
	}

	/**
	 * Repaints the graphics panel every time the timer fires.
	 * DO NOT MODIFY this class!
	 */
	private class TimerListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e) {
			repaint();
		}
	}
}
