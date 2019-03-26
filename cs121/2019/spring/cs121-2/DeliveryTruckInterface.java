import java.util.ArrayList;
/**
 * 
 * @author marissa
 */
public interface DeliveryTruckInterface 
{
	/**
	 * Returns the name of the delivery driver.
	 * @return The name.
	 */
	public String getDriverName();

	/**
	 * Adds the given box to the truck.
	 * @param box The box to add.
	 */
	public void addBox(Box box);
	
	/**
	 * Return the largest box.
	 * @return the largest box, or null if the list is empty.
	 */
	public Box getLargestBox();
	
	/**
	 * Returns a COPY of the list.
	 * @return
	 */
	public ArrayList<Box> getBoxList();
	
	public String toString();
}
