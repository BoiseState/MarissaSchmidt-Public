
public class GrowingArrays
{
	public static void main(String[] args)
	{
		// Declaring and instantiating an array of 100 integers
		int[] array = new int[100];
		
		// Set or initialize all values in the array to 1
		for(int i = 0; i < array.length; i++) {
			array[i] = 1;
		}

		// Declaring and instantiating an array of 200 integers
		int[] temp = new int[array.length * 2];
		
		// Copying all the values from the original into the new temp array
		for(int i = 0; i < array.length; i++) {
			temp[i] = array[i];
		}
		
		// Assigning the new, larger array to our original array reference
		array = temp;
	}

}
