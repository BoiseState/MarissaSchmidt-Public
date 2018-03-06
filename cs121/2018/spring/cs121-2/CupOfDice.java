import java.util.ArrayList;

/**
 * Represents a cup of dice. An aggregate class made up of multipe Die objects.
 * @author marissa
 * @author cs121-2
 */
public class CupOfDice
{
	// Instance Variables
	private int numDice;
	private ArrayList<Die> dice;
	
	/**
	 * Instantiates a new cup of dice with the number of dice given.
	 * @param numDice The number of dice.
	 */
	public CupOfDice(int numDice)
	{
		this.numDice = numDice;
		dice = new ArrayList<Die>();
		
		for(int i = 0; i < numDice; i++)
		{
			Die die = new Die();
			dice.add(die);
		}
	}
	
	/**
	 * Returns the number of dice in this cup.
	 * @return the number of dice.
	 */
	public int getNumDice()
	{
		return numDice;
	}
	
	/**
	 * Returns the total face value of all dice.
	 * @return The total.
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
	 * Checks if all dice have equal face value (aka. yahtzee)
	 * @return true if all equal, false otherwise.
	 */
	public boolean hasYahtzee()
	{
		int checkValue = dice.get(0).getFaceValue();
		for(Die d : dice)
		{
			if(d.getFaceValue() != checkValue)
			{
				return false;
			}
		}
		return true;
	}
	
	/**
	 * Rolls all the dice in this cup.
	 */
	public void roll()
	{
		for(Die d : dice)
		{
			d.roll();
		}
	}
	
	@Override
	public String toString()
	{
		String result = "";
		for(Die d : dice)
		{
			result += "[" + d + "]";
		}
		return result;
	}
}
