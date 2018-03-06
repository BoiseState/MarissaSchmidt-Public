/**
 * Driver class to test CupOfDice class.
 * @author marissa
 * @author cs121-2
 */
public class Yahtzee
{
	public static void main(String[] args)
	{
		CupOfDice myDice = new CupOfDice(5);
		
		for(int i = 0; i < 1000; i++)
		{
			myDice.roll();
			
			if(myDice.hasYahtzee())
			{
				System.out.println("Yahtzee!!");
				System.out.println(myDice);
			}
		}
	}
}
