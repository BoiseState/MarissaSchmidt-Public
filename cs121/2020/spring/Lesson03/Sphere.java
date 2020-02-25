/**
 * Calculates the volume of a sphere.
 * 
 * @author marissaschmidt
 */
public class Sphere {

	public static void main(String[] args)
	{
		final double PI = 3.14159;
		double radiusCubed = 1.0;
		
		double volume1 = 4.0 / 3.0 * PI * radiusCubed;
		
		double volume2 = PI * radiusCubed * 4 / 3;
	
		System.out.println("Volume 1: " + volume1);
		System.out.println("Volume 2: " + volume2);
	}
}
