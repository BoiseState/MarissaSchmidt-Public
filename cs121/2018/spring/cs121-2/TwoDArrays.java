
public class TwoDArrays
{
	public static void main(String[] args)
	{
		int[][] grid = new int[4][5];
		
		// add another loop to fill with multiplication table
		for(int i = 0; i < grid.length; i++)
		{
			for(int j = 0; j < grid[i].length; j++)
			{
				grid[i][j] = j + (i*grid[i].length);
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
				int value = array[row][col];
				System.out.print(value + " ");
			}
			System.out.println();
		}
	}
}
