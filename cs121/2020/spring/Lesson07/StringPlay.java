import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

/**
 * Demo strings and number formatting.
 * 
 * @author marissaschmidt
 */
public class StringPlay
{
	public static void main(String[] args)
	{
		String sentence = "Hello World";
		
		int length = sentence.length();
		System.out.println(length);
		
		char firstLetter = sentence.charAt(0);
		System.out.println(firstLetter);
		
		char lastLetter = sentence.charAt(sentence.length()-1);
		System.out.println(lastLetter);

		String firstWord = sentence.substring(0, 5);
		System.out.println(firstWord);
		
		String secondWord = sentence.substring(6, sentence.length());
		// or String secondWord = sentence.substring(6);
		System.out.println(secondWord);
		
		// Find the index of the space char
		int spaceIndex = sentence.indexOf(' ');
		System.out.println("index:" + spaceIndex);
		
		// Use the space index as the end point of the first word
		String firstWord = sentence.substring(0, spaceIndex);
		System.out.println(firstWord);
		
		// Use the space index as the start point of the second word
		String secondWord = sentence.substring(spaceIndex+1, sentence.length());
		System.out.println(secondWord);
		

		double value = 45.677;

		// Use DecimalFormat to print to 2 decimal places
		DecimalFormat df = new DecimalFormat("#.00");
		System.out.println("My value is: " + df.format(value));
		
		// Use Currency formatter to print to 2 decimal places and add dollar sign
		NumberFormat currencyFmt = NumberFormat.getCurrencyInstance();
		System.out.println("Currency: " + currencyFmt.format(value));
	}
}
