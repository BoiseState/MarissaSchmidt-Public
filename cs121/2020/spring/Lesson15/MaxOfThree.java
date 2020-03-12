import java.util.Random;

/**
 * Demonstrates several methods.
 * 
 * @author marissa
 */
public class MaxOfThree
{

	public static void main(String[] args)
	{
		// Call the maxOfThree method
		int a = 3, b = 6, c = 10;
		int myMax = maxOfThree(a, b, c);
		System.out.println(myMax);
		
		
		// Call the overloaded add method with different parameter types.
		add(4, 5); // integers
		add("hello", "bye"); // strings
	}
	
	/**
	 * Returns the maximum of three integers.
	 * @param x
	 * @param y
	 * @param z
	 * @return The largest integer.
	 */
	public static int maxOfThree(int x, int y, int z)
	{
		int max = Math.max(x, y);
		max = Math.max(max, z);
		return max;
	}
	
	/**
	 * Returns the value of x cubed.
	 * @param x
	 * @return The value of x cubed.
	 */
	public int cube(int x)
	{
		return (int)Math.pow(x, 3);
	}
	
	/**
	 * Returns a random number within the given range.
	 * @param low 
	 * @param high
	 * @return A random integer between low and high (inclusive)
	 */
	public int randomInRange(int low, int high)
	{
		Random rand = new Random();
		int number = rand.nextInt(high - low + 1) + low;
		return number;
	}

	/**
	 * Checks if a given character is a letter.
	 * @param c The character.
	 * @return true if it is, false otherwise.
	 */
	public boolean isAlpha(char c)
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
	
	/**
	 * Adds a and b.
	 * @param a An integer value.
	 * @param b An integer value.
	 * @return The result of a plus b.
	 */
	public static int add(int a, int b)
	{
		return a + b;
	}
	
	/**
	 * Adds a and b.
	 * @param a A floating point value.
	 * @param b A floating point value.
	 * @return The result of a plus b.
	 */
	public static double add(double a, double b)
	{
		return a + b;
	}
	
	/**
	 * Adds a and b.
	 * @param a A string.
	 * @param b A string.
	 * @return The result of a plus b.
	 */
	public static String add(String a, String b)
	{
		return a + b;
	}
}
