/**
 * Creates an array of letters of the alphabet and shows
 * how to swap array elements.
 * @author marissa
 * @author cs121-5
 * @version Spring 2018
 */
public class Arrays
{
	public static void main(String[] args)
	{
		// Declare array to store all letters of alphabet
		char[] alphabet = new char[26];
		
		// Use a loop to fill with letters
		for(int i = 0; i < alphabet.length; i++)
		{
			alphabet[i] = (char)('a' + i);
		}
		
		// Print all letters
		for(int i = alphabet.length-1; i >= 0; i--)
		{
			System.out.print("[" + alphabet[i] + "]");
		}
		
		System.out.println();
		
		// TODO: swap elements 2 and 3
		char temp = alphabet[2];
		alphabet[2] = alphabet[3];
		alphabet[3] = temp;
		
		// Print all letters using for-each loop
		for(char c : alphabet)
		{
			System.out.print("[" + c + "]");
		}
	}
}
