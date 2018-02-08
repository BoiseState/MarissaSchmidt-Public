/**
 * Uses Math.sqrt() to compute escape velocity.
 * @author cs121-2
 * @version Spring 2018
 */
public class EscapeVelocity
{
	public static void main(String[] args)
	{
		final double GRAVITY = 9.81;
		double mass = 100; //kg
		double radius = 50;
		
		double velocity = Math.sqrt(2 * GRAVITY * mass / radius);
		
		System.out.println(velocity);
	}
}
