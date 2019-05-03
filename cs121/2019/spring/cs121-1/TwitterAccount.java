import java.util.ArrayList;

public class TwitterAccount
{
	private String id;
	private String email;
	private ArrayList<String> hashtags;
	
	public TwitterAccount(String id, String email)
	{
		this.id = id;
		this.email = email;
		this.hashtags = new ArrayList<String>(); 
	}
	
	public String getId()
	{
		return id;
	}
	
	public void setId(String newId)
	{
		this.id = newId;
	}
	
	public String getEmail()
	{
		return email;
	}
	
	public void setEmail(String newEmail)
	{
		this.email = newEmail;
	}
	
	public void addHashtag(String tag)
	{
		hashtags.add(tag);
	}
	
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
	
	public static void main(String[] args)
	{
		TwitterAccount tAccount = new TwitterAccount("snoopy", "snoopy@peanuts.com");
		tAccount.addHashtag("dog");
		tAccount.addHashtag("puglife");
		if(tAccount.checkHashtag("dog") == true)
		{
			System.out.println("It's there!");
		}
		else
		{
			System.out.println("It's not");
		}
		
	}
}
