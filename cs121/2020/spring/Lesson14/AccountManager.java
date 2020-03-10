/**
 * This is a driver class to test the Account class.
 * @author marissa
 */
public class AccountManager
{
	public static void main(String[] args)
	{
		Account account1 = new Account(102454);
		
		System.out.println(account1);
		
		// Activate account 1
		account1.setActive(true);
		if(account1.isActive())
		{
			System.out.println("Account 1 is active");
		}
		else
		{
			System.out.println("Account 1 is inactive");
		}
		
		System.out.println(account1);
		
		
		Account account2 = new Account(45783, "snoopy12");
		
		System.out.println(account2);
		
		// Testing get/set id
		account2.setId(123456);
		int id2 = account2.getId();
		
		System.out.println(id2);
		
		System.out.println(account2);
	}
}
