/**
 * This is a "driver" class to test the Die class.
 * @author marissa
 */
public class DieRoller
{
	public static void main(String[] args)
	{
		Die die1 = new Die();
		
		System.out.println(die1);
		
		int value = die1.getFaceValue();
		
		System.out.println(value);
		
		die1.setFaceValue(6);
		
		System.out.println(die1);
		
		int rolledValue = die1.roll();
		System.out.println(rolledValue);
		System.out.println(die1);
		
		
		Die die2 = new Die();
		die2.setFaceValue(3);
	}
}
