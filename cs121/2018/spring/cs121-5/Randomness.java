import java.util.Random;

/**
 * Demonstrates basic random number generation.
 * @author cs121-5
 * @version Spring 2018
 */
public class Randomness
{
	public static void main(String[] args)
	{
		Random random = new Random();
		
		int myNumber = random.nextInt(10) + 1;
		
		System.out.println("My random number is: " + myNumber);
		
		int myOtherNumber = random.nextInt();
		
		System.out.println("My other random number is: " + myOtherNumber);
	}
}
