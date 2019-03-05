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
		ArrayList<String> wordList = new ArrayList<String>();
		
		System.out.println("Size: " + wordList.size());
		
		// Add words to the list manually
		wordList.add("hello");
		wordList.add("hi");
		wordList.add("bye");
		wordList.add(1, "ant");
		
		// clear the list before reading new words
//		wordList.clear();
		
		// Use while loop to add words from user
//		String input = "";
//		while(!input.equalsIgnoreCase("q")) // input != q
//		{
//			System.out.print("Enter a word (q to quit): ");
//			input = scan.nextLine();
//			
//			if(!input.equalsIgnoreCase("q")) // only add if not q
//			{
//				wordList.add(input);
//			}
//		}
		
		//wordList.remove(wordList.size()-1); // remove last one
		
		// Print size, whether or not it is empty
		if(wordList.isEmpty())
		{
			System.out.println("Empty list!");
		}
		else
		{
			System.out.println(wordList.toString()); // Print using toString
		}
		
		// Use a for loop to print all words
		for(int i = 0; i < wordList.size(); i++)
		{
			String word = wordList.get(i);
			System.out.println(i + ": " + word);
		}
		
		System.out.println();
		
		// print backwards
		for(int i = wordList.size()-1; i >= 0; i--)
		{
			String word = wordList.get(i);
			System.out.println(i + ": " + word);
		}
		
		System.out.println();
		
		// Use a for-each loop to print all words
		for(String w : wordList)
		{
			System.out.println(w);
		}
		
		System.out.println();
		
		// Use an iterator to print all words
		Iterator<String> iterator = wordList.iterator();
		while(iterator.hasNext())
		{
			String word = iterator.next();
			System.out.println(word);
		}
		
		// Check if it contains something
		if(wordList.contains("hello"))
		{
			System.out.println("IT has hello!");
		}
		
		// Search list for word
		for(String s : wordList)
		{
			if(s.equalsIgnoreCase("Hello"))
			{
				System.out.println("Found match: " + s);
			}
		}
		
		// Select random word from list
		Random rand = new Random();
		int randomIndex = rand.nextInt(wordList.size());
		String randomWord = wordList.get(randomIndex);
		System.out.println("Random word: " + randomWord);
		
		// Find longest word
		
		// Find average word length
		int sum = 0;
		for(int i = 0; i < wordList.size(); i++)
		{
			String word = wordList.get(i);
			sum += word.length();
		}
		double averageLength = (double) sum / wordList.size();
		System.out.println("Average length: " + averageLength);
		
		scan.close();
	}
}
