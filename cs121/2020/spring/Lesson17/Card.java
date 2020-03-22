/**
 * This class represents a playing card.
 * @author marissa
 */
public class Card implements Comparable<Card>
{
	// Instance Variables
	private Suit suit;
	private FaceValue value;
	
	// Constructor(s)
	/**
	 * Creates a card with the given suit and value.
	 * @param suit The suit of this card.
	 * @param value The value of this card (2-14).
	 */
	public Card(Suit suit, FaceValue value)
	{
		this.suit = suit;
		this.value = value;
	}
	
	/**
	 * Returns the suit of this card.
	 * @return The suit.
	 */
	public Suit getSuit()
	{
		return this.suit;
	}
	
	/**
	 * Returns the value of this card.
	 * @return the value.
	 */
	public FaceValue getValue()
	{
		return this.value;
	}
	
	@Override
	public int compareTo(Card o)
	{
		return (this.value.ordinal() - o.value.ordinal());
		
//		if(this.value.ordinal() == o.value.ordinal())
//		{
//			return 0;
//		}
//		else if (this.value.ordinal() < o.value.ordinal())
//		{
//			return -1;
//		}
//		else
//		{
//			return 1;
//		}
	}
	
	
	// Methods
	public String toString()
	{
		String output = value + " of " + suit;
		return output;
	}
}
