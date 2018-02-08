import java.text.NumberFormat;
import java.util.Locale;

/**
 * Converts coins to dollars. Uses currency format to format output.
 * 
 * @author cs121-2
 */
public class PiggyBank
{
	public static void main(String[] args)
	{
		NumberFormat cF = NumberFormat.getCurrencyInstance();
		
		final double QUARTER_VALUE = .25;
		final double DIME_VALUE = .10;
		final double NICKEL_VALUE = .05;
		final double PENNY_VALUE = .01;

		int numQuarters = 4;
		int numDimes = 10;
		int numNickels = 8;
		int numPennies = 6;

		double dollars = numQuarters * QUARTER_VALUE
							+ numDimes * DIME_VALUE
							+ numNickels * NICKEL_VALUE
							+ numPennies * PENNY_VALUE;

		System.out.println("You have " + cF.format(dollars) + " in your piggy bank.");
	}
}
