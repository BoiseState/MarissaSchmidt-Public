/**
 * Demonstrates a nested for loop.
 * @author marissa, cs121-2
 */
public class NestedLoops
{
	public static void main(String[] args)
	{
		int count = 0;
		
		for(int i = 0; i < 100; i++)
		{
			for(int j = 0; j < 100; j++)
			{
				System.out.println("I’m here!");
				count++;
			}
		}
		System.out.println("Count: " + count);
	}
}
