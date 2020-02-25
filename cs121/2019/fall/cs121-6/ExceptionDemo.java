import java.util.ArrayList;

public class ExceptionDemo
{

	public static void main(String[] args)
	{
		DogKennel kennel = new DogKennel("Dogs R Us");
		
		Dog dog = new Dog("Norman", 123);
		
		kennel.addDog(dog);
		
		ArrayList<Dog> dogs = new ArrayList<Dog>();
		dogs.add(dog);
		if(!dogs.isEmpty())
		{
			Dog dog2 = dogs.get(-10);
		}
	}

}
