/**
 * This is a "driver" class to test the Die class.
 * @author marissa
 */
public class DieRoller
{
	public static void main(String[] args)
	{
		Die die1 = new Die(); // faceValue = 1
		
		Die die2 = new Die();
		die2.setFaceValue(3); // faceValue = 3
		
		System.out.println("Die 1: : " + die1);
		System.out.println("Die 2: : " + die2);
		
		
		// who rolled the highest value?
		Die largest = max(die1, die2);
		System.out.println(largest);
		
		System.out.println(die1);
		
	  // test equals method added to Die class	
		if(die1.equals(die2))
		{
			System.out.println("They are equal!");
		}
		else
		{
			System.out.println("They are not equal!");
		}
	}
	
	public static Die max(Die d1, Die d2)
	{
		//d1.setFaceValue(100);
		
		if(d1.getFaceValue() >= d2.getFaceValue())
		{
			return d1;
		}
		else
		{
			return d2;
		}
	}
	
	
}
