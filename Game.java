import java.util.Random;
import java.util.Scanner;

public class Game {
    private static final int MIN_RANGE = 1;
    private static final int MAX_RANGE = 100;

    private final Scanner scanner;
    private final Random random;

    public Game(Scanner scanner) {
        this.scanner = scanner;
        this.random = new Random();
    }

    // Plays one round and returns points earned (0 if not guessed)
    public int playRound(int roundNumber) {
        int target = random.nextInt(MAX_RANGE - MIN_RANGE + 1) + MIN_RANGE;
        int attempts = 0;
        boolean guessedCorrectly = false;

        System.out.println("\n--- Round " + roundNumber + " ---");
        System.out.println("Guess a number between " + MIN_RANGE + " and " + MAX_RANGE + ".");

        while (!guessedCorrectly) {
            System.out.print("Your guess: ");
            int guess = readValidInt();
            attempts++;

            if (guess < target) {
                System.out.println("Too low.");
            } else if (guess > target) {
                System.out.println("Too high.");
            } else {
                guessedCorrectly = true;
                System.out.println("Correct! You guessed it in " + attempts + " attempt(s).");
            }
        }

        return calculatePoints(attempts);
    }

    private int readValidInt() {
        while (!scanner.hasNextInt()) {
            System.out.print("Please enter a valid number: ");
            scanner.next();
        }
        return scanner.nextInt();
    }

    // Fewer attempts earn more points
    private int calculatePoints(int attempts) {
        int points = 100 - (attempts - 1) * 10;
        return Math.max(points, 10);
    }
}
