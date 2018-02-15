/**
 * Demonstrates various for loops.
 * @author cs121-5, marissa
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
		// Print multiples of 3 from 3 to 300
		// This goes through the loop 99 times, skipping to the next multiple
		//*******
		for(int i = 3; i <= 300; i += 3)
		{
			System.out.print(i + " ");
		}
		System.out.println();
		
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
		String name = "hello";
		// index       01234
		for(int i = 0; i < name.length(); i++)
		{
			System.out.println(name.charAt(i));
		}
		
		//*******
		// Print star pattern using nested for loop
		//*******
		final int MAX_ROWS = 5;

		for(int row = MAX_ROWS; row > 0; row--)
		{
			for(int star = 0; star < row; star++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
