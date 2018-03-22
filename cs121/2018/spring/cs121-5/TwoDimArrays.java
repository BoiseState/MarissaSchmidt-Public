
public class TwoDimArrays
{
	public static void main(String[] args)
	{
		// An array of 10 ints
		int[][] grid = new int[4][3];
		
		int topLeft = grid[0][0];
		
		grid[2][1] = 50;
		
		for(int i = 0; i < grid.length; i++)
		{
			for(int j = 0; j < grid[i].length; j++)
			{
				grid[i][j] = i*grid[i].length + j;
			}
		}
		
		printArray(grid);
	}

	public static void printArray(int[][] array)
	{
		for(int row = 0; row < array.length; row++)
		{
			for(int col = 0; col < array[row].length; col++)
			{
				System.out.print(array[row][col] + " "); // prints an entire row
			}
			System.out.println();
		}
		
	}
	
	
}
