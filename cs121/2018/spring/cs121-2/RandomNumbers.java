import java.util.Random;

/**
 * Demonstrates random number generation.
 * 
 * @author cs121-2
 * @version Spring 2018
 */
public class RandomNumbers
{
	public static void main(String[] args)
	{
		Random random = new Random();
		
		int myNum = random.nextInt(11);
		
		System.out.println("My number is: " + myNum);
		
		int myOtherNum = random.nextInt();
		
		System.out.println("My other number is: " + myOtherNum);
	}

}
