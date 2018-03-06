/**
 * Driver class to test CupOfDice class.
 * @author marissa
 * @author cs121-5
 */
public class Yahtzee
{
	public static void main(String[] args)
	{
		CupOfDice cup = new CupOfDice(5);
		
		for(int i = 0; i < 10000; i++)
		{
			cup.roll();
			
			if(cup.hasYahtzee() == true)
			{
				System.out.println("Yahtzee!!!");
				System.out.println(cup);
				System.out.println(cup.getTotalFaceValue());
			}
		}
	}
}
