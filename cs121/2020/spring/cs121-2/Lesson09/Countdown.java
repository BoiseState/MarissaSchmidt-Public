import java.util.Scanner;

/**
 * Demonstrates switch statements.
 * 
 * @author Marissa Schmidt
 */
public class Countdown
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		// 1. Read number from user
		System.out.print("Enter # between 1 and 5: ");
		int input = scan.nextInt();
		
		// 2. Use switch statement to print countdown from that number
		switch(input)
		{
		case 5:
			System.out.println(5);
		case 4:
			System.out.println(4);
		case 3:
			System.out.println(3);
		case 2:
			System.out.println(2);
		case 1:
			System.out.println(1);
			break;
		default:
			System.out.println("I said between 1 and 5.");
		}
		
		scan.close();
	}
}
