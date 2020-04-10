

/**
 * An example of passing an one-dimensional array as a parameter.
 * @author amit
 */
public class ArrayPassing
{

	/**
	 * Double each element of the passed array
	 * @param a
	 */
	private static void changeArray(int[] a)
	{
		for (int i = 0; i<a.length; i++) // [2][4][6][8][10]
			a[i] = 2*a[i];
	}

	/**
	 * @param args Not used
	 */
	public static void main(String[] args)
	{
		int[] X = new int[5]; // [0][0][0][0][0]

		// Filling X array withe values
		for (int i = 0; i<X.length; i++) // [1][2][3][4][5]
			X[i] = i+1;

		for (int i = 0; i<X.length; i++)
			System.out.print(X[i] + " ");
		System.out.println();

		changeArray(X);  // X will have the values [2][4][6][8][10]

		for (int i = 0; i<X.length; i++)
			System.out.print(X[i] + " ");
		System.out.println();
	}
}
