import java.util.Scanner;

/**
 * Demonstrates character math.
 * @author cs121-2
 * @version Spring 2018
 */
public class CharacterMath
{
	public static void main(String[] args)
	{
		// 1. Read in a character
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a character: ");
		String input = scan.nextLine();
		
		char c = input.charAt(0);
		
		// 2. Print the character and its corresponding ASCII value.
		System.out.println("Character " + c + " has ASCII value " + (int)c);
		
		// 3. Determine if it is a letter or number.
		boolean isLetter; // set to true if letter, false otherwise

		if(c >= 'a' && c <= 'z')
		{
			System.out.println("It is a lower case letter.");
			isLetter = true;
		}
		else if(c >= 'A' && c <= 'Z')
		{
			System.out.println("It is an upper case letter.");
			isLetter = true;
		}
		else if(c >= '0' && c <= '9')
		{
			System.out.println("It is a number.");
			isLetter = false;
		}
		else
		{
			System.out.println("It was not a letter or a number.");
			isLetter = false;
		}
		
		// 4. If it is a letter, determine its offset in the alphabet (letter - 'a')
		if(isLetter)
		{
			// Determine offset into the alphabet.
			char upperCaseC = Character.toUpperCase(c);
			
			int offset = (upperCaseC - 'A') + 1; // add one to account for zero offset
			System.out.println("That is the " + offset + " letter of the alphabet.");
		}
		
		// 5. Do the opposite. Given an offset, determine the letter.
		int otherOffset = 3;
		char letter = (char)(otherOffset + 'A');
		System.out.println("The letter at offset " + otherOffset + " is " + letter);
		
		scan.close();
	}
}
