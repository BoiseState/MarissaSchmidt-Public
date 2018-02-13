/**
 * Demonstrates various while loops.
 * @author cs121-2, marissa
 * @version Spring 2018
 */
public class WhileLoops
{
	public static void main(String[] args)
	{
		int numCookies = 6; // starting condition

		while(numCookies > 0) // ending condition
		{
			System.out.println("Here's a cookie!"); // what we do every time
			numCookies = numCookies - 1; // loop counter
		}
		
		//*******
		// Print numbers from 1 to 5
		//*******
		int count = 1; // starting condition

		while(count <= 5) // ending condition
		{
			System.out.print(count + " "); // what we do every time
			count++; // loop counter
		}
		System.out.println();
		
		//*******
		// Print numbers from 5 to 0
		//*******
		count = 5; // starting condition (reset count because it is used in previous loop)

		while(count >= 1) // ending condition
		{
			System.out.print(count + " "); // what we do every time
			count--; // loop counter
		}
		System.out.println();
		
		
		//*******
		// Print even numbers from 0 to 10
		//*******
		count = 0; // starting condition (reset count because it is used in previous loop)

		while(count <= 10)
		{
			if(count % 2 == 0) // if even
			{
				System.out.print(count + " ");
			}
			count++;
		}
	}
}
