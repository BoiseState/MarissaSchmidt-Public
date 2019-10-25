import java.util.ArrayList;

/**
 * Test our DogKennel class.
 * @author marissaschmidt
 *
 */
public class DogKennelTester
{

	public static void main(String[] args)
	{
		DogKennel kennel = new DogKennel("Idaho Humane Society");
	
		//System.out.println(kennel);
		
		kennel.addDog("Jackson", 456);
		kennel.addDog("Casper", 457);
		
		System.out.println(kennel);
		
		Dog lastAdded = kennel.getLastAddedDog();
		
		System.out.println("The dog with the highest id is " + lastAdded);
		
		ArrayList<Dog> dogs = kennel.getDogList();
		dogs.clear();
		
		System.out.println(kennel);
	}

}
