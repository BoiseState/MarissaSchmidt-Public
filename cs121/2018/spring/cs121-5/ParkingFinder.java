/**
 * Sample solution for P2: Find Parking.
 * Creates four parking spot objects using the random number generator.
 * 
 * Modified to use command line arguments for seed and parking time.
 */
public class ParkingFinder
{
	public static void main(String[] args)
	{
		if(args.length < 2)
		{
			// print a "usage message"
			System.err.println("Usage: java ParkingFinder <seed> <parkingTime>");
			System.exit(1);
		}
		
		long seed = 0;
		try
		{
			seed = Long.parseLong(args[0]);
			if(seed < 0)
			{
				System.err.println("seed must be positive!");
				System.exit(1);
			}
		}
		catch(NumberFormatException e)
		{
			System.err.println("seed must be a long value");
			System.exit(1);
		}

		int time = Integer.parseInt(args[1]);
		if(time < 0)
		{
			System.err.println("time must be positive!");
			System.exit(1);
		}

		// Solution removed :)
	}
}
