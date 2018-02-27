import java.util.Random;
/**
 * Demonstrates how to write static "helper" methods that can be used in the 
 * main method.
 * 
 * @author marissa
 * @author cs121-5
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
	 * Assume that the range is valid.
	 * @param low the lowest possible value
	 * @param high the highest possible value
	 * @return a random value within the range.
	 */
	public static int randomInRange(int low, int high)
	{
		Random random = new Random();
		int result = random.nextInt(high - low + 1) + low;
		return result;
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
		if(c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z')
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
		
		// Test randomInRange
		int value = randomInRange(5, 10);
		System.out.println("Random number between 5 and 10: " + value);
		
		// Test isAlpha
		char myChar = '9';
		boolean isLetter = isAlpha(myChar);
		if(isLetter)
		{
			System.out.println(myChar + " is a letter");
		}
		else
		{
			System.out.println(myChar + " is NOT a letter");
		}
		
	}
}
