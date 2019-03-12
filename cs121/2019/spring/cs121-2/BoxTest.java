
public class BoxTest {

	public static void main(String[] args) 
	{
		Box box1 = new Box(10, 19, 5);
		box1.setHeight(1000);
		double height = box1.getHeight();
		System.out.println(box1);
		
		
		
		
		Box box2 = new Box(10, 45, 1, true);
		box2.setFull(false);
		
		
	}

}
