import java.util.Random;
import java.util.Scanner;

public class crapsGame {
    public static void main(String[] args) {
        System.out.println("GAME of CRAPS");
        int points = 0;

        //Initial roll of the dice
        int diceSum = diceRoll();
        System.out.println("Sum of dice: " + diceSum);

        //If the sum of the dice is 2, 3 or 12, you lose (craps!!)
        if (diceSum == 2 || diceSum == 3 || diceSum == 12)
        {
            System.out.println("Craps!!! The game is over with a loss");
        }

        //If the sum of the dice is 7 or 11, you win the game
        else if (diceSum == 7 || diceSum == 11)
        {
            System.out.println("Natural!!! The game is over with a win");
        }
        else
        {
            points = diceSum;
            System.out.println("Points: " + points);

            //Keep rolling until they either throw a 7 in which case they loose or they make the point sum in which case they win.
            while (true) {

                diceSum = diceRoll();
                System.out.println("Sum of dice: " + diceSum);

                if (diceSum == points)
                {
                    System.out.println("Natural! Game is over with a win");
                    break;
                }
                else if (diceSum == 7)
                {
                    System.out.println("Craps! Game is over with a loss");
                    break;
                }


            }
        }

        //Prompt the user to play again
        System.out.print("Do you want to play again? [Press Y/N]: ");
        char user_input = new Scanner(System.in).next().charAt(0);

        if (user_input == 'Y' || user_input == 'y')
        {
            main(null);
        }
    }

    public static int diceRoll() {
        Random rnd = new Random();
        int die1 = rnd.nextInt(6) + 1;
        int die2 = rnd.nextInt(6) + 1;
        System.out.println("Die 1: " + die1 + "\tDie 2: " + die2);
        return die1 + die2;

    }
}