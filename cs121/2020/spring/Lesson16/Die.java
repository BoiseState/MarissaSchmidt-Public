import java.util.Random;

/**
 * This class represents a single die.
 * @author marissa
 */
public class Die
{
	// Instance variables defined here
	private int faceValue;
	private int numSides;
	
	/**
	 * This creates a new die with face value 1.
	 */
	public Die()
	{
		this.faceValue = 1;
		this.numSides = 6;
	}
	
	/**
	 * This creates a new die with face value 1 and the given number of sides.
	 * @param numSides The number of sides the die should have.
	 */
	public Die(int numSides)
	{
		this.faceValue = 1;
		this.numSides = numSides;
	}
	
	/**
	 * Returns the face value of this die.
	 * @return the face value.
	 */
	public int getFaceValue()
	{
		return faceValue;
	}
	
	/**
	 * Sets the face value of this die to the given value.
	 * @param faceValue
	 */
	public void setFaceValue(int faceValue)
	{
		this.faceValue = faceValue;
	}
	
	/**
	 * Rolls the die and returns the new face value.
	 * @return the new face value.
	 */
	public int roll()
	{
		Random rand = new Random();
		faceValue = rand.nextInt(numSides) + 1;
		
		return faceValue;
	}
	
	public boolean equals(Die otherDie)
	{
		if(this.faceValue == otherDie.faceValue)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public String toString()
	{
		return Integer.toString(faceValue);
	}
}
