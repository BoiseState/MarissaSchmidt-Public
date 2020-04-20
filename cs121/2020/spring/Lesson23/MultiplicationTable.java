/**
 * This creates and prints a multiplication table.
 * 
 * @author marissaschmidt
 *
 */
public class MultiplicationTable
{
	public static void main(String[] args)
	{
		int n = 4;
		
		// Declare a 4x4 array of integers
		int[][] table = new int[n][n];
		
		// Fill the array with values
		for(int i = 0; i < table.length; i++)
		{
			for(int j = 0; j < table[i].length; j++)
			{
				table[i][j] = i * j; // value at index i, j equals i * j
			}
		}
		
		// Print all values in array
		for(int i = 0; i < table.length; i++) // rows
		{
			for(int j = 0; j < table[i].length; j++) // cols
			{
				System.out.print(table[i][j] + " ");
			}
			System.out.println(); // prints a new line after each row
		}
	}
}
