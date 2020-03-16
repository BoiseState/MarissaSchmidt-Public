/**
 * This is a "driver" class to test our CupOfDice. It is the main entry point
 * for our program.
 * 
 * @author marissa
 */
public class Yahtzee
{
	public static void main(String[] args)
	{
		// Create a CupOfDice containing 5 Die objects.
		CupOfDice cup = new CupOfDice(5);
		
		// Print the cup
		System.out.println("CupOfDice before roll: ");
		System.out.println(cup);
		
		// Roll 5 dice.
		cup.roll();
		
		System.out.println("CupOfDice after roll: ");
		System.out.println(cup);
		
		
		// Print the values, or the sum of all dice.
		int total = cup.getTotalFaceValue();
		
		System.out.println("Total value: " + total);
		
		
		// Create a second cup of dice containing 5 dice. Each die will have 4 sides.
		CupOfDice cup2 = new CupOfDice(5, 4);
		
		System.out.println("CupOfDice number 2:");
		System.out.println(cup2);
		
		cup2.roll();
		
		System.out.println("CupOfDice number 2 after roll:");
		System.out.println(cup2);
	}
}
