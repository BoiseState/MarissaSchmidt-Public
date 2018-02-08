import java.awt.Color;
/**
 * Does turtle stuff.
 * @author CS121-5
 */
public class Turtle
{
	public static void main(String[] args)
	{
		String name = "Jaremy";
		
		Color turtleGreen = new Color(0, 153, 51);
		
		System.out.println("Meet " + name + ". He is " + turtleGreen + ".");
		
		int blueValue = turtleGreen.getBlue();
		
		System.out.println(blueValue);
	}
}
