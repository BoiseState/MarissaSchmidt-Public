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
		/* TODO: 1. Create a new ArrayList of Cereal objects called cerealList. */
		ArrayList<Cereal> cerealList = new ArrayList<Cereal>();
		
		/* TODO: 2. Create a new File object for cereal.csv and 
		 * a new Scanner object to parse it. Catch any required 
		 * exceptions and display a useful message to the user.
		 */
		File myFile = new File("cereal.csv");
		if(myFile.exists())
		{
			//open file, read it, and create stuff from it
			try {
				Scanner scan = new Scanner(myFile);
				
				/* TODO: 3. Use a while loop and the Scanner created above to iterate 
				 * through the lines in the cereal.csv file.
				 */
				while(scan.hasNextLine()) // while there is another line to read
				{
					// read the line
					String line = scan.nextLine();
					//System.out.println(line);
					
					/* TODO: 4. For each line (cereal record), use a second 
					 * Scanner object to tokenize the line using a comma (',')
					 * as the delimiter, extract values for name, calories,
					 * protein, fat and carbs and store them to local variables.
					 */
					Scanner lineScan = new Scanner(line);
					lineScan.useDelimiter(",");
					
					String name = lineScan.next();
					int calories = lineScan.nextInt();
					double protein = lineScan.nextDouble();
					double fat = lineScan.nextDouble();
					double carbs = lineScan.nextDouble();
					
					lineScan.close();
					
					/* TODO: 5. Create a new Cereal object using the local variables
					 * create above and add the new Cereal object to the cerealList ArrayList. 
					 */
					Cereal cereal = new Cereal(name, calories, protein, fat, carbs);
					cerealList.add(cereal);
				}
				
				/* TODO: 6. Use a foreach loop to print out contents of the cerealList */
				for(Cereal c : cerealList)
				{
					System.out.println(c);
				}
				
				
				/* TODO: 7: Find all the cereals with less than 10 carbs and store in a new
				 * ArrayList. Print the results.
				 */
				ArrayList<Cereal> lowCarb = new ArrayList<Cereal>();
				//Search through original cerealList
				for(Cereal c : cerealList)
				{
					if(c.getCarbs() < 10)
					{
						lowCarb.add(c);
					}
				}
				
				// Print lowCarb list
				System.out.println("Low carbs");
				System.out.println(lowCarb);
				for(Cereal c : lowCarb)
				{
					System.out.println(c);
				}
				
				scan.close();
			} catch (FileNotFoundException e) {
				System.out.println("Could not open file: " + myFile);
			}
		}
		else
		{
			System.out.println("I didn't find it");
		}
	}
}
