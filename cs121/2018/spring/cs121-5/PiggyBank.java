import java.text.NumberFormat;
/**
 * Converts coins to dollars and demonstrates Number Formatting.
 * 
 * @author CS121-5
 */
public class PiggyBank
{
	public static void main(String[] args)
	{
		NumberFormat cf = NumberFormat.getCurrencyInstance();
		NumberFormat pf = NumberFormat.getPercentInstance();
		
		final double QUARTER_VALUE = .25;
		final double DIME_VALUE = .10;
		final double NICKEL_VALUE = .05;
		final double PENNY_VALUE = .01;

		int numQuarters = 4;
		int numDimes = 10;
		int numNickels = 8;
		int numPennies = 6;

		double dollars = numQuarters * QUARTER_VALUE + numDimes * DIME_VALUE + numNickels * NICKEL_VALUE + numPennies * PENNY_VALUE;

		double taxRate = 0.06;
		
		double amountWithTax = dollars * (1 + taxRate);
		
		System.out.println("You have " + cf.format(dollars) + " in your piggy bank.");
		
		System.out.println("The new amount with " + pf.format(taxRate) + " tax is " + cf.format(amountWithTax));
	}
}
