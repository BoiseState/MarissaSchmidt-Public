import java.util.Scanner;

/**
 * Uses a while loop to read values from the user and report the largest int.
 * @author marissa, cs121-5
 * @version Spring 2018
 */
public class MaxInteger
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		int input = 1; // starting condition
		int max = 0;
		
		while(input > 0) // ending condition
		{
			System.out.print("Enter an integer: ");
			input = Integer.parseInt(scan.nextLine());
			
			if(input > max)
			{
				max = input;
			}
		}
		
		if(max > 0)
		{
			System.out.println("Your largest integer was " + max);
		}
		else
		{
			System.out.println("You didn't enter a positive number");
		}
		
		scan.close();
	}
}
