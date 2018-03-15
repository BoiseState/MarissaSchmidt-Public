import java.io.File;
/**
 * Demonstrates how to validate and use multiple command-line arguments.
 * @author marissa
 * @author cs121-2
 * @version Spring 2018
 */
public class CommandLineArgs
{
	public static void main(String[] args)
	{
		// Validate that they passed in at least 1 file name
		if(args.length < 1)
		{
			System.err.println("Usage: java CommandLineArgs file1 [file2 ...]");
			System.exit(1);
		}
		
		// Iterate through list of file names
		for(String arg : args)
		{
			File file = new File(arg);
			System.out.println(file);
			// Check if file exists
			// Create TextStatistics object
			// Print TextStatistics object
		}
	}
}
