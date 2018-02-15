import java.awt.Color;
import java.util.ArrayList;
import java.util.Random;

public class Rainbow
{
	public static void main(String[] args)
	{
		ArrayList<Color> rainbow = new ArrayList<Color>();
		Random random = new Random();
		for(int i = 0; i < 10; i++)
		{
			Color color = new Color(random.nextInt(256), random.nextInt(256),random.nextInt(256));
			rainbow.add(color);
		}
		
		if(rainbow.contains(Color.BLUE))
		{
			System.out.println("Blue is there!");
		}
		
		System.out.println(rainbow);
	}
}
