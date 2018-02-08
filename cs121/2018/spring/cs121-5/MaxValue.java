/**
 * Prints out the maximum value of two ints.
 * @author cs121-5
 *
 */
public class MaxValue
{
	public static void main(String[] args)
	{
		int num1 = 5;
		int num2 = 5;
		int num3 = 6;
		
		int max;
		
		if(num1 > num2)
		{
			max = num1;
		}
		else
		{
			max = num2;
		}
		
		System.out.println("Max value is " + max);
	}
}
