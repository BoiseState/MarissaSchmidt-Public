import java.util.Scanner;

/**
 * Rolls a CupOfDice n times. Demonstrates command-line arguments.
 * 
 * @author marissa
 */
public class Yahtzee
{
	public static void main(String[] args)
	{
		// Validate and print usage message
		if(args.length != 1)
		{
			System.err.println("Usage: java Yahtzee <numRolls>");
			System.exit(1);
		}
		
		int numRolls = Integer.parseInt(args[0]);

		// Create a cup of dice and roll n times.
		CupOfDice cup = new CupOfDice();
		System.out.println(cup);
		
		for(int i = 0; i < numRolls; i++)
		{
			cup.roll();
			System.out.println(cup);
		
			Die largest = cup.getMaxDie();
			System.out.println(largest);
		}

	}

}
