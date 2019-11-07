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
		// Test Breed enum code
		Dog myDog = new Dog("Rover", 1234);
		myDog.setBreed(Dog.Breed.GOLDEN_RETRIEVER);
		myDog.setAdopted(true);
		myDog.setImagePath("1234-rover.jpg");
		
		System.out.println(myDog);
		
		Dog.Breed breed = myDog.getBreed();
		
		for(Dog.Breed b : Dog.Breed.values())
		{
			System.out.println(b);
		}
		
		DogKennel kennel = new DogKennel("Idaho Humane Society");
	
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
