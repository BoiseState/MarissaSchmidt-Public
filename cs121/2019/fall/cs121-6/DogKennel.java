import java.util.ArrayList;
import java.util.Collections;

/**
 * An aggregate class containing multiple dog objects.
 * @author marissaschmidt
 */
public class DogKennel
{
	// Instance variables
	private String name;
	private ArrayList<Dog> dogList;
	
	/**
	 * Creates an empty dog kennel.
	 * @param name The name of the kennel.
	 */
	public DogKennel(String name)
	{
		this.name = name;
		dogList = new ArrayList<Dog>();
	}
	/**
	 * Returns the name of the kennel.
	 * @return the name.
	 */
	public String getName()
	{
		return name;
	}
	
	/**
	 * Creates and adds a Dog with the given name and id to 
	 * this DogKennel.
	 * @param dogName The name of the dog.
	 * @param id The id of the dog.
	 */
	public void addDog(String dogName, int id)
	{
		// Create a Dog object from the given dogName and id
		Dog dog = new Dog(dogName, id);
		
		// Add that dog to list
		dogList.add(dog);
	}
	
	/**
	 * Creates and adds a Dog with the given dog to 
	 * this DogKennel.
	 * @param dog The dog to add.
	 */
	public void addDog(Dog dog)
	{
		// Add that dog to list
		dogList.add(dog);
	}
	
	/**
	 * Returns the dog with the highest id.
	 * @return The Dog with the highest id.
	 */
	public Dog getLastAddedDog()
	{
		if(dogList.isEmpty())
		{
			return null;
		}
		
		Dog max = Collections.max(dogList);
		
		return max;
	}

	/**
	 * Returns a copy of the dog list.
	 * @return A copy of the dog list.
	 */
	public ArrayList<Dog> getDogList()
	{
		ArrayList<Dog> copy = new ArrayList<Dog>();
		for(Dog d : dogList)
		{
			copy.add(d);
		}
		return copy;
	}
	
	@Override
	public String toString()
	{
		// return a string representing the object
		String output = name + " has " + dogList.size() + " dogs.\n";
		output += "==================\n";
		for(Dog d : dogList)
		{
			output += d + "\n";
		}
		return output;
	}
	
}
