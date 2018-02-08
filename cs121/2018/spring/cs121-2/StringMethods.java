/**
 * Demonstrates how to use methods of the String class.
 * 
 * @author cs121-2
 * @version Spring 2018
 */
public class StringMethods
{
	public static void main(String[] args)
	{
		String phrase = "        gooogooo haahaa asdf        ";
		
		System.out.println("Before: [" + phrase + "]");
		
		// Modify the string using replace(orig, new), toUpperCase(), and trim()
		phrase = phrase.replace('o', 'u');
		phrase = phrase.toUpperCase();
		phrase = phrase.trim();
		
		System.out.println("After: [" + phrase + "]");
		
		// Use length() to get the length of the string
		System.out.println("The length of the string is " + phrase.length());
		
		// Use charAt(index) to get a character at a specific index
		char first = phrase.charAt(0);
		System.out.println("The first char is " + first);
		System.out.println("The first letter of second word is " + phrase.charAt(7));
		
		// Use indexOf(char) to get the index of a specific character
		int spaceIndex = phrase.indexOf(' ');
		System.out.println(spaceIndex);
		
		// Get the index of the next occurance of the character
		int nextSpaceIndex = phrase.indexOf(' ', spaceIndex+1);
		System.out.println(nextSpaceIndex);
		
		// Use substring(start, end) to get a substring
		String secondWord = phrase.substring(spaceIndex+1, nextSpaceIndex);
		System.out.println(secondWord);
	}
}
