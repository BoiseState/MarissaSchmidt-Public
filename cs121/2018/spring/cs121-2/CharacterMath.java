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
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a character: ");
		
		String input = scan.nextLine(); // read entire line of input.
		char letter = input.charAt(0);  // grab just the first character.
		
		// 1. Print the letter and its corresponding ASCII value.
		System.out.println("The ascii value of '" + letter + "' is " + (int)letter + ".");
		
		// 2. Determine if it is a letter or number.
		boolean isLetter; // set to true if letter, false otherwise
		
		if(letter >= 'A' && letter <= 'Z')
		{
			System.out.println("That is an upper-case letter.");
			isLetter = true;
		}
		else if(letter >= 'a' && letter <= 'z')
		{
			System.out.println("That is a lower-case letter.");
			isLetter = true;
		}
		else if(letter >= '0' && letter <= '9')
		{
			System.out.println("That is a number.");
			isLetter = false;
		}
		else
		{
			System.out.println("That is NOT a letter OR a number.");
			isLetter = false;
		}

		// 3. If it is a letter, determine its offset in the alphabet
		if(isLetter)
		{
			char lowerCaseLetter = Character.toLowerCase(letter); // normalize to lower-case first
			int offset = (lowerCaseLetter - 'a') + 1; // (add 1 to account for zero offset)
			
			System.out.println("'" + letter + "' is at position " + offset + " in the alphabet.");
		}
		scan.close();
	}
}
