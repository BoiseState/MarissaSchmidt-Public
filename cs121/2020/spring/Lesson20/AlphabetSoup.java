import java.util.Random;

/**
 * This is the driver class that uses the Alphabet class.
 * @author marissaschmidt
 *
 */
public class AlphabetSoup
{
	public static void main(String[] args)
	{
		Random random = new Random();
		
		// Instantiate an Alphabet object
		Alphabet alphabet = new Alphabet();
		
		System.out.println(alphabet);
		
		alphabet.swap(1, 2); // swap letters at index 1 and 2
		
		alphabet.swap(24, 25);
		
		// Invalid swap, should do nothing.
		alphabet.swap(-10, 26);
		
		// Randomly swap letters 100 times.
		for(int i = 0; i < 100; i++)
		{
			int randomI = random.nextInt(alphabet.getNumLetters());
			int randomJ = random.nextInt(alphabet.getNumLetters());
			alphabet.swap(randomI, randomJ);
		}
		
		// Print alphabet after swaps
		System.out.println(alphabet);
		
		
	}
}
