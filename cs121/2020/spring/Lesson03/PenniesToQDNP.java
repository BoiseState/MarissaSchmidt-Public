import java.util.Scanner;
/**
 * Converts to Quarters, dimes, nickesl, pennies
 * @author marissaschmidt
 */
public class PenniesToQDNP
{
	public static void main(String[] args)
	{
		final int PENNIES_PER_QUARTER = 25;
		final int PENNIES_PER_DIME = 10;
		final int PENNIES_PER_NICKEL = 5;
		
		Scanner kbd = new Scanner(System.in);
		
		// Prompt user
		System.out.println("Enter total number of pennies: ");
		
		// Read total number of pennies from user
		int totalPennies = kbd.nextInt();
		
		System.out.println(totalPennies);
		
		int numQuarters;
		int numDimes;
		int numNickels;
		int numPennies;
		int remainder;
		
		numQuarters = totalPennies / PENNIES_PER_QUARTER;
		remainder = totalPennies % PENNIES_PER_QUARTER;
		
		numDimes = remainder / PENNIES_PER_DIME;
		remainder = remainder % PENNIES_PER_DIME;
		
		numNickels = remainder / PENNIES_PER_NICKEL;
		remainder = remainder % PENNIES_PER_NICKEL;
		
		numPennies = remainder;
		
		System.out.println("Quarters: " + numQuarters);
		System.out.println("Dimes: " + numDimes);
		System.out.println("Nickels: " + numNickels);
		System.out.println("Pennies: " + numPennies);
		
		kbd.close(); // disconnect the scanner from the keyboard when we are done.
	}
}
