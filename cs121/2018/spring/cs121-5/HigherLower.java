import java.util.Random;
import java.util.Scanner;

/**
 * Plays a game of Higher-Lower
 * @author cs121-5
 * @version Spring 2018
 */
public class HigherLower
{
	public static void main(String[] args)
	{
		// 1. Generate random number between 1 and 10
		Random random = new Random();
		int value = random.nextInt(10) + 1;
		
		// 2. Read a number from the user
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number between 1 and 10: ");
		int guess = scan.nextInt();
		System.out.println("Guess: " + guess);
		
		// 2.5 Validate that their number is in range
		if(guess >= 1 && guess <= 10)
		{
			// 3. Check if numbers are equal
			if(value == guess)
			{
				System.out.println("You guessed it! You're awesome! :D");
				System.out.println("And you won!");
			}
			else if(value < guess)
			{
				System.out.println("Lower.");
			}
			else if(value > guess)
			{
				System.out.println("Higher.");
			}
		
			System.out.println("My number was " + value);
			System.out.println("Game Over. See you next time");
		}
		else
		{
			System.out.println("Enter a number between 1 and 10");
		}
		scan.close();
	}
}
