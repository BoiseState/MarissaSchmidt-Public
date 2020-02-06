/**
 * Demonstrates Trig functions.
 * Calculates point on circumference of circle.
 * @author Marissa Schmidt
 */
public class Trig
{
	public static void main(String[] args)
	{
		// origin
		int x0 = 0;
		int y0 = 0;

		// radius
		int r = 10;
		
		// angle
		int theta = 45; // degrees
		
		// point on circumference
		int x1 = (int)(x0 + r * Math.cos(Math.toRadians(theta)));
		
		System.out.println("x1: " + x1);
	}
}
