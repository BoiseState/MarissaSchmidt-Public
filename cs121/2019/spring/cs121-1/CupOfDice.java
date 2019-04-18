/**
 * Represents a cup of 5 dice (for Yahtzee)
 * @author marissa
 *
 */
public class CupOfDice
{
	private final int NUM_DICE = 5;
	
	private Die[] dice;
	
	/**
	 * Creates a new cup of dice.
	 */
	public CupOfDice()
	{
		// Create array
		dice = new Die[NUM_DICE];
		
		// Fill with dice
		for(int i = 0; i < dice.length; i++)
		{
			dice[i] = new Die();
		}
		
	}
	
	/**
	 * Rolls all the dice in the cup.
	 */
	public void shakeAndRoll()
	{
		for(Die die : dice)
		{
			die.roll();
		}
	}
	
	public String toString()
	{
		String result = "";
		
		for(Die die : dice)
		{
			result += "[" + die + "]";
		}
		
		return result;
	}
}
