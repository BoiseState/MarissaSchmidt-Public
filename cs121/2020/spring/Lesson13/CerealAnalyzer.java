import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Demonstrates parsing CSV data and storing in ArrayList
 * @author marissaschmidt
 */
public class CerealAnalyzer {

	public static void main(String[] args)
	{
		// Create a new File object for cereal.csv 
		File file = new File("cereal.csv");
		
		// Check if file exists.
		if(file.exists() && file.isFile() && file.canRead())
		{
			System.out.println("I found your file: " + file);
			try
			{
				// Create a new ArrayList of Cereal objects called cerealList.
				ArrayList<Cereal> cerealList = new ArrayList<Cereal>();
				
				// Create a new Scanner object to read from the file. Catch any 
				// required exceptions and display a useful message to the user.
				Scanner scan = new Scanner(file);
			
				// Use a while loop and the Scanner created above to iterate through
				// the lines in the cereal.csv file. Print each line.
				while(scan.hasNextLine())
				{
					// read the line
					String line = scan.nextLine();
					
					// For each line (cereal record), use a second Scanner object to 
					// tokenize the line using a comma (',') as the delimiter,
					Scanner lineScan = new Scanner(line);
					lineScan.useDelimiter(","); // separate tokens on commas
					
					// Extract values for name, calories, protein, fat and carbs and 
					// store them to local variables.
					String name = lineScan.next();
					int calories = Integer.parseInt(lineScan.next());
					double protein = lineScan.nextDouble();
					double fat = lineScan.nextDouble();
					double carbs = lineScan.nextDouble();
				
					// Create a new Cereal object using the local variables created above.
					Cereal cereal = new Cereal(name, calories, protein, fat, carbs);
					
					// Add the new Cereal object to the cerealList ArrayList. 
					cerealList.add(cereal);
					
					lineScan.close();
				}
				
				// Use a foreach loop to print out contents of the cerealList.
				for(Cereal c : cerealList)
				{
					System.out.println(c);
				}
				
				// Find all the cereals with less than 10 carbs and store in a new
				// ArrayList called lowCarbCereals. Print the list of lowCarbCereals and the number
				// of low carb cereals.
				double totalProtein = 0;
				for(Cereal c : cerealList)
				{
					totalProtein = totalProtein + c.getProtein();
				}
				double averageProtein = totalProtein / cerealList.size();
				System.out.println("Avg protein: " + averageProtein);
				
				scan.close();
			}
			catch(FileNotFoundException e)
			{
				System.out.println("Oops, I couldn't find your file: " + file);
			}
		}
		else
		{
			System.out.println("I did not find your file: " + file);
		}
		
		// TODO: 9. Find the average grams of protein for all cereals in list. 
				
		// TODO: 10. Find all cereals whose name contains "Wheat"
	}
}
