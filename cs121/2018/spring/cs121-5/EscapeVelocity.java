/**
 * Uses Math.sqrt() to compute escape velocity.
 * @author cs121-5
 * @version Spring 2018
 */
public class EscapeVelocity
{
	public static void main(String[] args)
	{
		double gravity = 9.8;
		double mass = 100;
		double radius = 10;
		
		double escapeVelocity = Math.sqrt(2*gravity*mass/radius);
		
		System.out.println(escapeVelocity);
		
		// Other Math methods.
		//int result = (int) Math.pow(2, 4); // 2^4
		//double otherResult = Math.exp(10); // e^10
	}
}
