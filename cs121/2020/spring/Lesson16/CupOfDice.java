import java.util.ArrayList;

/**
 * This class represents a cup of dice.
 * @author marissa
 */
public class CupOfDice
{
	private ArrayList<Die> dice;
	
	/**
	 * This creates a new cup of dice with the specified number of dice.
	 * @param numDice The number of dice in the cup.
	 */
	public CupOfDice(int numDice)
	{
		// 1. instantiate dice ArrayList
		dice = new ArrayList<Die>();
		
		// 2. fill it with numDice Dice.
		for(int i = 0; i < numDice; i++)
		{
			dice.add(new Die());
		}
	}
	
	/**
	 * Creates a new cup of dice with the specified number of dice.
	 * Each die will have the given number of sides.
	 * @param numDice The number of dice in the cup.
	 * @param numSides The number of sides of each die.
	 */
	public CupOfDice(int numDice, int numSides)
	{
		dice = new ArrayList<Die>();
		
		for(int i = 0; i < numDice; i++)
		{
			dice.add(new Die(numSides));
		}
	}
	
	/**
	 * Rolls all dice in the cup.
	 */
	public void roll()
	{
		for(Die d : dice)
		{
			d.roll();
		}
	}

	/**
	 * Return the total face value of all the dice in the cup.
	 * @return The total value.
	 */
	public int getTotalFaceValue()
	{
		// compute running sum of all dice in cup
		int sum = 0;
		
		for(Die d : dice)
		{
			sum = sum + d.getFaceValue();
		}
		
		return sum;
	}
	
	
	public String toString()
	{
		String output = "";
		
		for(int i = 0; i < dice.size(); i++)
		{
			output += "Die " + i + ": " + dice.get(i) + "\n";
		}
		
		return output;
	}
}
