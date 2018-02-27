import java.util.Random;

/**
 * Demonstrates how to write static "helper" methods that can be used in the 
 * main method.
 * 
 * @author marissa
 * @author cs121-2
 * @version Spring 2018
 */
public class Methods
{
	/**
	 * A method called cube that accepts one integer parameter and 
	 * returns that value raised to the third power.
	 * 
	 * @param x The value to cube.
	 * @return x raised to the third power.
	 */
	public static int cube(int x)
	{
		return (int) Math.pow(x, 3);
	}
	
	/**
	 * A method named randomInRange that accepts two integer parameters 
	 * representing a range and returns a random integer in the range (inclusive).
	 * Assumes that the range is valid.
	 * 
	 * @param min The minimum value to produce.
	 * @param max The maximum value to produce.
	 * @return A random integer in the given range.
	 */
	public static int randomInRange(int min, int max)
	{
		Random rand = new Random();
		return rand.nextInt(max - min + 1) + min;
	}
	
	/**
	 * A method named isAlpha that accepts a character parameter and returns
	 * whether or not the character is an alphabetic letter.
	 * 
	 * @param c The character to test.
	 * @return true if the character is either an uppercase or lowercase
	 * alphabetic letter, false otherwise.
	 */
	public static boolean isAlpha(char c)
	{
		if((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public static void main(String[] args)
	{
		// Test cube method
		int result = cube(10);
		System.out.println("10^3 is " + result);
		
		// Test randomInRange method
		int value = randomInRange(5, 10);
		System.out.println("Random number between 5 and 10: " + value);
		
		// Test isAlpha method
		char input = 'x';
		boolean isIt = isAlpha(input);
		if(isIt)
		{
			System.out.println(input + " is an alphabetic letter.");
		}
		else
		{
			System.out.println(input + " is NOT an alphabetic letter.");
		}
	}
}
