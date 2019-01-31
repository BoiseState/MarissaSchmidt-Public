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
		// TODO: Declare and instantiate a String object
		String name = new String("something");
		String myName = "something";
		
		// TODO: Instantiate a Scanner object using constructor
		Scanner scan = new Scanner(System.in);
	
		// TODO: Invoke nextInt() and close() methods using dot operator
		scan.nextInt();
		scan.close();
		
		// TODO: Instantiate a Point object using constructor
		Point origin = new Point(10, 20);
		
		// TODO: Invoke setLocation(x, y) method using dot operator
		origin.setLocation(4, 5);
		
		// TODO: Invoke getLocation() method using dot operator and store
		// returned result in a variable
		Point location = origin.getLocation();
		System.out.println("My location is " + location);
		//int y = (int) location.getY();
		int y = location.y;
		System.out.println(y);
		
		// TODO: Instantiate a Color object using constructor
		Color red = new Color(19, 69, 150);
	}
}
