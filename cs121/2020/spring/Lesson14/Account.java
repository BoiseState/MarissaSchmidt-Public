/**
 * This represents an Account.
 * @author marissa
 */
public class Account
{
	private String username;
	private int id;
	private boolean active;
	
	/**
	 * This creates a new account with the specified id.
	 * @param id An integer id for this account.
	 */
	public Account(int id)
	{
		this.username = null;
		this.id = id;
		this.active = false;
	}
	
	/**
	 * This creates a new account with the specified id and username.
	 * @param id An integer id for this account.
	 * @param username The username for this account.
	 */
	public Account(int id, String username)
	{
		this.username = username;
		this.id = id;
		this.active = false;
	}
	
	/**
	 * Returns the username of this account.
	 * @return the username.
	 */
	public String getUsername()
	{
		return username;
	}
	
	/**
	 * Sets the username of this account.
	 * @param username The username.
	 */
	public void setUsername(String username)
	{
		this.username = username;
	}
	
	/**
	 * Returns the id of this account.
	 * @return The id.
	 */
	public int getId()
	{
		return id;
	}
	
	/**
	 * Sets the id of this account.
	 * @param id The id.
	 */
	public void setId(int id)
	{
		this.id = id;
	}
	
	/**
	 * Checks if the account is active.
	 * @return true if it is, false otherwise.
	 */
	public boolean isActive()
	{
		return active;
	}
	
	/**
	 * Updates whether or not the account is active.
	 * @param active true if it is, false otherwise.
	 */
	public void setActive(boolean active)
	{
		this.active = active;
	}
	
	public String toString()
	{
		String output = id + ": " + username;
		
		// if active, print active. else, print inactive
		if(active)
		{
			output = output + " (active)";
		}
		else
		{
			output = output + " (inactive)";
		}
		
		return output;
	}
	
}
