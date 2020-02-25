/**
 * This is a tester for our Die.
 * @author marissaschmidt
 *
 */
public class DiceRoller
{

	public static void main(String[] args)
	{
		Die die1 = new Die(); // faceValue 1, numSides 6
		System.out.println(die1);
		die1.roll();
		System.out.println(die1);
		
		die1.setFaceValue(6);
		
		int value = die1.getFaceValue();
		
		Die die2 = new Die();  // faceValue 1, numSides 6
	}

}
