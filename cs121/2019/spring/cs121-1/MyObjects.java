import java.util.Scanner;
import java.awt.Point;
import java.awt.Color;
/**
 * This example demonstrates how to create and use various objects.
 * 
 * @author marissa
 */
public class MyObjects
{
	public static void main(String[] args)
	{
		// Instantiate a String object
		String name = new String("Snoopy");
		String otherName = "Linus";
		
		// Instantiate a Scanner object using constructor
		Scanner scan = new Scanner(System.in);
		// Invoke nextInt() and close() methods using dot operator
		System.out.print("Enter x: ");
		int x = scan.nextInt();
		scan.close();
		
		// Instantiate a Point object using constructor
		Point coordinate = new Point(x, 200);
		System.out.println("My point is: " + coordinate);
		
		// Invoke setLocation(x, y) method using dot operator
		coordinate.setLocation(34, 45);
		System.out.println("My point is: " + coordinate);
		
		// Invoke getLocation() method using dot operator and store
		// returned result in a variable
		Point location = coordinate.getLocation();
		int yOffset = location.y;
		System.out.println("Y: " + yOffset);
		
		// Instantiate a Color object using constructor
		Color myColor = new Color(128, 0, 0);
		int blue = myColor.getBlue();
	}
}
