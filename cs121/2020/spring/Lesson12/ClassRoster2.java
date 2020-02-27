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
//		ArrayList<Boolean> stuff = new ArrayList<Boolean>();
		
		// Instantiate ArrayList of Strings to store students
		ArrayList<String> roster = new ArrayList<String>();
		ArrayList<Boolean> attendance = new ArrayList<Boolean>();
		
		// Add names of students to roster using the add() method
		roster.add("Sam");
		roster.add("Jackson");
		roster.add("Jake");
		roster.add("Joshua B.");
		
		roster.add("Bryce");
		roster.add("Schylar");
		roster.add("Austin");
		roster.add("Jason");
		roster.add("Candice");
		roster.add("Juan");
		roster.add("Josh");
		roster.add("Alex");
		roster.add("Joey");
		roster.add("Dustin");
		roster.add("Brandon");
		roster.add("Brenden");
		roster.add("Frances");
		roster.add("Christopher");
		roster.add("Chinwendum");
		roster.add("Nolan");
		roster.add("Amelia");
		roster.add("James");
		roster.add("Joshua P.");
		roster.add("Thomas");
		roster.add("Katy");
		roster.add("Cameron");
		roster.add("Caleb");
		roster.add("Trevor");
		roster.add("Andrew");
		roster.add("Sandra");
		
		roster.add(4,"Marissa");
		
		// Determine how many students are in class
		System.out.println("There are " + roster.size() + " students.");
		
		// Print all student names using for-each loop
//		System.out.print("For-each loop: ");
//		for(String student : roster)
//		{
//			System.out.println(student);
//		}
//		
//		// Print using ArrayList toString method
//		System.out.print("toString: ");
//		System.out.println(roster);
		
		// Print using for-loop
		System.out.print("For loop: ");
		for(int i = 0; i < roster.size(); i++)
		{
			String student = roster.get(i);
			System.out.println(i + ": " + student);
		}
//		
//		// Print using while loop and iterator
//		System.out.print("While loop: ");
//		Iterator<String> it = roster.iterator();
//		while(it.hasNext())
//		{
//			String student = it.next();
//			System.out.println(student);
//		}
		
		// Select a random student to answer a question
		System.out.println("Random student: ");
		Random rand = new Random();
		int randomIndex = rand.nextInt(roster.size());
		System.out.println(randomIndex);
		String poorRandomStudent = roster.get(randomIndex);
		
		System.out.println("Winner, winner, chicken dinner! " + poorRandomStudent);
		
		// Take attendance (interactive using Scanner)
		Scanner scan = new Scanner(System.in);
		for(String student : roster)
		{
			System.out.print("Is " + student + " here? (y/n) ");
			String response = scan.nextLine();
			
			if(response.equalsIgnoreCase("y"))
			{
				attendance.add(true);
			}
			else
			{
				attendance.add(false);
			}
		}
		
		// Print student list with attendance values.
		for(int i = 0; i < roster.size(); i++)
		{
			String student = roster.get(i);
			boolean isHere = attendance.get(i);
			if(isHere == true)
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