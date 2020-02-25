
public class Card
{
	public enum Suit
	{
		CLUBS, DIAMONDS, HEARTS, SPADES
	}
	
	private Suit suit;
	private String value;
	
	public Card()
	{
		// default value of this card will be 4 of clubs
		this.suit = Suit.CLUBS;
		this.value = "cashew";
	}

}
