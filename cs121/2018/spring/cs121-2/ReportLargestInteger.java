import java.util.Scanner;

/**
 * Uses a while loop to read values from the user and report the largest int.
 * @author marissa, cs121-2
 * @version Spring 2018
 */
public class ReportLargestInteger
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		int input = 1;
		int max = 0;
		
		while(input > 0)
		{
			System.out.print("Enter an integer (0 or negative value to quit): ");
			input = Integer.parseInt(scan.nextLine());
			
			// if the number they entered is larger than your current max, change
			// the max to their number.
			if(input > max)
			{
				max = input;
			}
		}
		
		// Only report the largest integer if they actually entered an integer.
		if(max > 0)
		{
			System.out.println("Your largest integer was " + max);
		}
		
		scan.close();
	}
}
