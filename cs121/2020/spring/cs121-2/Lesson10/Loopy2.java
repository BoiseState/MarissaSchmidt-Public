import java.util.Scanner;

public class Loopy2
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		String input = "y";
		
		while(input.equals("y"))
		{
			System.out.print("Do you want me to say hello (y/n)?");
			input = scan.nextLine();
			if(input.equals("y"))
			{
				System.out.println("Hello!");
			}
		}
			
		System.out.println("Okay. Goodbye.");
		
		scan.close();
	}
}
