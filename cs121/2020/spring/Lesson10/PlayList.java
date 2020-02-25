
public class PlayList
{
	public static void main(String[] args)
	{
		// Read data from user
		
		String playTime = "03:45";
		
		int min = Integer.parseInt("03");
		int secs = Integer.parseInt("45");
		
		
		
		
		Song song1 = new Song("Old MacDonald", "Kid Tunez", "Children's Music", 240);
		
		System.out.println("===========================");
		System.out.println(song1);
		System.out.println("===========================");
	}

}
