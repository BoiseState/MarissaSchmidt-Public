import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Dimension;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Random;
import java.awt.Color;

/**
 * A starting point for creating a new graphical program
 * @author CS121 instructors
 */
@SuppressWarnings("serial")
public class Skittles extends JPanel
{
	/**
	 * Draws the picture in the panel. This is where all of your
	 * code will go.
	 * @param page Our graphics canvas.
	 */
	public void paintComponent (Graphics page)
	{
		Random random = new Random();
		/* Start with BlankCanvas.java from graphics examples */
		/* Instantiate an empty ArrayList of colors */
		ArrayList<Color> skittles = new ArrayList<Color>(); 
		
		/* Use a for loop to add n random colors */
		int n = 10;
		for(int i = 0; i < n; i++)
		{
			int r = random.nextInt(256);
			int g = random.nextInt(256);
			int b = random.nextInt(256);
			
			Color c = new Color(r, g, b);
			
			skittles.add(c);
		}
		
		/* Print each color using for loop (e.g. Color i: java.awt.Color)*/
		for(int i = 0; i < skittles.size(); i++)
		{
			System.out.println("Color " + i + ": " + skittles.get(i));
		}
		
		/* Print each color using for-each loop (no index) */
		
//		for(Color c : skittles)
//		{
//			int greenValue = c.getGreen();
//			System.out.println(c);
//			System.out.println("Green" + greenValue);
//		}
		
		/* Use for loop to draw dot (use i for x offset) */
		/* Also need to calculate circleWidth */
		
		int width = getWidth();
		int height = getHeight();
		
		int circleWidth = width / skittles.size();
		
		for(int i = 0; i < skittles.size(); i++)
		{
			page.setColor(skittles.get(i));
			page.fillOval(i*circleWidth, 0, circleWidth, circleWidth);
		}
		
		/* Use for-each loop to find color with 
		 * max green value */
		
		Color maxGreenColor = Color.BLACK; // Color(0, 0, 0);
		for(Color c : skittles)
		{
			if(c.getGreen() > maxGreenColor.getGreen())
			{
				maxGreenColor = c;
			}
		}
		System.out.println("Color with largest green: " + maxGreenColor);
		
		/* Draw large oval with the max green color */
		page.setColor(maxGreenColor);
		page.fillOval(0, circleWidth, circleWidth*3, circleWidth*3);
	}


	/**
	 * Constructor (panel initialization)
	 */
	public Skittles()
	{
		this.setBackground(Color.white);
		this.setPreferredSize(new Dimension(800, 600));
	}


	/**
	 * Sets up a JFrame and the BlankCanvas panel.
	 * @param args unused
	 */
	public static void main(String[] args)
	{
		JFrame frame = new JFrame("Skittles");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(new Skittles());
		frame.pack();
		frame.setVisible(true);
	}
}
