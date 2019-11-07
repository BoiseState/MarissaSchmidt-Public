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
		GOLDEN_RETRIEVER,
		POMERANIAN,
		ST_BERNARD,
		UNKNOWN
	}
	
	private String name;
	private int id;
	private Breed breed;
	private boolean adopted;
	private String imagePath;
	
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
		this.adopted = false;
		this.imagePath = null;
	}
	
	/**
	 * Sets the breed of this dog to the given breed.
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
	 * Sets the name of this dog to the given name.
	 * @param name The name.
	 */
	public void setName(String name)
	{
		this.name = name;
	}
	
	/**
	 * Returns this dog's name.
	 * @return The name.
	 */
	public String getName()
	{
		return name;
	}
	
	/**
	 * Checks if this dog has been adopted.
	 * @return True if adopted, false if not.
	 */
	public boolean isAdopted()
	{
		return adopted;
	}
	
	/**
	 * Sets the adoption status of this dog to the given value.
	 * @param adopted True to set as adopted, false if not.
	 */
	public void setAdopted(boolean adopted)
	{
		this.adopted = adopted;
	}
	
	/**
	 * Sets the image path of this dog's photo. Does not validate image exists.
	 * @param path The path to the image.
	 */
	public void setImagePath(String path)
	{
		this.imagePath = path;
	}
	
	/**
	 * Returns the image path of this dog's photo.
	 * @return The path to the image.
	 */
	public String getImagePath()
	{
		return imagePath;
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
		String output = name + " the " + breed + " (" + id + ")";
		if(adopted) {
			output += " [adopted]";
		} else {
			output += " [available]";
		}
		return output;
	}
}
