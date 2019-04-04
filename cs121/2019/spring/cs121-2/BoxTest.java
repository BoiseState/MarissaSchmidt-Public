import java.util.ArrayList;
public class BoxTest {

	public static void main(String[] args) 
	{
		Box box1 = new Box(10, 19, 5);
		box1.setMaterial(Box.BoxMaterial.CARDBOARD);
		box1.setHeight(1000);
		double height = box1.getHeight();
		System.out.println(box1);
		
		Box box2 = new Box(10, 45, 1, true);
		box2.setFull(false);
		if(box2.isFull())
		{
			// do something
		}
		
		DeliveryTruck truck = new DeliveryTruck("Chuck");
		System.out.println(truck);
		
		truck.addBox(box1);
		truck.addBox(box2);
		
		System.out.println(truck);
		System.out.println();
		
		Box largest = truck.getLargestBox();
		System.out.println("Largest box is " + largest);
		
		ArrayList<Box> allTheBoxes = truck.getBoxList();
		allTheBoxes.clear();
		
		ArrayList<Box> allTheCardboardBoxes = truck.getBoxList(Box.BoxMaterial.CARDBOARD);
		System.out.println(allTheCardboardBoxes);
		System.out.println(truck);
		
//		System.out.println(box1.getVolume());
//		
//		if(box1.compareTo(box2) == 0)
//		{
//			System.out.println("They are equal");
//		}
//		else if (box1.compareTo(box2) < 0)
//		{
//			System.out.println("Box 1 is smaller");
//		}
//		else
//		{
//			System.out.println("Box 2 is smaller");
//		}
//		
//		if(box1.equals(box2))
//		{
//			System.out.println("equal");
//		}
		
		
		
		
	}

}
