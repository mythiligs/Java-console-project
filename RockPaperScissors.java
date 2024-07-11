import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int userScore = 0;
        int computerScore = 0;
        while (true) {
            System.out.println("Enter your choice (rock/paper/scissors): ");
            String userChoice = scanner.next();
            String computerChoice = getComputerChoice(random);
            System.out.println("Computer choice: " + computerChoice);
            if (userChoice.equals(computerChoice)) {
                System.out.println("It's a tie!");
            } else if ((userChoice.equals("rock") && computerChoice.equals("scissors")) ||
                    (userChoice.equals("paper") && computerChoice.equals("rock")) ||
                    (userChoice.equals("scissors") && computerChoice.equals("paper"))) {
                System.out.println("You win this round!");
                userScore++;
            } else {
                System.out.println("Computer wins this round!");
                computerScore++;
            }
            System.out.println("Score: You - " + userScore + ", Computer - " + computerScore);
            System.out.println("Do you want to play again? (yes/no): ");
            String playAgain = scanner.next();
            if (playAgain.equals("no")) {
                break;
            }
        }
    }

    private static String getComputerChoice(Random random) {
        int choice = random.nextInt(3);
        switch (choice) {
            case 0:
                return "rock";
            case 1:
                return "paper";
            default:
                return "scissors";
        }
    }
}
