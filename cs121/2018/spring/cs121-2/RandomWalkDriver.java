/**
 * Driver class to test the RandomWalk.
 * 
 * Modified to use command-line arguments instead of Scanner.
 * 
 * @author marissa
 */
public class RandomWalkDriver
{
	public static void main(String[] args)
	{
		// Validate number of arguments
		if(args.length < 2)
		{
			System.err.println("Usage: RandomWalkDriver <gridSize> <seed>");
			System.exit(1);
		}
		
		int gridSize = 0;
		long seed = 0;
		
		// Read and validate gridSize
		try
		{
			gridSize = Integer.parseInt(args[0]);
			if (gridSize <= 0)
			{
				System.err.println("gridSize must be positive!");
				System.exit(1);
			}
		}
		catch(NumberFormatException e)
		{
			System.err.println("gridSize must be an integer!");
			System.exit(1);
		}
		
		// Read and validate seed
		try
		{
			seed = Long.parseLong(args[1]);
			if (seed < 0)
			{
				System.err.println("seed must be positive!");
				System.exit(1);
			}
		}
		catch(NumberFormatException e)
		{
			System.err.println("seed must be a long!");
			System.exit(1);
		}

		// Commenting out RandomWalk stuff so it will compile without
		// the RandomWalk class.
		/*
		RandomWalk myWalk;
		if (seed == 0)
		{
			myWalk = new RandomWalk(gridSize);
		}
		else
		{
			myWalk = new RandomWalk(gridSize, seed);
		}
		
		myWalk.createWalk();
		System.out.println(myWalk);
		*/
	}
}
