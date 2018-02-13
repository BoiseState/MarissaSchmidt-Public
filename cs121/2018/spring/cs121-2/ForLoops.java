/**
 * Demonstrates various for loops.
 * @author cs121-2, marissa
 * @version Spring 2018
 */
public class ForLoops
{
	public static void main(String[] args)
	{
		//*******
		// Print multiples of 3 from 3 to 300
		// This goes through the loop 297 times and iterates over every number
		//*******
		for(int i = 3; i <= 300; i++) 
		{
			if(i % 3 == 0)
			{
				System.out.print(i + " ");
			}
		}
		System.out.println();
		
		//*******
		// Print multiples of 3 from 3 to 300. If not a multiple of 3, print *.
		// This goes through the loop 297 times and iterates over every number
		//*******
		for(int i = 3; i <= 300; i++) 
		{
			if(i % 3 == 0)
			{
				System.out.print(i + " ");
			}
			else
			{
				System.out.print("*" + " ");
			}
		}
		
		//*******
		// Print multiples of 3 from 3 to 300
		// This goes through the loop 100 times, skipping to the next multiple
		//*******
		for(int i = 3; i <= 300; i = i + 3)
		{
			System.out.print(i + " ");
		}
		System.out.println();
		
		//*******
		// Print running sum of multiples of 3 from 3 to 300
		// This goes through the loop 100 times, skipping to the next multiple
		//*******
		int sum = 0;
		for(int i = 3; i <= 300; i = i + 3)
		{
			sum += i;
		}
		System.out.println("The sum of multiples of 3 from 3 to 300 is : " + sum);
		
		//*******
		// Print running sum of multiples of 3 from 300 down to 3
		// This goes through the loop 100 times, skipping to the next multiple
		//*******
		for(int i = 300; i >= 3; i = i - 3)
		{
			System.out.print(i + " ");
		}
		System.out.println();
		
		//*******
		// Print every character of input string, one per line
		//*******
		String input = "hello";
		// index value: 01234
		for(int i = 0; i < input.length(); i++)
		{
			System.out.println(input.charAt(i));
		}
	}
}
