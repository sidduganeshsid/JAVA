/*Q) Enhance the Guesser Game Project which you have learnt in live class. Add the
maximum feature you could add to it.
*/

//features adding to guesser game
/*
 * 1.Range of Numbers
 * 2.Number of Players
 * 3.if tie then winner will play again untill individual player wins
 * 4.
 */


import java.util.*;

class Guesser
{
	int guessNum;
	
    @SuppressWarnings("resource")
	int guessNum()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Guesser Kindly guess the number : ");
		guessNum = sc.nextInt();
		return guessNum;
	}
}

class Player
{
	int guessNum;
	
	@SuppressWarnings("resource")
	int guessNum()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Player Kindly guess the number : ");
		guessNum = sc.nextInt();
		
		return guessNum;
	}
	
}

class Empire
{
	int numFromGuesser;
	int numFromPlayer1;
	int numFromPlayer2;
	
	void collectNumFromGuesser()
	{
		Guesser g = new Guesser();
		numFromGuesser = g.guessNum();
	}
	
	void collectNumFromPlayers()
	{
		Player p1 = new Player();
		numFromPlayer1 = p1.guessNum();
		Player p2 = new Player();
		numFromPlayer2 = p2.guessNum();
	}
	
	void compare()
	{
		if(numFromGuesser == numFromPlayer1)
		{
			if(numFromGuesser == numFromPlayer2)
			{
				System.out.println("both player 1 and 2 won");
			}
			else {
			System.out.println("player1 won"); 
			}
		}
		else if(numFromGuesser == numFromPlayer2)
		{
			System.out.println("player2 won");
		}
		else
		{
			System.out.println("Game Lost, Try again!");
		}
		
	}
}

public class SampleGame {

	public static void main(String[] args) {

		Empire E = new Empire();
		E.collectNumFromGuesser();
		E.collectNumFromPlayers();
		E.compare();

	}

}
