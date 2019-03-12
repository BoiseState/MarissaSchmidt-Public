/**
 * This class represents a box.
 * @author marissa
 *
 */
public class Box
{
	// Attributes (instance variables)
	private double length;
	private double width;
	private double height;
	private boolean full;
	
	// Constructor (how do I create an object)
	
	
	/**
	 * This creates a new, empty box.
	 * @param length the length in cm
	 * @param width the width in cm
	 * @param height the height in cm
	 */
	public Box(double length, double width, double height)
	{
		this.length = length;
		this.width = width;
		this.height = height;
		this.full = false;
	}
	
	/**
	 * This creates a new, empty box. This is an overloaded constructor
	 * @param length the length in cm
	 * @param width the width in cm
	 * @param height the height in cm
	 * @param full true if full, false if empty.
	 */
	public Box(double length, double width, double height, boolean full)
	{
		this.length = length;
		this.width = width;
		this.height = height;
		this.full = full;
	}
	
	/**
	 * Sets the height of the box.
	 * @param height the height in cm
	 */
	public void setHeight(double height)
	{
		this.height = height;
	}
	
	/**
	 * Returns the height of this box.
	 * @return the height in cm.
	 */
	public double getHeight()
	{
		return height;
	}
	
	/**
	 * Sets whether or not the box is full.
	 * @param full true if full, false if empty.
	 */
	public void setFull(boolean full)
	{
		this.full = full;
	}
	
	/**
	 * Returns whether or not the box is full.
	 * @return true if full, false otherwise.
	 */
	public boolean isFull()
	{
		return full;
	}
	
	
	// Methods
	
	public String toString()
	{
		String output = length + ", " + width + ", " + height + ", ";
		if(full)
		{
			output = output + "full";
		}
		else
		{
			output += "empty";
		}
		
		return output;
	
	}
}
