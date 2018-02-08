import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 * Animates a green square moving across the screen.
 * @author marissa
 */
@SuppressWarnings("serial")
public class GoldenSpiral extends JPanel
{
	private final int DELAY = 100;
	private int stepSize = 10;
	private ImageIcon icon = new ImageIcon ("unicorn-kitty.jpg");
	private int x = 0, y = 0;
	private int theta = 0;
	private final double PHI = (1 + Math.sqrt(5)) / 2;
	private final double scaleFactor = 4;
	private final double growthFactor = Math.log(PHI) / 90; // ln(phi)/90;

	/* This method draws on the panel's Graphics context.
	 * This is where the majority of your work will be.
	 *
	 * (non-Javadoc)
	 * @see java.awt.Container#paint(java.awt.Graphics)
	 */
	public void paintComponent(Graphics canvas)
	{
		int width = getWidth();
		int height = getHeight();
		
		//Calculate the new position
		theta = (theta + stepSize);

		// x = scaleFactor * cos(theta) * e ^ (growthFactor * theta);
		x = (int)(scaleFactor * Math.cos(Math.toRadians(theta)) * Math.exp(growthFactor * theta));
		
		// y = scaleFactor * sin(theta) * e ^ (growthFactor * theta);
		y = (int)(scaleFactor * Math.sin(Math.toRadians(theta)) * Math.exp(growthFactor * theta));
		
		System.out.println("(" + x + "," + y + ")");
		
		canvas.fillOval(x+width/2, y+height/2, 10, 10);
		//canvas.drawImage(icon.getImage(), x+width/2, y+height/2, null);
		
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
	public GoldenSpiral()
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
		frame.getContentPane().add(new GoldenSpiral());
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


