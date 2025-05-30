package GuessTheNumberGame;
import java.util.Scanner;
import java.util.Random;
public class GuessTheNumberGame
{
    public static void main(String[] args)
    {
        System.out.println("Welcome to Guess the Number!");
        System.out.println("Created by Joshua Hall");

        Scanner keyboard = new Scanner(System.in);
        Random random = new Random();

        int PlayAgain = 1;

        while (PlayAgain == 1)
        {
            int GuessNumber = random.nextInt(11);
            int UserGuess = -1;
            int count = 0;

            while (GuessNumber != UserGuess && count < 4)
            {
                System.out.print("\nEnter Guess(0-10): ");
                UserGuess = keyboard.nextInt();
                count++;

                if(UserGuess > GuessNumber)
                {
                    System.out.print("Too high\t");
                } 
                else if (UserGuess < GuessNumber)
                {
                    System.out.print("Too low\t");
                }
                
            }

            if (UserGuess == GuessNumber)
                {
                    System.out.println("\nGuess Correct!\nIt took you " + count + " tries!");
                } else {
                    System.out.println("\nOut of Tries! The correct number was " + GuessNumber + ".");
                }

                do {
                    System.out.print("\nPlay again? (1 = Yes, 2 = No):");
                    PlayAgain = keyboard.nextInt();
                    if(PlayAgain != 1 && PlayAgain !=2)
                        System.out.println("Invalid input. Enter 1 or 2: ");
                 } while (PlayAgain != 1 && PlayAgain !=2);

                //System.out.print("\nPlay again? (1 = Yes, 2 = No):");
                //PlayAgain = keyboard.nextInt();
        }

        System.out.println("\nThanks for playing! Goodbye!");

    }
}