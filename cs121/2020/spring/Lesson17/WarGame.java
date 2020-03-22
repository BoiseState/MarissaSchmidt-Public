
/**
 * A driver class to test the Card class.
 * @author marissa
 */
public class WarGame
{

	public static void main(String[] args)
	{
		// Instantiate a new Card
		Card card1 = new Card(Suit.SPADES, FaceValue.FOUR);
		Card card2 = new Card(Suit.CLUBS, FaceValue.ACE);
		
		System.out.println(card1);
		
		
		
		FaceValue value = card1.getValue();
		Suit suit = card1.getSuit();
		
		
		if(card1.compareTo(card2) == 0)
		{
			System.out.println("Tie!");
		}
		else if(card1.compareTo(card2) > 0)
		{
			System.out.println("Card 1 wins!");
		}
		else
		{
			System.out.println("Card 2 wins!");
		}
		

	}

}
