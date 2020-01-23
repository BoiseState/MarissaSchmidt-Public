/**
 * Exercise 2.10 from Java Foundations
 * @author marissaschmidt
 *
 */
public class Ex2_10
{
	public static void main(String[] args)
	{
		int iResult;
		int num1 = 25;
		int num2 = 40;
		int num3 = 17;
		int num4 = 5;
		double fResult, val1 = 17.0, val2 = 12.78;
		
		// a.
		iResult = num1 / num4;  // 25 / 5
		System.out.println(iResult);
		
		// b.
		fResult = num1 / num4;
		System.out.println(fResult);
		
		// c.
		iResult = num3 / num4; // 17/5
		System.out.println(iResult);
		
		// d.
		fResult = num3 / num4; // 17/5
		System.out.println(fResult);
		
		// e.
		fResult = val1 / val2;
		System.out.println(fResult);
		
		// f.
		fResult = val1 / num4; // 17.0 / 5
		System.out.println(fResult);
		
		// j.
		fResult = (double)(num1 / num2); // 25 / 40
		System.out.println(fResult);
		
		// l.
		iResult = (int)val1 / num4; // 17.0 / 5
		System.out.println(iResult);
		
		// l.
		iResult = (int)(val1 / val2); // 17.0 / 12.78
		System.out.println(iResult);
	}
}
