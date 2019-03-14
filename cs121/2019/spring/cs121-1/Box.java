/**
 * This represents a box.
 * @author marissa
 */
public class Box implements Comparable<Box>
{
	// Attributes
	private double height;
	private double width;
	private double depth;
	private boolean full;
	
	// Constructor
	/**
	 * Creates a new, empty box.
	 * @param height of the box in cm
	 * @param width of the box in cm
	 * @param depth of the box in cm
	 */
	public Box(double height, double width, double depth)
	{
		this.height = height;
		this.width = width;
		this.depth = depth;
		this.full = false;
	}
	
	/**
	 * Creates a new, empty box.
	 * @param height of the box in cm-
	 * @param width of the box in cm
	 * @param depth of the box in cm
	 * @param full true if full, false otherwise
	 */
	public Box(double height, double width, double depth, boolean full)
	{
		this.height = height;
		this.width = width;
		this.depth = depth;
		this.full = full;
	}
	
	/**
	 * Returns the height of the box
	 * @return the height
	 */
	public double getHeight()
	{
		return height;
	}
	
	public double getWidth()
	{
		return width;
	}
	
	public double getDepth()
	{
		return depth;
	}
	
	/**
	 * Sets the height of the box
	 * @param height the new height
	 */
	public void setHeight(double height)
	{
		this.height = height;
	}
	
	/**
	 * Returns whether or not the box is full.
	 * @return true if full, false otherwise.
	 */
	public boolean isFull()
	{
		return full;
	}
	
	public double getSurfaceArea()
	{
		return 0;
	}
	
	public double getVolume()
	{
		double volume = depth * width * height;
		return volume;
	}
	
	/**
	 * Checks if this box is equal tothe given box.
	 * @param that the box we are comparing to
	 * @return true if equal, false otherwise.
	 */
	public boolean equals(Box that)
	{
		if(this.getVolume() == that.getVolume())
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	// Methods
	public String toString()
	{
		String output = "My Box: ";
		if(full) {
			output += "Full box";
		} else {
			output += "Empty box";
		}
		output += ", " + height + ", " + width + ", " + depth;
		return output;
	}

	@Override
	public int compareTo(Box b)
	{
		double box1Volume = this.getVolume();
		double box2Volume = b.getVolume();
		
		int result = 0;
		if(box1Volume == box2Volume)
		{
			result = 0;
		}
		else if(box1Volume < box2Volume)
		{
			result = -1;
		}
		else
		{
			result = 1;
		}
		return result;
		// return 0 if volumes are equal
		// else return -1 if box1 < box2
		// else return 1 if box1 > box2
	}
}
