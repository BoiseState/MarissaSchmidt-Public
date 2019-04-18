import java.util.Scanner;

/**
 * Tests CupOfDice.
 * @author marissa
 *
 */
public class Yahtzee {

	public static void main(String[] args)
	{
		if(args.length != 1)
		{
			System.err.println("Usage: java Yahtzee <num rolls>");
			System.exit(1);
		}
	
		
		int numRolls = Integer.parseInt(args[0]);
		
		CupOfDice cup = new CupOfDice();
		
		for(int i = 0; i < numRolls; i++)
		{
			cup.roll();
			System.out.println(cup);
		}
	}

}
