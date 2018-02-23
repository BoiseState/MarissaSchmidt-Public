import java.util.Random;
/**
 * Represents a single die.
 * @author marissa
 */
public class Die
{
	// Instance Variables (aka attributes)
	private int faceValue;
	private int numSides;
	
	// Constructor (define how to create a die)
	/**
	 * Creates a new Die with 6 sides and a random face value.
	 */
	public Die()
	{
		// initialize all instance variables
		numSides = 6;
		roll();
	}
	
	/**
	 * Creates a new Die with the given number of sides and a face value
	 * of 1.
	 * @param numSides The number of sides you want the die to have. Must be
	 * a positive integer.
	 */
	public Die(int numSides)
	{
		faceValue = 1;
		this.numSides = numSides;
	}
	
	// Methods (aka behaviors)
	
	/**
	 * Getter (accessor). Returns the current face value of this die.
	 * @return the face value.
	 */
	public int getFaceValue()
	{
		return faceValue;
	}
	
	/**
	 * Setter (mutator). Set the current face value of this die to the
	 * value you pass in. If the face value given is larger than the number
	 * of sides, sets the face value to the max possible value.
	 * @param faceValue The new face value. Must be a positive integer.
	 */
	public void setFaceValue(int faceValue)
	{
		if(faceValue > numSides)
		{
			this.faceValue = numSides; // max value
		}
		else
		{
			this.faceValue = faceValue;
		}
	}
	
	/**
	 * Rolls the die and returns the new face value.
	 * @return The new face value.
	 */
	public int roll()
	{
		Random random = new Random();
		faceValue = random.nextInt(numSides) + 1;
		return faceValue;
	}
	
	@Override
	public String toString()
	{
		return "[faceValue: " + faceValue + ", numSides: " + numSides + "]";
	}
}
