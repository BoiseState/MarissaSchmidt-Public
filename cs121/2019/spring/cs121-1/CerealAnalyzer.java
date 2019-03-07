import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class CerealAnalyzer
{
	public static void main(String[] args)
	{
		File file = new File("cereal.csv");
		
		if(file.exists())
		{
			// Create scanner to read file line-by-line
			try {
				Scanner fileScan = new Scanner(file);
				
				ArrayList<Cereal> cerealList = new ArrayList<Cereal>();
				
				while(fileScan.hasNextLine())
				{
					String line = fileScan.nextLine();
					//System.out.println(line);
					
					// break the line into tokens
					Scanner lineScan = new Scanner(line);
					lineScan.useDelimiter(","); // tell scanner to break line on commas
					
					String name = lineScan.next(); // name of cereal (1st column)
					int calories = lineScan.nextInt();
					double protein = lineScan.nextDouble();
					double fat = lineScan.nextDouble();
					double carbs = lineScan.nextDouble();
					
					Cereal cereal = new Cereal(name, calories, protein, fat, carbs);
					
					// add cereal to arraylist
					cerealList.add(cereal);
					
					lineScan.close();
				}
				
				
				// Done reading file, so do stuff with list
				
				ArrayList<Cereal> lowCarbCereals = new ArrayList<Cereal>();
				
				double runningSum = 0;
				double totalCarbs = 0;
				for(Cereal c : cerealList)
				{
					runningSum += c.getCalories();
					totalCarbs += c.getCarbs();
					System.out.println(c);
					
					// if carbs < 10
					// add cereal to lowCarbCereals list
				}
				double averageCalories = runningSum / cerealList.size();
				System.out.println(averageCalories);
				System.out.println("You ate " + totalCarbs + " carbs.");
				
				fileScan.close();
				
			} catch (FileNotFoundException e) {
				// if we get here, something went wrong.
				System.out.println("File not found: " + file);
			}
		}
		else
		{
			System.out.println("File not found : " + file);
		}
		
	}

}
