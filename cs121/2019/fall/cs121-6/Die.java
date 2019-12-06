import java.util.Random;

/**
 * Represents a die.
 * 
 * @author marissaschmidt
 */
public class Die
{
	// Instance Variables
	private int faceValue;
	private int numSides;
	
	/**
	 * Creates a new Die.
	 */
	public Die()
	{
		faceValue = 1;
		numSides = 6;
	}
	
	/**
	 * Creates a new die with specified number of sides
	 * @param numSides The number of sides.
	 */
	public Die(int numSides)
	{
		faceValue = 1;
		this.numSides = numSides;
	}
	
	/**
	 * Sets the face value of this die.
	 * @param newFaceValue The face value.
	 */
	public void setFaceValue(int newFaceValue)
	{
		faceValue = newFaceValue;
	}
	
	/**
	 * Returns the face value of this die.
	 * @return The face value.
	 */
	public int getFaceValue()
	{
		return faceValue;
	}
	
	/**
	 * Rolls the die and returns the new face value.
	 * @return The new face value after the roll.
	 */
	public int roll()
	{
		Random rand = new Random();
		faceValue = rand.nextInt(6) + 1;
		return faceValue;
	}
	
	// Methods
	public String toString()
	{
		return Integer.toString(faceValue);
	}
}
