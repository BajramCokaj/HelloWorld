import java.util.Random;
import java.util.Scanner;

public class GuessingGame {

    public static void main(String[] args) {
        // Generate a random number between 1 and 100
        Random random = new Random();
        int secretNumber = random.nextInt(100) + 1;

        // Initialize variables
        int guess;
        int attempts = 0;

        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Guessing Game!");
        System.out.println("Try to guess the number between 1 and 100.");

        do {
            // Prompt the user for a guess
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();

            // Increment the number of attempts
            attempts++;

            // Check if the guess is correct
            if (guess == secretNumber) {
                System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
            } else if (guess < secretNumber) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Too high! Try again.");
            }

        } while (guess != secretNumber);

        // Close the scanner
        scanner.close();
    }
}
