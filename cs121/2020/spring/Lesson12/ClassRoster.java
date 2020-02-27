import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

/**
 * Demonstrates how to create, add to, and print an ArrayList of Strings.
 * @author marissa
 *
 */
public class ClassRoster
{
	public static void main(String[] args)
	{
//		ArrayList<Integer> numbers = new ArrayList<Integer>();
//		int x = 10;
//		numbers.add(x);
		
		// Instantiate ArrayList of Strings to store students
		ArrayList<String> roster = new ArrayList<String>();
		ArrayList<Boolean> attendance = new ArrayList<Boolean>();
		
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
		
		roster.add(2, "Marissa");
		
		// Determine how many students are in class
		System.out.println("There are " + roster.size() + " students.");
		
		// Print all student names using for-each loop
		System.out.print("For-each loop: ");
		int offset = 0;
		for(String s : roster)
		{
			System.out.println(offset + ": " + s);
			offset++;
		}
		System.out.println();
		
		// Print using ArrayList toString method
		System.out.print("toString: ");
		System.out.println(roster);
		
		// Print using for-loop
		System.out.print("For loop: ");
		for(int i = 0; i < roster.size(); i++)
		{
			String s = roster.get(i);
			System.out.println(i + ": " + s);
		}
		System.out.println();
		
		// Print using while loop and iterator
		System.out.print("While loop: ");
		Iterator<String> it = roster.iterator();
		while(it.hasNext())
		{
			String s = it.next();
			System.out.println(s);
		}
		
		// Select a random student to answer a question
		System.out.println("Random student: ");
		Random random = new Random();
		int index = random.nextInt(roster.size());
		System.out.println(index);
		String randomStudent = roster.get(index);
		System.out.println("Winner, winner, chicken dinner! " + randomStudent);
		
		// Take attendance (interactive using Scanner)
		Scanner scan = new Scanner(System.in);
		for(String student : roster)
		{
			System.out.print("Is " + student + " here today? ");
			String response = scan.nextLine();
			if(response.equalsIgnoreCase("y"))
			{
				// they are here
				attendance.add(true);
			}
			else
			{
				attendance.add(false);
			}
		}
		scan.close();
		
		// Print student list with attendance values.
		for(int i = 0; i < roster.size(); i++)
		{
			String student = roster.get(i);
			if(attendance.get(i) == true) // they were here
			{
				System.out.println(student + " is here.");
			}
			else
			{
				System.out.println(student + " is not here.");
			}
		}
	}
}