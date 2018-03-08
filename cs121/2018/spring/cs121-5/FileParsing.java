import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Demonstrates how to parse files using Scanner.
 * @author marissa
 * @author cs121-5
 * @version Spring 2018
 */
public class FileParsing
{
	public static void main(String[] args)
	{
		final String DELIMITER = "[\\W\\d_]+";
		
		// Create a new file object from the file name.
		File file = new File("poem.txt");
		
		// Check if file exists and is actually a file, not a directory.
		if(file.exists() && file.isFile())
		{
			try // try to open file with Scanner
			{
				int lineCount = 0;
				int wordCount = 0;
				
				// read the file line-by-line
				Scanner scan = new Scanner(file);
				while(scan.hasNextLine())
				{
					String line = scan.nextLine();
					System.out.println(line);
					
					lineCount++;
					
					// read the line word-by-word
					Scanner lineScan = new Scanner(line);
					lineScan.useDelimiter(DELIMITER);
					while(lineScan.hasNext())
					{
						String word = lineScan.next();
						System.out.println(word);
						wordCount++;
						
						// print word char-by-char
						for(int i = 0; i < word.length(); i++)
						{
							char c = word.charAt(i);
							System.out.println(c);
						}
					}
					lineScan.close();
				}
				scan.close();
				
				System.out.println("Number of lines: " + lineCount);
				System.out.println("Number of words: " + wordCount);
			}
			catch (FileNotFoundException e) // only gets here if something went wrong.
			{
				// print a user friendly message
				System.out.println("Uh-oh! Could not open: " + file);
			}
		}
		else
		{
			System.out.println("File does not exist: " + file);
		}
	}
}
