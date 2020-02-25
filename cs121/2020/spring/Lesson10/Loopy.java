import java.util.Scanner;

public class Loopy
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Do you want me to say hello (y/n)? ");
		String input = "y";
		
		while(input.equals("y"))
		{
			System.out.println("Hello!");
			
			System.out.print("Do you want me to say hello (y/n)?");
			input = scan.nextLine();
		}
			
		System.out.println("Okay. Goodbye.");
		
		scan.close();
	}
}
