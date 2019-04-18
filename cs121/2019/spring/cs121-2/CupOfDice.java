
public class CupOfDice
{
	private final int NUM_DICE = 5;
	
	private Die[] dice;
	
	public CupOfDice()
	{
		this.dice = new Die[NUM_DICE];
		
		for(int i = 0; i < dice.length; i++)
		{
			dice[i] = new Die();
		}
	}
	
	public void roll()
	{
		for(Die die : dice)
		{
			die.roll();
		}
	}
	
	public String toString()
	{
		String result = "";
		
		for(Die die : dice)
		{
			result += "[" + die + "]"; 
		}
		
		return result;
	}
	
}
