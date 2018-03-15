/**
 * Creates an array of letters of the alphabet and shows
 * how to swap array elements.
 * @author marissa
 * @author cs121-2
 * @version Spring 2018
 */
public class Alphabet
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
		for(int i = 0; i < alphabet.length; i++)
		{
			System.out.print(alphabet[i]);
		}
		
		System.out.println();
		
		// swap elements 1 and 2
		char temp = alphabet[1];
		alphabet[1] = alphabet[2];
		alphabet[2] = temp;
		
		// Print all letters using for-each loop
		for(char c : alphabet)
		{
			System.out.print(c);
		}
		
//		String[] names = new String[5];
//		
//		for(int i = 0; i < names.length; i++)
//		{
//			names[i] = "";
//		}
//		
//		for(int i = 0; i < names.length; i++)
//		{
//			System.out.println(names[i].length());
//		}
	}
}
