/**
 * This represents a box.
 * @author marissa
 */
public class Box
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
	 * @param height of the box in cm
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
	
	/**
	 * Sets the height of the box
	 * @param height the new height
	 */
	public void setHeight(double height)
	{
		this.height = height;
	}
	
	// Methods
	public String toString()
	{
		String output = "[" +height + ", " + width + "," + depth + "]";
		return output;
	}
}
