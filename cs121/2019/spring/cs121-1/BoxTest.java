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
		
	}

}
