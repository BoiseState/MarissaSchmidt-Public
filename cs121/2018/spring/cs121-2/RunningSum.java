/**
 * Computes the sum of even numbers and odd numbers from 10 to 100.
 * 
 * @author marissa, cs121-2
 */
public class RunningSum
{
	public static void main(String[] args)
	{
		int evenSum = 0;
		int oddSum = 0;
		
		for(int i = 10; i <= 100; i++)
		{
			if(i % 2 == 0)
			{
				evenSum += i;
			}
			else
			{
				oddSum += i;
			}
		}
		System.out.println("Even sum: " + evenSum);
		System.out.println("Odd sum: " + oddSum);
	}
}
