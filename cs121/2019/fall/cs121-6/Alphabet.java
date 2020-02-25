import java.util.Random;
/**
 * Don't forget comments.
 * @author marissaschmidt
 */
public class Alphabet
{
	private final int NUM_LETTERS = 26;
	private char[] letters;
	
	public Alphabet(/* int size */)
	{
		letters = new char[NUM_LETTERS];
		
		// Fill with random letters
		Random random = new Random();
		
		for(int i = 0; i < letters.length; i++) 
		{
			letters[i] = (char)(random.nextInt(NUM_LETTERS) + 'a');
		}
	}
	
	public void swap(int i, int j)
	{
		char temp = letters[i];
		
		letters[i] = letters[j];
		letters[j] = temp;
	}
	
	public String toString()
	{
		String output = "";
		for(char c : letters)
		{
			output += "[" + c + "]";
		}
		return output;
	}
}
