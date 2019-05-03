import java.util.ArrayList;

/**
 * This class represents a twitter account.
 * @author marissa
 */
public class TwitterAccount
{
	private String id;
	private String email;
	private ArrayList<String> hashtags;
	
	/**
	 * Creates a new TwitterAccount.
	 * @param id The user id.
	 * @param email The user's email.
	 */
	public TwitterAccount(String id, String email)
	{
		this.id = id;
		this.email = email;
		this.hashtags = new ArrayList<String>();
	}
	
	/**
	 * Returns the id.
	 * @return The id.
	 */
	public String getId()
	{
		return id;
	}
	
	/**
	 * Sets the id.
	 * @param id The user id.
	 */
	public void setId(String id)
	{
		this.id = id;
	}
	
	/**
	 * Returns the user's email address.
	 * @return The email address.
	 */
	public String getEmail()
	{
		return email;
	}
	
	/**
	 * Sets the user's email address.
	 * @param email The email address.
	 */
	public void setEmail(String email)
	{
		this.email = email;
	}
	
	/**
	 * Adds the given hashtag to the user's list.
	 * @param tag The tag to add.
	 */
	public void addHashtag(String tag)
	{
		hashtags.add(tag);
	}
	
	/**
	 * Checks if the hashtag is in the user's list.
	 * @param tag the tag to check
	 * @return True if it is, false otherwise.
	 */
	public boolean checkHashtag(String tag)
	{
		if(hashtags.contains(tag))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	@Override
	public String toString()
	{
		String result = "id " + id + " email " + email + " hashtags: " + hashtags;
		return result;
	}
	
	/**
	 * Tests the TwitterAccount class.
	 * @param args Command line arguments not used.
	 */
	public static void main(String[] args)
	{
		TwitterAccount account = new TwitterAccount("therealsnoopy", "snoopy@peanuts.com");
		
		account.addHashtag("#christmastree");
		account.addHashtag("#redbaron");
		
		if(account.checkHashtag("#doesntexist"))
		{
			System.out.println("exists!");
		}
		else
		{
			System.out.println("doesn't exist");
		}
		System.out.println(account.toString());
	}
}


