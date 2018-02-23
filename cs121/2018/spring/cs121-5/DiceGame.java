/**
 * A "driver" class that uses our Die class to play a fun game.
 * @author marissa
 */
public class DiceGame
{
	public static void main(String[] args)
	{
		// Create an instance of the Die class
		Die die = new Die();
		System.out.println(die);
		
		// Test getter method
		int value = die.getFaceValue();
		System.out.println("Current face value: " + value);
		
		// Test setter method
		die.setFaceValue(10);
		
		value = die.getFaceValue();
		System.out.println("Current face value after set: " + value);
		
		value = die.roll();
		System.out.println("Face value after roll: " + value);
		System.out.println("Die after roll: " + die);
		
		
		// Create a 4 sided die
		Die fourSidedDie = new Die(4);
		System.out.println(fourSidedDie);
	}
}
