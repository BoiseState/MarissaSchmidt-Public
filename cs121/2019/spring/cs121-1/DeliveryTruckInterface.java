import java.util.ArrayList;

public interface DeliveryTruckInterface 
{
	public String getDriverName();
	
	public void addBox(Box box);
	
	/**
	 * Return the largest box.
	 * @return
	 */
	public Box getLargestBox();
	
	/**
	 * Returns a COPY of the list.
	 * @return
	 */
	public ArrayList<Box> getBoxList();
	
	public String toString();
}
