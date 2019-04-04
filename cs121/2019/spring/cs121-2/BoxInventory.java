import java.util.ArrayList;
import java.util.Collections;

/**
 * This class manages the current inventory of boxes.
 * @author marissa
 */
public class BoxInventory
{
	private ArrayList<Box> boxes;
	
	/**
	 * Creates a new inventory.
	 */
	public BoxInventory()
	{
		this.boxes = new ArrayList<Box>();
	}

	/**
	 * Adds a box to the inventory list. If the box is null, doesn't add it.
	 * @param box The box to add.
	 */
	public void addBox(Box box)
	{
		if(box != null)
		{
			boxes.add(box);
		}
	}

	/**
	 * Returns the largest box from the inventory.
	 * @return the largest box.
	 */
	public Box getLargestBox()
	{
		Box largest = Collections.max(boxes);
		return largest;
	}

	/**
	 * Returns list of boxes sorted by volume.
	 * @return The sorted list.
	 */
	public ArrayList<Box> getSortedBoxList()
	{	
		ArrayList<Box> copy = new ArrayList<Box>(boxes);
		Collections.sort(copy);
		return copy;
	}
	
	@Override
	public String toString()
	{
		String result = "List of boxes\n";
		for(Box b : boxes)
		{
			result += b + "\n";
		}
		return result;
	}
}
