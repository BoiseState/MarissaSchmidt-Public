/**
 * Demonstrates how to use methods of the String class.
 * 
 * @author cs121-5
 * @version Spring 2018
 */
public class StringMethods
{
	public static void main(String[] args)
	{
		String phrase = "apples and bananas";
		System.out.println("Phrase: " + phrase);
		
		int length = phrase.length();
		System.out.println("String length: " + length);
		
		char firstLetter = phrase.charAt(0);
		System.out.println("First character: " + firstLetter);
		
		char bananaLetter = phrase.charAt(11);
		System.out.println("11th character: " + bananaLetter);
		
		int spaceIndex = phrase.indexOf(' ');
		System.out.println("Index of space character: " + spaceIndex);
		
		int secondSpaceIndex = phrase.indexOf(' ', spaceIndex+1);
		System.out.println("Index of second space character: " + secondSpaceIndex);
		
		String secondWord = phrase.substring(spaceIndex+1, secondSpaceIndex);
		System.out.println("Second word: " + secondWord);
		
		// Replace all 'a' characters with 'e'
		phrase = phrase.replace('a', 'e');
		// Convert entire phrase to upper case
		phrase = phrase.toUpperCase();
		
		System.out.println("My new phrase is: " + phrase);

	}

}
