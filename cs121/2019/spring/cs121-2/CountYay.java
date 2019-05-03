/**
 * A program that prints multiples of 3 from 100 down to 1 but only if the multiples are odd. 
 * However if the odd multiple of 3 is also a multiple of 11, then instead of the number print "Yay!" 
 * @author marissa
 *
 */
public class CountYay
{
	public static void main(String[] args)
	{
		// from 100 down to 1
		for(int i = 100; i > 0; i--)
		{
		    // if multiple of 3 and odd
			if(i % 3 == 0 && i % 2 != 0)
			{
				if(i % 11 == 0) // if multiple of 11
				{
					System.out.print("Yay! ");
				}
				else
				{
					System.out.print(i + " ");
				}
			}
		}
	}
}
