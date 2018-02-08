import java.util.Scanner;

/**
 * Demonstrates use of nested conditionals for verifying user credentials.
 * Note: The idea correct, but it is not a real login handler and is not
 * considered secure.
 * 
 * @author CS121 Instructors
 *
 */
public class LoginHandler
{
	public static void main(String[] args)
	{
		Scanner kbd = new Scanner(System.in);
		
		System.out.print("Username: ");
		String username = kbd.nextLine();
		
		int length = username.length();
		if(length <= 50 && length > 0) // validate username is less than 50 chars and more than 8
		{
			if(username.equals("snoopy"))
			{
				System.out.print("Password: ");
				String password = kbd.nextLine();
				
				if(password.equals("iL0v3tr3@ts"))
				{
					System.out.println("Welcome " + username);
				}
				else
				{
					System.out.println("Invalid password.");
				}
			}
			else
			{
				System.out.println("Invalid username.");
			}
		}
		else
		{
			System.out.println("Usname must be greater than 8 chars and less than 50.");
		}
		kbd.close();
	}
}