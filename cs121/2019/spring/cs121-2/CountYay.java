
public class CountYay
{

	public static void main(String[] args)
	{
		for(int i = 100; i > 1; i--)
		{
			if(i % 3 == 0 && i % 2 == 1)
			{
				if(i % 11 == 0)
				{
					System.out.print("yay! ");
				}
				else
				{
					System.out.print(i + " ");
				}
			}
		}
	}
}
