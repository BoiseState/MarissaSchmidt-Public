import java.util.ArrayList;
import java.util.Collections;

public class DeliveryTruck implements DeliveryTruckInterface
{
	// Instance variables
	private int capacity;
	private ArrayList<Box> boxes;
	
	// Constructor
	public DeliveryTruck(int capacity)
	{
		this.capacity = capacity;
		this.boxes = new ArrayList<Box>();
	}

	@Override
	public String getDriverName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addBox(Box box)
	{
		boxes.add(box);
	}

	@Override
	public Box getLargestBox()
	{
		Box largest = Collections.max(boxes);
		return largest;
	}

	@Override
	public ArrayList<Box> getBoxList()
	{	
		return new ArrayList<Box>(boxes);
	}
	
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
