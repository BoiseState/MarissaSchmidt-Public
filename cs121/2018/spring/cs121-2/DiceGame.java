/**
 * This is a "driver" class that will test our Die by 
 * playing a game.
 * @author marissa
 */
public class DiceGame
{
	public static void main(String[] args)
	{
		// Use my die object in this driver class
		
		Die die = new Die();
		
		int faceValue = die.getFaceValue();
		System.out.println("Face value: " + faceValue);
		
		die.setFaceValue(-2);
		
		System.out.println("My die is: " + die);
		
		die.roll();
		System.out.println("After roll: " + die);
		
		Die fourSidedDie = new Die(4);
		
		System.out.println("My other die is: " + fourSidedDie);
	}
}
