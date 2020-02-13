import java.util.Scanner;

/**
 * Activity 07: Uses the Scanner, String, and NumberFormat classes to 
 * generate a service advertisement based on a user’s profile information.

 * @author marissaschmidt
 *
 */
public class AdGenerator
{
	public static void main(String[] args)
	{
		// Create scanner object
		Scanner scan = new Scanner(System.in);
		
		// use it to read values from user (don't forget to prompt before
		// reading values. Example:
		System.out.print("First name: ");
		String firstName = scan.nextLine().trim();
		
		// Validate name is not empty (trim whitespace)
		// Validate name is less than 50 chars
		if(firstName.length() == 0)
		{
			System.out.println("Invalid! Name cannot be empty.");
			System.out.println("Get it together. Follow directions.");
		}
		else if(firstName.length() >= 50)
		{
			System.out.println("Invalid! Name must be less than 50 characters.");
		}
		else
		{
			System.out.println("Hi " + firstName + "!");
		}
		
		scan.close();
	}
}
