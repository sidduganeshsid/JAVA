package guessergame;


import java.util.Scanner;


//features adding to guesser game
/*
* 1.Range of Numbers - done
* 2.Number of Players - done
* */

class GuesserManOrg
{
	int guessNum;
		
	int guessNum(int min_range,int max_range)
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Guesser,kindly guess the any number from "+min_range+" to "+max_range+": ");
		guessNum = sc.nextInt();
		
		while(guessNum<min_range || guessNum>max_range)
        {
			System.out.print("Guesser guess the any number from "+min_range+" to "+max_range+": ");
			guessNum = sc.nextInt();
			if(guessNum>=min_range && guessNum<=max_range)
			{
                    break;
            }
            
		}
        return guessNum;

      }

}

class PlayerManOrg
{
	int guessNum;
	
	int guessNum(int min_range,int max_range,int c)
	{

		Scanner sc = new Scanner(System.in);
		System.out.print("player"+(c+1)+" kindly guess the number : ");
		guessNum = sc.nextInt();
		while(guessNum<min_range || guessNum>max_range)
        {
			System.out.print("Player guess the any number from "+min_range+" to "+max_range+": ");
			guessNum = sc.nextInt();
			if(guessNum>=min_range && guessNum<=max_range)
			{
                    break;
            }
            
		}            
	
		return guessNum;
	}

}

class EmpireManOrg
{
	int numFromGuesser;
	int[] numFromPlayer;
	
	void collectNumFromGuesser(int a,int b)
	{
		GuesserManOrg g = new GuesserManOrg();
		numFromGuesser = g.guessNum(a,b);
	}
	
	void collectNumFromPlayers_and_compare(int a,int b,int n)
	{
		int i=0;
		int[] numFromPlayer = new int[n];
		for(;i<n;i++)
		{
			PlayerManOrg p = new PlayerManOrg();
			
			numFromPlayer[i] = p.guessNum(a,b,i);
		}
		boolean flag = false;
		for(int rep=0;rep<numFromPlayer.length;rep++)
		{
			if(numFromGuesser == numFromPlayer[rep])
			{
				System.out.println("\tplayer "+(rep+1)+" Won");
				flag = true;
			}
		}if(flag == false)
		{
			System.out.println("\tGame Lost Try Again!");
		}
		

	}
	

}




public class OriginalGuesserGame {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Starting number :");
		int min_range = sc.nextInt();
		System.out.print("Enter the Ending number :");
		int max_range = sc.nextInt();
		System.out.print("Number of Players: ");
		int nfp = sc.nextInt();

		EmpireManOrg e = new EmpireManOrg();
		e.collectNumFromGuesser(min_range,max_range);
		e.collectNumFromPlayers_and_compare(min_range,max_range,nfp);
		
	}

}
