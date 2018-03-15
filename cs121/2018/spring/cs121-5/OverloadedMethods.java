/**
 * Demonstrates overloaded methods.
 * @author marissa
 * @author cs121-5
 * @version Spring 2018
 */
public class OverloadedMethods
{
	/**
	 * Returns the sum of a and b.
	 * @param a a number
	 * @param b another number
	 * @return the sum of the two values
	 */
	public static int add(int a, int b)
	{
		return a + b;
	}
	
	/**
	 * Returns the sum of a and b.
	 * @param a a number
	 * @param b another number
	 * @return the sum of the two values
	 */
	public static double add(double a, double b)
	{
		return a + b;
	}
	
	/**
	 * Returns the sum of a and b.
	 * @param a a number
	 * @param b another number
	 * @param c another number
	 * @return the sum of the two values
	 */
	public static int add(int a, int b, int c)
	{
		return a + b + c;
	}
	
	public static void main(String[] args)
	{
		add(4, 5);
		
		add(5.0, 6.3);
		
		add(1, 2, 3);
	}
}
