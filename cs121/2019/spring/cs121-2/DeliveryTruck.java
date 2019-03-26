import java.util.ArrayList;
import java.util.Collections;

public class DeliveryTruck implements DeliveryTruckInterface
{
	private String driverName;
	private ArrayList<Box> boxList;
	
	public DeliveryTruck(String driverName)
	{
		this.driverName = driverName;
		this.boxList = new ArrayList<Box>();
	}
	
	@Override
	public String getDriverName() {
		return driverName;
	}

	@Override
	public void addBox(Box box) {
		boxList.add(box);
	}

	@Override
	public Box getLargestBox()
	{
		Box largest = Collections.max(boxList);
		return largest;
	}

	@Override
	public ArrayList<Box> getBoxList()
	{
		ArrayList<Box> copy = new ArrayList<Box>();
		for(Box b : boxList)
		{
			copy.add(b);
		}
		return copy;
	}
	
	public String toString()
	{
		String output = "Driver name: " + driverName + "\n";
		
		if(boxList.isEmpty())
		{
			output = output + "No boxes today";
		}
		else
		{
			for(Box box : boxList)
			{
				output = output + box + "\n";
			}
		}
		return output;
	}

}
