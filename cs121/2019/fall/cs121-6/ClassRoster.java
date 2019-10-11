import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

/**
 * Demonstrates how to create, add to, and print an ArrayList of Strings.
 * @author marissa
 *
 */
public class ClassRoster
{
	public static void main(String[] args)
	{
		// Instantiate ArrayList of Strings to store students
		ArrayList<String> roster = new ArrayList<String>();
		
		// Add names of students in this class to roster using the add() method
		roster.add("Wyatt");
		roster.add("Easton");
		roster.add("Andrew C.");
		roster.add("Richelle");
		roster.add("Noah");
		roster.add("Landon");
		roster.add("Robert F.");
		roster.add("Samantha");
		roster.add("Alexandra");
		roster.add("Ean");
		roster.add("Quentin");
		roster.add("Andrew H.");
		roster.add("Kenan");
		roster.add("Joshua");
		roster.add("Robert K.");
		roster.add("Nick");
		roster.add("Omid");
		roster.add("Michael");
		roster.add("Mateo");
		roster.add("Jake");
		roster.add("Tiffani");
		roster.add("David");
		roster.add("Christian");
		roster.add("John");
		roster.add("Elizabeth");
		roster.add("Cameron");
		roster.add("Eric");
		roster.add("Brandon");
		roster.add("Barbara");
		
		// Print using for-each loop
		System.out.print("For-each loop: ");
		for(String s : roster)
		{
			System.out.print(s + ",");
		}
		System.out.println();
		
		// Print using ArrayList toString method
		System.out.print("toString: ");
		System.out.println(roster);
		
		// Print using ArrayList for-loop
		System.out.print("For loop: ");
		for(int i = 0; i < roster.size(); i++)
		{
			System.out.print(roster.get(i) + ", ");
		}
		System.out.println();
		
		// Print using while loop and iterator
		System.out.print("While loop: ");
		Iterator<String> it = roster.iterator();
		while(it.hasNext())
		{
			System.out.print(it.next() + ", ");
		}
		System.out.println();
		
		// Select a random student to answer a question
		Random rand = new Random(); // instantiate Random object
		int index = rand.nextInt(roster.size()); // generate a random int between 0 and number of students in roster
		String student = roster.get(index); // get the student at that index
		System.out.println("Random student: " + student);
	}
}
