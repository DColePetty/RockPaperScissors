//rock paper scissors
//Cole Petty Period 2 APCS

import java.util.Scanner;
import java.util.Random;


public class RPS
{
  private static int playerWins;
  private static int computerWins;
  private static int ties;
    
  public static void playerWins()
   {
    System.out.println("You Win!");
    playerWins++;
   }
  public static void computerWins()
   {
    System.out.println("You Lose!");
    computerWins++;
   }
  public static void ties()
  {
    System.out.println("You Tie!");
      ties++;
  }
  
  
  public static void main(String[] args) // main method "start" function to computers
  {
    Scanner input = new Scanner(System.in); 
    while (playerWins <= 9)
    {  
    double percent = ( ((playerWins + .01 ) / (playerWins + computerWins + ties + .01)) * 100 );
    System.out.print ("Please enter 1 for Rock, 2 for Paper, or 3 for Scissors: ");
    int one = input.nextInt();

    Random random = new Random();
    int two = random.nextInt(3)+1;
    
    if (one == 1 && two == 1)
       ties();
    if (one == 1 && two == 2)
       computerWins();
    if (one == 1 && two == 3)
       playerWins();
    if (one == 2 && two == 1)
       playerWins();
    if (one == 2 && two == 2)
       ties();
    if (one == 2 && two == 3)
       computerWins();
    if (one == 3 && two == 1)
       computerWins();
    if (one == 3 && two == 2)
       playerWins();
    if (one == 3 && two == 3)
       ties();
    if (playerWins == 10)
    System.out.println("Your Win rate was approximately: " + percent + "%");
    else
    System.out.println("Good Game, Play again! And choose different numbers this time!" );
    System.out.println("Player wins: " + playerWins + "  Computer wins: " + computerWins + "  Ties: " + ties);
    System.out.println(" ");


    }
  }

}