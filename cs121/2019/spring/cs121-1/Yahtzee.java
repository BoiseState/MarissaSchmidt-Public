import java.util.Scanner;

/**
 * Creates and uses a CupOfDice.
 * Usage: java Yahtzee <number of rolls>
 * @author marissa
 *
 */
public class Yahtzee {

	public static void main(String[] args) {
		
		// Make sure they pass in 1 command line argument
		if(args.length != 1)
		{
			System.err.println("Usage: java Yahtzee <number of rolls>");
			System.exit(1);
		}
		
		int times = Integer.parseInt(args[0]);
		
		CupOfDice cup = new CupOfDice();
		
		for(int i = 0; i < times; i++)
		{
			cup.shakeAndRoll();
		
			System.out.println(cup);
		}

	}

}
