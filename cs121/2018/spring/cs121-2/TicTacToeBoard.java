/**
 * Represents a TicTacToe Board/Grid
 * @author marissa
 * @author cs121-2
 * @version Spring 2018
 */
public class TicTacToeBoard
{
	// Instance variables
	private enum TicOrTac { X, O, EMPTY }
	private TicOrTac[][] board;
	
	/**
	 * Initializes an empty tic-tac-toe board.
	 */
	public TicTacToeBoard()
	{
		board = new TicOrTac[3][3];
		
		for(int i = 0; i < board.length; i++)
		{
			for(int j = 0; j < board[i].length; j++)
			{
				board[i][j] = TicOrTac.EMPTY;
			}
		}
	}
	
	/**
	 * Try to update corresponding position with player's tic or tac.
	 * If invalid player is passed in, will do nothing and return false.
	 * @param x The x coordinate
	 * @param y The y coordinate
	 * @param player A character representing the player. Must be 'X' or 'O'
	 * @return true if successful, false otherwise.
	 */
	public boolean setValue(int x, int y, char player)
	{
		// TODO: validate that x and y fall within board bounds.
		
		switch(player)
		{
		case 'X':
			board[x][y] = TicOrTac.X;
			return true;
		case 'O':
			board[x][y] = TicOrTac.O;
			return true;
		default:
			// do nothing. don't let them play
			return false;
		}
	}
	
	/**
	 * Prints board with following format.
	 *	  |   | 
	 *	----------
	 *	  |   |
	 *  ----------
	 *	  |   |
	 */
	public String toString()
	{
		String output = "";
		
		for(int i = 0; i < board.length; i++)
		{
			for(int j = 0; j < board[i].length; j++)
			{
				if(board[i][j] == TicOrTac.EMPTY)
				{
					output += "  ";
				}
				else
				{
					output += board[i][j] + " ";
				}
				if(j < board[i].length - 1) // don't print | after last column
				{
					output += "| ";
				}
			}
			if(i < board.length - 1) // only print ---- after first 2 rows
			{
				output += "\n----------\n";
			}
		}
		return output;
	}
}
