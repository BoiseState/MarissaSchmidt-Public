/**
 * Demonstrates various for-loops.
 * @author Marissa Schmidt
 */
public class ForLoops
{
	public static void main(String[] args)
	{
		// Print numbers from 1 to 5
//		int count = 1;
//		while(count <= 5)
//		{
//			System.out.println(count);
//			count++;
//		}
		
		// Print numbers from 1 to 5
		for(int i = 1; i <= 5; i++)
		{
			System.out.print(i + " ");
		}
		System.out.println();
		
		// Print only odd numbers from 1 to 5
		for(int i = 1; i <= 5; i += 2)
		{
			System.out.print(i + " ");
		}
		System.out.println();
		
		for(int i = 1; i <= 5; i++)
		{
			if(i % 2 == 1) //odd
			{
				System.out.print(i + " ");
			}
		}
		System.out.println();
		
		// Print numbers from 5 down to 1
		for(int count = 5; count >= 1; count--)
		{
			System.out.print(count + " ");
		}
		System.out.println();
		
		// Print all multiples of 3 from 3 to 300 (skip all other numbers)
		for(int i = 3; i <= 300; i += 3)
		{
			System.out.print(i + " ");
		}
		System.out.println();
		
		// Print all multiples of 3 from 3 to 300 (iterate over all numbers)
		for(int i = 5; i <= 300; i++)
		{
			if(i % 3 == 0) // multiple of 3
			{
				System.out.print(i + " ");
			}
		}
		System.out.println();

		// Print numbers from 3 to 300. If number is multiple of 3, 
		// print hello instead.
		for(int i = 3; i <= 300; i++)
		{
			if(i % 3 == 0)
			{
				System.out.print("hello ");
			}
			else
			{
				System.out.print(i + " ");
			}
		}
		System.out.println();
		
		// Compute the running sum of integers from 15 to 27, inclusive, 
		// and then print the result.
		int sum = 0;
		for(int i = 15; i <= 27; i++)
		{
			sum = sum + i;
		}
		System.out.println(sum);
		
		
		// Print every character of the string, one per line.
		String word = "Hello";
		for(int i = 0; i <= word.length()-1; i += 2)
		{
			char c = word.charAt(i);
			System.out.println(c);
		}
		// Print every other character of the string, one per line.
		int totalAsciiValue = 0;
		for(int i = 0; i < word.length(); i++)
		{
			char c = word.charAt(i);
			int asciiValue = c;
			totalAsciiValue = totalAsciiValue + asciiValue;
		}
		System.out.println((char)totalAsciiValue);
	}
}
