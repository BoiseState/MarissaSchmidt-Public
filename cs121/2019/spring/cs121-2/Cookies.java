import java.util.Scanner;

/**
 * This calculates cookie stuff.
 * @author marissa
 *
 */
public class Cookies
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Welcome to the cookie program!");
		System.out.print("How many cookies do you have? ");
		int numCookies = scan.nextInt();
		System.out.print("How many friends do you have? ");
		int numFriends = scan.nextInt();
		
		//String amount = 10000;
		

		double cookiesPer = ((double)(numCookies)) / (double) numFriends;
		
		System.out.println(cookiesPer);
		
		scan.close();
	}
}
