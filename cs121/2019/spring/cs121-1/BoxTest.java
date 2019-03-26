import java.util.ArrayList;

/**
 * Tests our Box class.
 * @author marissa
 */
public class BoxTest {

	public static void main(String[] args)
	{
		Box myBox = new Box(10, 30, 55);
		Box myOtherBox = new Box(60, 70, 34, true);
		
		System.out.println(myBox);
		
		double boxHeight = myBox.getHeight();
		myBox.setHeight(56.6);
		
		
		if(myBox.equals(myOtherBox))
		{
			System.out.println("My boxes are the same");
		}
		
		
		if(myBox.compareTo(myOtherBox) == 0)
		{
			System.out.println("They are equal");
		}
		
		
		double volume = myBox.getVolume();
		double surfaceArea = myBox.getSurfaceArea();
		
		// Create a truck and load the boxes
		DeliveryTruck truck = new DeliveryTruck(4000);
		truck.addBox(myBox);
		truck.addBox(myOtherBox);
		
		System.out.println(truck);
		
		ArrayList<Box> allTheBoxes = truck.getBoxList();
		allTheBoxes.clear();
		System.out.println(truck);
		
		Box biggest = truck.getLargestBox();
		System.out.println(biggest);
		
	}

}
