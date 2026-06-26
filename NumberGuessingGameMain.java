import java.util.Scanner;

public class NumberGuessingGameMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Game game = new Game(scanner);

        int totalScore = 0;
        int roundNumber = 1;
        boolean playAgain = true;

        System.out.println("=== Number Guessing Game ===");

        while (playAgain) {
            int pointsEarned = game.playRound(roundNumber);
            totalScore += pointsEarned;
            System.out.println("Points earned this round: " + pointsEarned);
            System.out.println("Total score: " + totalScore);

            System.out.print("\nPlay another round? (y/n): ");
            String choice = scanner.next();
            playAgain = choice.equalsIgnoreCase("y");
            roundNumber++;
        }

        System.out.println("\n=== Game Over ===");
        System.out.println("Final Score: " + totalScore);

        scanner.close();
    }
}
