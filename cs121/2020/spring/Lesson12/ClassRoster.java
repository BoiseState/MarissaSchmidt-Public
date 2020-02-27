import java.util.ArrayList;

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
		
		// Add names of students to roster using the add() method
		roster.add("Dan");
		roster.add("Jordan");
		roster.add("Joseph");
		roster.add("Tyler");
		roster.add("Carlos");
		roster.add("Ellie");
		roster.add("Alex");
		roster.add("Dmitriy");
		roster.add("Jessica");
		roster.add("Brandon");
		roster.add("Autumn");
		roster.add("Andrew");
		roster.add("Aidan");
		roster.add("Spenser");
		roster.add("Emily");
		roster.add("Rafael");
		roster.add("Olivia");
		roster.add("Magalli");
		roster.add("Lucy");
		roster.add("Nina");
		roster.add("Kevin P.");
		roster.add("Amy");
		roster.add("Kevin R.");
		roster.add("Cameron");
		roster.add("Serena");
		roster.add("Isaac");
		roster.add("Jason");
		roster.add("Cory");
		roster.add("Alyssa");
		
		// Determine how many students are in class
		System.out.println("There are " + 0 + " students.");
		
		// Print all student names using for-each loop
		System.out.print("For-each loop: ");
		
		// Print using ArrayList toString method
		System.out.print("toString: ");
		
		// Print using for-loop
		System.out.print("For loop: ");
		
		// Print using while loop and iterator
		System.out.print("While loop: ");
		
		// Select a random student to answer a question
		System.out.println("Random student: ");
		
		// Take attendance (interactive using Scanner)
	}
}