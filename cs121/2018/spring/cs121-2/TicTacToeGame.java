/**
 * Driver class to play tic-tac-toe
 * @author marissa
 * @author cs121-2
 * @version Spring 2018
 */
public class TicTacToeGame
{
	public static void main(String[] args)
	{
		// Instantiate a new board
		TicTacToeBoard board = new TicTacToeBoard();
		
		// Print the current state of the board
		System.out.println(board);
		
		boolean success = board.setValue(-10, 0, 'X');
		if(success)
		{
			System.out.println("Successful move!");
		}
		else
		{
			System.out.println("You screwed up. Try again!");
		}
		
		// Print the current state of the board
		System.out.println(board);
		
	}
}
