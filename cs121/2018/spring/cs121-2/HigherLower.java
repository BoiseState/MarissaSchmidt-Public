import java.util.Random;
import java.util.Scanner;

/**
 * Plays a game of Higher-Lower.
 * @author cs121-2
 * @version Spring 2018
 */
public class HigherLower
{
	public static void main(String[] args)
	{	
		// 1. Generate number between 1 and 10
		Random random = new Random();
		int value = random.nextInt(10) + 1;
		
		// 2. Read a number from the user
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number between 1 and 10: ");
		int guess = scan.nextInt();
		
		// 3. Check if they are equal
		if(value == guess)
		{
			System.out.println("You guessed it! Great job! :D");
			System.out.println("Btw, you're awesome.");
		}
		else if(value < guess)
		{
			System.out.println("Lower.");
		}
		else if(value > guess)
		{
			System.out.println("Higher");
		}
		
		// 4. Print results.
		System.out.println("My number was " + value);
		System.out.println("Game Over. See you next time!");
		
		scan.close();
	}
}
//