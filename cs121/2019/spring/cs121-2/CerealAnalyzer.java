import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class CerealAnalyzer {

	public static void main(String[] args)
	{
		File file = new File("cereal.csv");
		
		if(file.exists())
		{
			System.out.println(file + " exists!");
			
			try
			{
				ArrayList<Cereal> cerealList = new ArrayList<Cereal>();
				
				Scanner fileScan = new Scanner(file);
				
				// read file line-by-line
				while(fileScan.hasNextLine())
				{
					String line = fileScan.nextLine();
					//System.out.println(line);
					
					// break line into fields
					Scanner lineScan = new Scanner(line);
					lineScan.useDelimiter(",");
					
					String name = lineScan.next();
					int calories = lineScan.nextInt();
					double protein = lineScan.nextDouble();
					double fat = lineScan.nextDouble();
					double carbs = lineScan.nextDouble();
					
					// create a cereal object
					Cereal cereal = new Cereal(name, calories, protein, fat, carbs);
					cerealList.add(cereal);
				}
				
				
				ArrayList<Cereal> lowCarbCereals = new ArrayList<Cereal>();				
				int totalCals = 0;
				double totalCarbs = 0;
				for(Cereal c : cerealList)
				{
					System.out.println(c);
					totalCals = totalCals + c.getCalories();
					totalCarbs = totalCarbs + c.getCarbs();
					
					// if carbs < 10
					// add that cereal to lowCarbCereals
				}
				double averageCals = (double) totalCals / cerealList.size();
				System.out.println("Average cals: " + averageCals);
				System.out.println("You ate " + totalCarbs + " carbs");
			} 
			catch (FileNotFoundException e)
			{
				System.out.println("File not found: " + file);
			}
			
			
			
		}
		else
		{
			System.out.println("File not found: " + file);
		}

	}

}
