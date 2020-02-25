/**
 * Demonstrates various for-loops.
 * @author Marissa Schmidt
 */
public class ForLoops
{
	public static void main(String[] args)
	{
		// Print numbers from 1 to 5
		int count = 1;
		while(count <= 5)
		{
			System.out.println(count);
			count++;
		}
		
		// Print numbers from 1 to 5
		for(int i = 1; i <= 5; i++)
		{
			System.out.println(i);
		}
		
		// Print only odd numbers from 1 to 5
		for(int i = 1; i <= 5; i++)
		{
			if(i % 2 == 1)
			{
				System.out.println(i);
			}
		}
		
		// Print numbers from 5 down to 1
		for(int i = 5; i >= 1; i--)
		{
			System.out.println(i);
		}
		
		// Print all multiples of 3 from 3 to 300 (skip all other numbers)
		for(int i = 3; i <= 300; i += 3)
		{
			System.out.println(i);
		}
		
		// Print all multiples of 3 from 3 to 300 (iterate over all numbers)
		for(int i = 3; i <= 300; i++)
		{
			if(i % 3 == 0)
			{
				System.out.println(i);
			}
		}

		// Print numbers from 3 to 300. If number is multiple of 3, print hello instead.
		for(int i = 3; i <= 300; i++)
		{
			if(i % 3 == 0)
			{
				System.out.println("hello");
			}
			else
			{
				System.out.println(i);
			}
		}
		
		// Compute the sum of integers from 15 to 27, inclusive, 
		// and then print the result.
		int sum = 0;
		
		for(int i = 15; i <= 27; i++)
		{
			//System.out.print(i + " ");
			sum = sum + i;
		}
		System.out.println("Sum is: " + sum);

		
		// Print every character of the string, one per line.
		String name = "snoopy";
		for(int i = 0; i < name.length(); i++)
		{
			char c = name.charAt(i);
			System.out.println("character " + i + " is " + c);
		}
		
		// Print every other character of the string, one per line.
		for(int i = 0; i < name.length(); i++)
		{
			if(i % 2 == 0) // even
			{
				char c = name.charAt(i);
				System.out.println("character " + i + " is " + c);
			}
		}
	}
}
