import java.awt.Color;
import java.util.ArrayList;
import java.util.Random;

public class Rainbow
{
	public static void main(String[] args)
	{
		Random rand = new Random();
		ArrayList<Color> rainbow = new ArrayList<Color>();
		
		int n = 10;
		for(int i = 0; i < n; i++)
		{
			Color c = new Color(rand.nextInt(256), rand.nextInt(256),rand.nextInt(256));
			rainbow.add(c);
		}
		
		rainbow.remove(2);
		
		Color orange = rainbow.get(1);
		rainbow.remove(orange);
		
		System.out.println("My rainbow: " + rainbow);
		
		System.out.println("There are " + rainbow.size() + " elements");
		
		if(rainbow.contains(Color.YELLOW))
		{
			System.out.println("It has yellow!");
		}
		else
		{
			System.out.println("It does not have yellow!");
		}
		
		System.out.println("My rainbow: " + rainbow);
		
		for(int i = 0; i < rainbow.size(); i++)
		{
			Color color = rainbow.get(i);
			System.out.println(color);
		}
		
		System.out.println("There are " + rainbow.size() + " elements");

	}

}
