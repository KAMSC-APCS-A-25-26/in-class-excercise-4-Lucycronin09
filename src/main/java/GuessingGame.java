import java.util.Scanner;
import java.util.Random;


public class GuessingGame {
    public static void main(String[] args)
    {
        // TODO: Prompt the user with a welcome message
        System.out.println("Welcome to the Guessing Game!");
        System.out.println("I'm thinking of a number between 1 and 100. ");


        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        // TODO: Generate a random secret number between 1 and 100 (inclusive)
        int secretNum = rand.nextInt(100) + 1;

        // TODO: Use a do...while loop to read guesses until correct
        boolean status = true;
        while(status)
        {
            System.out.print("Enter your guess: ");
            int guess = sc.nextInt();
            if(guess == secretNum)
            {
                System.out.println("You got it!");
                status = false;
            }
            else if(guess > secretNum)
            {
                System.out.println("Too high! Try again.");
            }

            else if(guess < secretNum)
            {
                System.out.println("Too low! Try again.");
            }
        }
        // TODO: Print "Too low" / "Too high" / "You got it!" accordingly
        // TODO: Use Scanner for input
    }
}
