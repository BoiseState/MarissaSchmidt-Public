/**
 * This represents a box. Every box has a width, height, depth, material,
 * and whether or not it is full.
 * 
 * @author marissa
 */
public class Box implements Comparable<Box>
{
	public enum BoxMaterial { 
		CARDBOARD, 
		PLASTIC, 
		STEEL, 
		RUBBER, 
		WOOD, 
		UNDEFINED 
	}
	
	private double height;
	private double width;
	private double depth;
	private boolean full;
	private BoxMaterial material;
	
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
		this.material = BoxMaterial.UNDEFINED;
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
		this.material = BoxMaterial.UNDEFINED;
	}
	
	/**
	 * Sets the material of this box.
	 * @param material The material.
	 */
	public void setMaterial(BoxMaterial material)
	{
		this.material = material;
	}
	
	/**
	 * Returns the material of this box.
	 * @return The material.
	 */
	public BoxMaterial getMaterial()
	{
		return this.material;
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
	
	/**
	 * Returns the width of the box
	 * @return the width
	 */
	public double getWidth()
	{
		return width;
	}
	
	/**
	 * Sets the width of the box
	 * @param width the new width
	 */
	public void setWidth(double width)
	{
		this.width = width;
	}
	
	/**
	 * Returns the depth of the box
	 * @return the depth
	 */
	public double getDepth()
	{
		return depth;
	}
	
	/**
	 * Sets the depth of the box
	 * @param depth the new depth
	 */
	public void setDepth(double depth)
	{
		this.depth = depth;
	}
	
	/**
	 * Returns whether or not the box is full.
	 * @return true if full, false otherwise.
	 */
	public boolean isFull()
	{
		return full;
	}
	
	/**
	 * Updates the value of full.
	 * @return true if full, false otherwise.
	 */
	public void setFull(boolean full)
	{
		this.full = full;
	}

	/**
	 * Returns the volume of this box.
	 * @return The volume.
	 */
	public double getVolume()
	{
		double volume = depth * width * height;
		return volume;
	}
	
	/**
	 * Checks if this box is equal to the given box.
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
	
	@Override
	public int compareTo(Box b)
	{
		double box1Volume = this.getVolume();
		double box2Volume = b.getVolume();
		
		if(box1Volume == box2Volume)
		{
			return 0;
		}
		else if(box1Volume < box2Volume)
		{
			return -1;
		}
		else
		{
			return 1;
		}
	}
	
	@Override
	public String toString()
	{
		String output = height + "\"x" + width + "\"x" + depth +"\"";
		output += " box made of " + material;
		if(full) {
			output += " (full)";
		} else {
			output += " (empty)";
		}
		return output;
	}
}
