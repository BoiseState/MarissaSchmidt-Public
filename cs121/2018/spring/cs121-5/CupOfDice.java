import java.util.ArrayList;

/**
 * Represents a cup of dice.
 * @author marissa
 */
public class CupOfDice
{
	// Instance variables
	private int numDice;
	private int numSides;
	private ArrayList<Die> dice;
	
	/**
	 * Creates a new cup of dice with the specified number of dice.
	 * @param numDice the number of dice.
	 */
	public CupOfDice(int numDice)
	{
		this.numDice = numDice;
		numSides = 6;
		
		dice = new ArrayList<Die>();
		
		for(int i = 0; i < numDice; i++)
		{
			Die die = new Die(numSides);
			dice.add(die);
		}
	}
	
	/**
	 * Returns the number of dice in the cup.
	 * @return the number of dice.
	 */
	public int getNumDice()
	{
		return numDice;
	}
	
	/**
	 * Rolls all the dice.
	 */
	public void roll()
	{
		for(Die d : dice)
		{
			d.roll();
		}
	}
	
	/**
	 * Returns the total face value of all dice.
	 * @return the total face value.
	 */
	public int getTotalFaceValue()
	{
		int sum = 0;
		for(Die d : dice)
		{
			sum += d.getFaceValue();
		}
		return sum;
	}
	
	/**
	 * Checks for a yahtzee (all dice same face value)
	 * @return true if all dice have same face value, false otherwise
	 */
	public boolean hasYahtzee()
	{
		// pick first die
		Die firstDie = dice.get(0);
		// make sure all other dice have same face value
		for(Die d : dice)
		{
			if(firstDie.getFaceValue() != d.getFaceValue())
			{
				return false;
			}
		}
		return true;
	}
	
	@Override
	public String toString()
	{
		String result = "";
		for(Die d : dice)
		{
			result += "[" + d.getFaceValue() + "]";
		}
		return result;
	}
}
