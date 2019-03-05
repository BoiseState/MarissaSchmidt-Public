import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;
/**
 * Demonstrates use of ArrayList.
 * 
 * @author marissa
 */
public class WordList
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);

		// Instantiate a new ArrayList to hold random words
		ArrayList<String> myWords = new ArrayList<String>();
		
		System.out.println("List size: " + myWords.size());
		
		String input = "";
		
		while(!input.equalsIgnoreCase("n")) // until they enter n
		{
			System.out.print("Enter a word (n to quit):"); //prompt
			input = scan.nextLine().trim(); // read word
			
			if(!input.equalsIgnoreCase("n"))
			{
				myWords.add(input); // add their word
			}
		}
		
		// Add words to the list manually
//		myWords.add("peanut");
//		myWords.add("Monkey");
//		myWords.add("bananas");
//		myWords.add(1, "snow");

		// Print size, whether or not it is empty
		if(myWords.isEmpty())
		{
			System.out.println("No words!");
		}
		else
		{
			System.out.println(myWords);
		}
		
		// Check if it contains something
		if(myWords.contains("Snow"))
		{
			System.out.println("We have snow");
		}
		else
		{
			System.out.println("It's raining");
		}
		
		// Print using toString
		
		// Use a for loop to print all words
		for(int i = myWords.size()-1; i > 0; i--)
		{
			String word = myWords.get(i);
			System.out.println(word);
		}
		
		// Use a for-each loop to print all words
		for(String s : myWords)
		{
			System.out.println(s);
		}
		
		// Use an iterator to print all words
		Iterator<String> iterator = myWords.iterator();
		while(iterator.hasNext())
		{
			String word = iterator.next();
			System.out.println(word);
		}
		
		// Select random word from list
		Random rand = new Random();
		int randomIndex = rand.nextInt(myWords.size());
		String randomWord = myWords.get(randomIndex);
		System.out.println("My random word: " + randomWord);
		
		// Find longest word
		String largest = myWords.get(0); // first word
		for(String word : myWords)
		{
			if(word.length() > largest.length())
			{
				largest = word;
			}
		}
		System.out.println("Longest word: " + largest);
		
		// Find average word length
		int sum = 0;
		for(int i = 0; i < myWords.size(); i++)
		{
			String word = myWords.get(i); // get next word in list
			sum = sum + word.length();
		}
		double averageWordLength = (double) sum / myWords.size();
		System.out.println("Average word length: " + averageWordLength);
		
		
		scan.close();
	}
}
