/**
 * Tester class for Dogs.
 * 
 * @author marissaschmidt
 */
public class DogKennel
{
	public static void main(String[] args)
	{
		Dog dog1 = new Dog("Norman", 12345);
		
		dog1.bark();
		dog1.setGender("male");
		
		Dog dog2 = new Dog("Norman", 12345);
		
		Dog dog3 = new Dog("Callie", 5678);
		
		// Use equals method to compare dog1 and dog2
		if(dog1.equals(dog2))
		{
			System.out.println("Those are the same dog!");
		}
		
		
		// Use compareTo method to determine which dog is "smaller" or "less than" the other dog.
		if(dog1.compareTo(dog2) < 0) 
		{
			System.out.println(dog1 + " is smaller");
		}
		else if(dog1.compareTo(dog2) > 0)
		{
			System.out.println(dog2 + " is smaller");
		}
		else
		{
			System.out.println(dog1 + " and " + dog2 + " have the same id");
		}
		
	}

}
