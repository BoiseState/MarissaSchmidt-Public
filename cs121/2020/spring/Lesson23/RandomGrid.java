import java.util.Random;

/**
 * This class represents a 2-dimensional grid of random numbers.
 * @author marissaschmidt
 */
public class RandomGrid
{
	// Instance Variables
	private final int MAX_VALUE = 10;
	
	private Random random;
	private int[][] grid;
	
	// Constructor(s)
	/**
	 * Creates a random nxm grid containing random numbers between 0-10.
	 * @param n The number of rows.
	 * @param m The number of columns.
	 */
	public RandomGrid(int n, int m)
	{
		// Instantiate array
		grid = new int[n][m];
		
		// Instantiate Random object
		random = new Random();
		
		// Fill array with values
		for(int i = 0; i < grid.length; i++)
		{
			for(int j = 0; j< grid[i].length; j++)
			{
				grid[i][j] = random.nextInt(MAX_VALUE+1); // random number between 0 and 10.
			}
		}
	}
	
	// Methods
	
	// toString

	public String toString()
	{
		String output = "";
		
		for(int i = 0; i < grid.length; i++)
		{
			for(int j = 0; j < grid[i].length; j++)
			{
				output += grid[i][j] + " ";
			}
			output += "\n";
		}
		return output;
	}
}
