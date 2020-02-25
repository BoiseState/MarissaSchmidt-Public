
public class ArrayStuff {

	public static void main(String[] args)
	{
		int[][] array = new int[3][5];
		
		System.out.println(array.length);
		System.out.println(array[0].length);
		
		
		// for each row in the array
		for(int row = 0; row < array.length; row++)
		{
			// for each column in that row
			for(int col = 0; col < array[row].length; col++)
			{
				array[row][col] = col + row * array[row].length;
			}
		}
		
		for(int row = 0; row < array.length; row++)
		{
			// for each column in that row
			for(int col = 0; col < array[row].length; col++)
			{
				System.out.printf("%3d ", array[row][col]);
			}
			System.out.println();
		}

	}

}
