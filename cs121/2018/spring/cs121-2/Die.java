import java.util.Random;

/**
 * Defines a single die.
 * @author marissa
 */
public class Die
{
	// Instance Variables (aka attributes)
	private int faceValue;
	private int numSides;
	
	// Constructors
	/**
	 * Creates a new die with 6 sides and a face value of 1.
	 */
	public Die()
	{
		// initialize all instance variables.
		faceValue = 1;
		numSides = 6;
	}
	
	/**
	 * Creates a new die with the given number of sides and random
	 * face value.
	 * @param sides The number of sides the die should have.
	 */
	public Die(int numSides)
	{
		this.numSides = numSides;
		roll();
	}
	
	/**
	 * Creates a new die with the given number of sides and a face
	 * value of whatever you pass in.
	 * @param sides The number of sides the die should have.
	 * @param faceValue Initial face value.
	 */
	public Die(int numSides, int faceValue)
	{
		setFaceValue(faceValue);
		this.numSides = numSides;
	}
	
	// Methods (aka behaviors/actions)
	/**
	 * Getter. Returns the current face value of this die.
	 * @return The current face value of this die.
	 */
	public int getFaceValue()
	{
		return faceValue;
	}
	
	/**
	 * Setter. Updates the face value of this die. If the value given is out
	 * of range, sets it to the number of sides.
	 * @param value The new value you want the die to have.
	 */
	public void setFaceValue(int value)
	{
		if(value > numSides || value < 1)
		{
			faceValue = numSides;
		}
		else
		{
			faceValue = value;
		}
	}
	
	/**
	 * Rolls the die and returns the face value.
	 * @return the new face value of the die.
	 */
	public int roll()
	{
		Random random = new Random();
		faceValue = random.nextInt(numSides) + 1;
		return faceValue;
	}
	
	/**
	 * Returns the die with the largest face value.
	 * @param die1 The first die.
	 * @param die2 The second die.
	 * @return A reference to the die with the larger face value.
	 */
	public static Die maxOfTwoDice(Die die1, Die die2)
	{
		if(die1.getFaceValue() > die2.getFaceValue())
		{
			return die1;
		}
		else
		{
			return die2;
		}
	}
	
	/**
	 * Prints the current state of the die.
	 */
	public String toString()
	{
		return "Face Value: " + faceValue + ", Num Sides: " + numSides;
	}
}
