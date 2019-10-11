/**
 * Demonstrates use of more complex if-statements
 * 
 * @author Marissa Schmidt
 */
public class Sorting
{
	public static void main(String[] args)
	{
		int num1 = 50;
		int num2 = 5;
		int num3 = 20;
		
		int smallest = num1;
		
		// Find smallest of three numbers
//		if(num1 < num2) {
//			if(num1 < num3) {
//				smallest = num1;
//			} else {
//				smallest = num3;
//			}
//		}
//		else if (num2 < num3) {
//			smallest = num2;
//		}
//		else {
//			smallest = num3;
//		}
//		
//		System.out.println("Smallest number is: " + smallest);
//		
		
		if(num1 <= num2 && num1 <= num3) {
			smallest = num1;
		}
		else if(num2 <= num1 && num2 <= num3) {
			smallest = num2;
		}
		else if(num3 <= num1 && num3 <= num2) {
			smallest = num3;
		}
		
		System.out.println("Smallest number is: " + smallest);
		
		// Sort numbers from smallest to largest using bubble sort
		int temp = num1;
		
		if(num2 < num1) {
			// swap num2 and num1
			temp = num1;
			num1 = num2;
			num2 = temp;
		}
		if(num3 < num2) {
			// swap num3 and num2
			temp = num2;
			num2 = num3;
			num3 = temp;
		}
		if(num2 < num1) {
			// swap num2 and num1
			temp = num1;
			num1 = num2;
			num2 = temp;
		}
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		
		// Find number closest to 25
		
		// Find difference using subtraction and Math.abs for each number
		// Which difference is the smallest using techinque above
	}
}
