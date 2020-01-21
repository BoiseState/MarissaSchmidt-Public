/**
 * This is a demo program to show how different data types behave.
 * 
 * @author marissaschmidt
 */
public class DataTypes
{
	public static void main(String[] args)
	{
		String name = "Marissa";
		System.out.println(name);
		
		int year = 2020;
		char copyright = '\u00A9';
		
		System.out.println(copyright + " " + year);
		
		int numStudents;  // declare a variable
		numStudents = 28; // initialize variable
		
		System.out.println("There are " + numStudents + " in class");
		
		numStudents = numStudents + 1; // increment by 1
		numStudents++;  			   // increment by 1
		numStudents += 1;  			   // increment by 1
		
		System.out.println("Now there are " + numStudents + " in class");
		
		int numCookies = 12; // change to 13
		int numFriends = 6;
		
		int cookiesPerFriend = numCookies / numFriends;
		
		System.out.println("Cookies per friend: " + cookiesPerFriend);
	}
}
