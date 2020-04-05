/**
 * Demonstrates how to use an array to store the letters of the alphabet.
 * @author marissaschmidt
 *
 */
public class Alphabet
{
	private char[] letters;
	
	/**
	 * Initializes the letters of the alphabet from A - Z.
	 */
	public Alphabet()
	{
		letters = new char[26];
		
		for(int i = 0; i < letters.length; i++)
		{
			letters[i] = (char)('A' + i);
		}
	}
	
	/**
	 * Swaps the letters at index i and j.
	 * @param i The index of the first element to swap.
	 * @param j The index of the second element to swap.
	 */
	public void swap(int i, int j)
	{
		// Bounds checking to ensure indices are valid.
		if(i >= 0 && i < letters.length && j >= 0 && j < letters.length)
		{
			char temp = letters[i];
			letters[i] = letters[j];
			letters[j] = temp;
		}
	}
	
	/**
	 * Returns the number of letters in the alphabet.
	 * @return The number of letters.
	 */
	public int getNumLetters()
	{
		return letters.length;
	}
	
	@Override
	public String toString()
	{
		String output = "";
		for(char c : letters)
		{
			output += c + " ";
		}
		return output;
	}
}
