/**
 * Represents a tic-tac-toe board.
 * @author marissa
 * @author cs121-5
 * @version Spring 2018
 */
public class TicTacToeBoard
{
	private TicTacToeSquare[][] board;

	/**
	 * Initializes an empty TicTacToe board.
	 */
	public TicTacToeBoard()
	{
		// initialize 2D array (board)
		board = new TicTacToeSquare[3][3];
		
		// use nested loop to fill with Square.EMPTY s
		for(int i = 0; i < board.length; i++)
		{
			for(int j = 0; j < board[i].length; j++)
			{
				board[i][j] = TicTacToeSquare.EMPTY;
			}
		}
	}
	
	/**
	 * Sets the value at position x, y to the value.
	 * @param x the row
	 * @param y the column
	 * @param value the value to set it to (e.g. X, O, or EMPTY)
	 * @return true if successful, false otherwise
	 */
	public boolean setSquare(int row, int col, TicTacToeSquare value)
	{
		if(row >= 0 && row < board.length && col >= 0 && col < board[row].length )
		{
			board[row][col] = value;
			return true;
		}
		else
		{
			return false;
		}
	}
	
	
	public String toString()
	{
		String output = "";
		
		// use nested loop to create output string
		for(int i = 0; i < board.length; i++)
		{
			for(int j = 0; j < board[i].length; j++)
			{
				if(board[i][j] == TicTacToeSquare.EMPTY)
				{
					output += " ";
				}
				else
				{
					output += board[i][j];
				}
				
				if(j < board[i].length - 1) // only print | if cols 0 or 1
				{
					output += " | ";
				}
			}
			if(i < board.length - 1) // only print ----- if rows 0 or 1
			{
				output += "\n---------\n";
			}
		}
		return output;
	}
}
