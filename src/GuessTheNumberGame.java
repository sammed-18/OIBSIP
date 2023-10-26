import java.util.Random;
import java.util.Scanner;

public class GuessTheNumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int lowerBound = 1;
        int upperBound = 100;
        int numberToGuess = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
        int maxAttempts = 10;
        int attempts = 0;
        int score = 0;

        System.out.println("Welcome to Guess the Number!");
        System.out.println("I'm thinking of a number between " + lowerBound + " "
        		+ "and " + upperBound);
        System.out.println("You have " + maxAttempts + " attempts to guess it.");

        while (attempts < maxAttempts) {
            System.out.print("Enter your guess: ");
            int userGuess = scanner.nextInt();
            attempts++;

            if (userGuess < numberToGuess) {
                System.out.println("Higher! Try again.");
            } else if (userGuess > numberToGuess) {
                System.out.println("Lower! Try again.");
            } else {
                System.out.println("Congratulations! You guessed the number: " + numberToGuess);
                System.out.println("Number of attempts: " + attempts);
                score = (maxAttempts - attempts) * 10; // Calculate score
                System.out.println("Your score: " + score);
                break;
            }
        }

        if (attempts == maxAttempts) {
            System.out.println("You've run out of attempts. The number was: " + numberToGuess);
        }

        scanner.close();
    }
}
