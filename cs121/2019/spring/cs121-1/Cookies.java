import java.util.Scanner;

/**
 * A cookie program.
 * @author marissa
 *
 */
public class Cookies
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Hello! Welcome to my cookie program!");
		System.out.print("How many cookies? ");
		int numCookies = input.nextInt();
		
		System.out.print("How many friends? ");
		int numFriends = input.nextInt();
		
		double cookiesPerFriend = ((double)numCookies) / numFriends;
		
		System.out.println(cookiesPerFriend);
		
		input.close();
	}
}
