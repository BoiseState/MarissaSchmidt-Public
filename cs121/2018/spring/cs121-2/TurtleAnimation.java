import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

import java.util.Random;
import java.util.Scanner;

/**
 * Animates a green turtle moving across the screen.
 * @author CS121-2
 */
@SuppressWarnings("serial")
public class TurtleAnimation extends JPanel
{
	//Note: This area is where you declare constants and variables that
	//	need to keep their values between calls	to paintComponent().
	//	Any other variables should be declared locally, in the
	//	method where they are used.

	//constant to regulate the frequency of Timer events
	// Note: 100ms is 10 frames per second - you should not need
	// a faster refresh rate than this
	private final int DELAY = 100; //milliseconds
	//anchor coordinate for drawing / animating
	private int xOffset = 0;
	//pixels added to x each time paintComponent() is called
	private int stepSize = 10;
	

	/* This method draws on the panel's Graphics context.
	 * This is where the majority of your work will be.
	 *
	 * (non-Javadoc)
	 * @see java.awt.Container#paint(java.awt.Graphics)
	 */
	public void paintComponent(Graphics page)
	{
		//account for changes to window size
		int width = getWidth(); // panel width
		int height = getHeight(); // panel height

		//Fill the canvas with the background color
		page.setColor(getBackground());
		page.fillRect(0, 0, width, height);

		//Calculate the new position
		xOffset = (xOffset + stepSize) % width;

		String name = "Harry";
		
		Color turtleColor = Color.GREEN;
		
		// 1. If you are in the first half of the screen, use a random color. Otherwise, use green.
		if(xOffset > 0 && xOffset < width / 4 || xOffset > width / 2 && xOffset < 3 *width / 4)
		{
			Random random = new Random();
			
			int r = random.nextInt(256);
			int g = random.nextInt(256);
			int b = random.nextInt(256);
				
			turtleColor = new Color(r, g, b);
		}
		
		// 2. If you reach the middle of the screen, move backwards
		// 3. Or when you reach the left edge of the screen move forwards
		if(xOffset == width / 2 || xOffset == 0)
		{
			stepSize = -stepSize;
		}
		
		// Draw a turtle.
		page.setColor(turtleColor);
		
		// Draw turtle head.
		int headW = width / 6;
		int headH = width / 6;
		int headX = xOffset;
		int headY = height / 4;
		
		page.fillOval(headX, headY, headW, headH);
		
		int bodyW = 2 * headW;
		int bodyH = 2 * headH;
		int bodyX = headX - bodyW / 4;
		int bodyY = headY + 3 * headH / 4;
		
		page.fillOval(bodyX, bodyY, bodyW, bodyH);
		
		page.setColor(Color.BLACK);
		
		// Draw legs.
		page.setColor(turtleColor);
		int topLegsX = bodyX - bodyW/4;
		int topLegsY = bodyY + bodyY/4;
		int topLegsW = bodyW + bodyW / 2;
		int topLegsH = bodyH / 5;
		
		page.fillRect(topLegsX, topLegsY, topLegsW, topLegsH);
		
		// Draw shell pattern
		page.setColor(Color.BLACK);
		page.fillArc(bodyX, bodyY, bodyW, bodyH, 225, 90);
		
		// Draw name on screen
		page.setFont(new Font("Arial", Font.BOLD, width / 10));
		page.drawString("This is " + name, 100, 200);
		
		Toolkit.getDefaultToolkit().sync();
	}

	/**
	 * Constructor for the display panel initializes
	 * necessary variables. Only called once, when the
	 * program first begins.
	 * This method also sets up a Timer that will call
	 * paint() with frequency specified by the DELAY
	 * constant.
	 */
	public TurtleAnimation()
	{
		setBackground(Color.white);
		//Do not initialize larger than 800x600
		int initWidth = 800;
		int initHeight = 600;
		setPreferredSize(new Dimension(initWidth, initHeight));
		this.setDoubleBuffered(true);

		//Start the animation - DO NOT REMOVE
		startAnimation();
	}

	/////////////////////////////////////////////
	// DO NOT MODIFY main() or startAnimation()
	/////////////////////////////////////////////

	/**
	 * Starting point for the TrafficAnimation program
	 * @param args unused
	 */
	public static void main (String[] args)
	{
		JFrame frame = new JFrame ("Simple Animation");
		frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(new TurtleAnimation());
		frame.pack();
		frame.setVisible(true);
	}

   /**
    * Create an animation thread that runs periodically
	* DO NOT MODIFY this method!
	*/
    private void startAnimation()
    {
        ActionListener taskPerformer = new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                repaint();
            }
        };
        new Timer(DELAY, taskPerformer).start();
    }
}
