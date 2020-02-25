import java.util.Scanner;

import java.awt.Point;
import java.awt.Color;

/**
 * Demonstrates how to use various classes.
 * @author marissaschmidt
 */
public class ObjectDemo 
{
	public static void main(String[] args)
	{
		// Declare primitive type variables
		int x = 10;
		int y = 0;
		double value;

		// Declare and instantiate Scanner using constructor. Don't forget to import. 
		Scanner kbd = new Scanner(System.in);
		// Call nextInt() method on kbd object using dot operator 
		kbd.nextInt();

		// Declare and instantiate String using constructor. No import needed. 
		// The following lines are equivalent.
		String myWord = new String("water");
		String yourWord = "water";

		// Declare and instantiate hypothetical dog and snowflake objects.
		// Dog myDog = new Dog("Rover");
		// Snowflake flake = new Snowflake();
		
		// Declare and instantiate point objects. Don't forget to import.
		Point a = new Point(10, 20);
		Point b = new Point(5, 6);

		// Assign the value of a to c. This creates an alias.
		Point c = a;
	
		// What happens when we change the location of point c?	
		c.setLocation(20, 30);
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		// Get the x and y values from coordinate
		int aX = (int)a.getX();
		int aY = (int)a.getY();

		// Declare and instantiate a Song object. (Song class must be in project directory)
		// Documentation available at https://boisestate.github.io/CS121-Public/A04_Song/Song.html
		Song song = new Song("Bohemian Rhapsody", "Queen", "Bohemian Rhapsody");
		
		// Call methods on the song instance.
		song.setFilePath("classical.wav");
		song.play();
		int playTime = song.getPlayTime();
	}
}
