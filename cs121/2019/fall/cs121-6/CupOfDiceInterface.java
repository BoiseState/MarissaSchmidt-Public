/**
 * This interface defines the methods that a CupOfDice will need to have.
 * 
 * @author marissaschmidt
 */
public interface CupOfDiceInterface
{
	/**
	 * Rolls all of the dice in the cup.
	 */
	public void roll();
	
	/**
	 * Returns the die with the largest face value.
	 * @return A reference to the die.
	 */
	public Die getMaxDie();
}
