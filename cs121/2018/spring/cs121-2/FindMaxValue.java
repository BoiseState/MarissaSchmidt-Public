/**
 * Finds the maximum value of a given set of numbers.
 * 
 * @author cs121-2
 * @version Spring 2018
 */
public class FindMaxValue
{
	public static void main(String[] args)
	{
		int num1 = 3;
		int num2 = 4;
		int num3 = 5;
		
		int max;
		
		// using if-statement
		if(num1 > num2)
		{
			max = num1;
		}
		else
		{
			max = num2;
		}
		
		// using ternary operator
		//max = (num1 > num2) ? num1 : num2;
		
		System.out.println("The larger of the two is " + max);
	}
}
