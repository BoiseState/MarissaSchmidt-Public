import java.util.Random;
import java.util.Scanner;

/**
 * Lesson 10: Activity - while Loops and Iterators 
 * 
 * @author Java Foundations
 * @author CS121 Instructors
 * @version Fall 2018
 */
public class HigherLower
{
	public static void main(String[] args)
	{
		final int MAX = 10;
		int answer;
		int guess = 0;
		String input = "y";

		Scanner scan = new Scanner(System.in);
		Random random = new Random();

		while(input.equals("y"))
		{
			answer = random.nextInt(MAX) + 1;

			System.out.print("I'm thinking of a number between 1 and " + MAX + ". ");
			System.out.print("Guess what it is: ");
			
			while(guess != answer)
			{
				guess = Integer.parseInt(scan.nextLine());

				if(guess < 1 || guess > MAX) // out of range
				{
					System.out.println("Out of range!");
				}
				else // check if correct
				{
					if(guess == answer) // they won
					{
						System.out.println("You got it! Good guessing!");
					}
					else if(guess < answer)
					{
						System.out.println("Higher.");
					}
					else
					{
						System.out.println("Lower.");
					}
				}
			}
		}


		System.out.println("Game over. Goodbye!");

		scan.close();
	}
}
