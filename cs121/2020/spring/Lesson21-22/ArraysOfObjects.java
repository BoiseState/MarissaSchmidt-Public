
public class ArraysOfObjects
{

	public static void main(String[] args)
	{

		String[] names = new String[5];
		
		names[0] = "Fred";
		names[1] = "Wilma";
		names[2] = "BamBam";
		
		int nameTwoLength = names[2].length();
		System.out.println("The length of name two is: " + nameTwoLength);
		
		for(String name : names)
		{
			System.out.println(name);
		}
		
		
		for(int i = 0; i < names.length; i++)
		{
			System.out.println(i + ": " + names[i]);
		}
	}

}
