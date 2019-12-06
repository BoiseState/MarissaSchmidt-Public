/**
 * This class represents a cup of 5 dice. Used to demonstrate arrays of objects.
 * 
 * @author marissaschmidt
 */
public class CupOfDice implements CupOfDiceInterface
{
	private final int NUM_DICE = 5;
	
	private Die[] dice;
	
	/**
	 * Creates a new cup of dice.
	 */
	public CupOfDice()
	{
		dice = new Die[NUM_DICE];
		for(int i = 0; i < dice.length; i++)
		{
			dice[i] = new Die();
		}
	}
	
	@Override
	public void roll()
	{
		for(Die d : dice)
		{
			d.roll();
		}
	}
	
	@Override
	public Die getMaxDie()
	{
		Die max = dice[0];
		
		// for every element in the array, if the current element is 
		// larger than max, max becomes that element.
		for(Die d : dice)
		{
			if(d.getFaceValue() > max.getFaceValue())
			{
				max = d;
			}
		}
		
		return max;
	}
	
	public String toString()
	{
		String output = "";
		for(Die d : dice)
		{
			output += "[" + d.toString() + "]";
		}
		return output;
	}
}
