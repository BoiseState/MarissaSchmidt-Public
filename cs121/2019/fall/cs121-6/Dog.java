/**
 * Represents a Dog. Implements the Comparable interface so we can 
 * compare two dogs to each other and eventually sort them.
 * 
 * @author marissaschmidt
 */
public class Dog implements DogInterface, Comparable<Dog>
{
	public enum Breed { 
		LABRADOR, 
		GREAT_DANE, 
		PUG, 
		BEAGLE,
		MUTT,
		TERRIER,
		UNKNOWN
	}
	
	private String name;
	private int id;
	private Breed breed;
	
	/**
	 * Creates a dog
	 * @param name the name
	 * @param id the id
	 */
	public Dog(String name, int id)
	{
		//initialize instance variables
		this.name = name;
		this.id = id;
		this.breed = Breed.UNKNOWN;
	}
	
	/**
	 * Sets the breed of this dog to the given dog.
	 * @param breed The breed.
	 */
	public void setBreed(Breed breed)
	{
		this.breed = breed;
	}
	
	/**
	 * Returns this dog's breed.
	 * @return The breed.
	 */
	public Breed getBreed()
	{
		return breed;
	}
	
	/**
	 * Barks
	 */
	public void bark()
	{
		System.out.println("woof woof");
	}
	
	/**
	 * Fetches
	 * @return A string representing what was fetched
	 */
	public String fetch()
	{
		return "a bone";
	}
	
	/**
	 * Poops
	 */
	public void poop()
	{
		System.out.println("poop");
	}
	
	/**
	 * Sits
	 */
	public void sit()
	{
		System.out.println("sit");
	}

	/**
	 * Checks if this dog equals the dog passed in by the user (that dog).
	 * Compares name and id.
	 * @param that The dog to compare to.
	 * @return True if equal, false if not.
	 */
	public boolean equals(Dog that)
	{
		if(this.name.equals(that.name) && (this.id == that.id))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	@Override
	public int compareTo(Dog dog)
	{
		if(this.id < dog.id) // return -1 if this dog < that dog
		{
			return -1;
		}
		else if (this.id > dog.id) // return 1 if this dog > that dog
		{
			return 1;
		}
		else // return 0 if this dog == that dog
		{
			return 0;
		}
	}
	
	public String toString()
	{
		return name + "the " + breed + " (" + id + ")";
	}
}
