import java.util.Scanner;
public class Ass01_RockPaperScissors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String playerAChoice, playerBChoice, playAgain;
        do {
            do {
                System.out.print("Player A - Enter your move (R, P, S): ");
                playerAChoice = input.next().toUpperCase();
            } while (!playerAChoice.equals("R") && !playerAChoice.equals("P") && !playerAChoice.equals("S"));
            do {
                System.out.print("Player B - Enter your move (R, P, S): ");
                playerBChoice = input.next().toUpperCase();
            } while (!playerBChoice.equals("R") && !playerBChoice.equals("P") && !playerBChoice.equals("S"));
            if (playerAChoice.equals(playerBChoice)) {
                System.out.println(playerAChoice + " vs " + playerBChoice + " it’s a Tie!");
            } else if ((playerAChoice.equals("R") && playerBChoice.equals("S")) || (playerAChoice.equals("S") && playerBChoice.equals("P")) || (playerAChoice.equals("P") && playerBChoice.equals("R"))) {
                System.out.println(getResultPhrase(playerAChoice, playerBChoice) + " - Player A wins!");
            } else {
                System.out.println(getResultPhrase(playerBChoice, playerAChoice) + " - Player B wins!");
            }
            System.out.print("Do you want to play again? [Y/N]: ");
            playAgain = input.next().toUpperCase();
        } while (playAgain.equals("Y"));
        System.out.println("Thanks for playing!");
    }
    public static String getResultPhrase(String winnerMove, String loserMove) {
        if (winnerMove.equals("R") && loserMove.equals("S")) {
            return "Rock breaks Scissors";
        } else if (winnerMove.equals("S") && loserMove.equals("P")) {
            return "Scissors cuts Paper";
        } else {
            return "Paper covers Rock";
        }
    }
}
