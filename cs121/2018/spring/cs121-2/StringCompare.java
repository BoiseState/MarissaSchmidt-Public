

/**
 * Demonstrates == equality operator vs equals.
 * 
 * @author CS121 Instructors
 */
public class StringCompare
{
	public static void main(String[] args)
	{
		String thingOne = "Goodbye";
		String thingTwo = "goodbye"; // Java will actually only declare the string literal one in memory.
		
		
		// Compares thingOne and thingTwo for equality
		if(thingOne.equals(thingTwo))
		{
			System.out.println("equals(): " + thingOne + " equals " + thingTwo);
		}
		else
		{
			System.out.println("equals(): " + thingOne + " does not equal " + thingTwo);
		}
		
		// Compares thingOne and thingTwo for equality (ignoring case)
		if(thingOne.equalsIgnoreCase(thingTwo))
		{
			System.out.println("equalsIgnoreCase(): " + thingOne + " equals " + thingTwo);
		}
		else
		{
			System.out.println("equalsIgnoreCase(): " + thingOne + " does not equal " + thingTwo);
		}
		
		// Compare using compareTo(). compareTo returns,
		// 		negative number if thingOne < thingTwo
		// 		zero if thingOne == thingTwo
		// 		positive number if thingOne > thingTwo
		if(thingOne.compareTo(thingTwo) == 0)
		{
			System.out.println("compareTo(): " + thingOne + " == " + thingTwo);
		}
		else if(thingOne.compareToIgnoreCase(thingTwo) > 0)
		{
			System.out.println("compareTo(): " + thingOne + " > " + thingTwo);
		}
		else
		{
			System.out.println("compareTo(): " + thingOne + " < " + thingTwo);
		}
	}
}
