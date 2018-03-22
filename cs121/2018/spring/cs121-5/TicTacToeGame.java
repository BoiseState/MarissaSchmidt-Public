/**
 * Plays a game of tic tac toe.
 * @author marissa
 * @author cs121-5
 * @version Spring 2018
 */
public class TicTacToeGame
{
	public static void main(String[] args)
	{
		TicTacToeBoard board = new TicTacToeBoard();
		
		System.out.println(board);
		
		boolean success = board.setSquare(1, -1, TicTacToeSquare.X);
		if(success)
		{
			System.out.println("Successfully updated board!");
		}
		else
		{
			System.out.println("Uh-oh! Board not updated :( Something went wrong.");
		}
		System.out.println(board);
	}
}
