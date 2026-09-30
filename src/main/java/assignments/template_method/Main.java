package assignments.template_method;
import java.util.Scanner;
public class Main extends Game {
    private int numberOfPlayers;
    private int player1Choice;
    private int player2Choice;
    private int player1Wins;
    private int player2Wins;
    private Scanner sc = new Scanner(System.in);

    @Override public void initializeGame(int numberOfPlayers) {
        this.numberOfPlayers = numberOfPlayers;
        player1Wins = 0;
        player2Wins = 0;

        System.out.println("Rock Paper Scissors!");
        System.out.println("First player to get 3 wins wins the game.");
    }

    @Override public boolean endOfGame() {
        return player1Wins >= 3 || player2Wins >= 3;
    }

    @Override public void playSingleTurn(int player) {
        if (player == 0) {
            System.out.print( "Player 1, choose 1=Rock, 2=Paper, 3=Scissors: " );
            player1Choice = sc.nextInt();
            while (player1Choice < 1 || player1Choice > 3) {
                System.out.print("Please choose 1, 2 or 3: ");
                player1Choice = sc.nextInt();
            }
        } else {
            System.out.print( "Player 2, choose 1=Rock, 2=Paper, 3=Scissors: " );
            player2Choice = sc.nextInt();
            while (player2Choice < 1 || player2Choice > 3) {
                System.out.print("Please choose 1, 2 or 3: ");
                player2Choice = sc.nextInt();
            }
            if (player1Choice == player2Choice) {
                System.out.println("This round was a tie!");
            } else if (
                    (player1Choice == 1 && player2Choice == 3) || (player1Choice == 2 && player2Choice == 1) || (player1Choice == 3 && player2Choice == 2)
            ) {
                player1Wins++;
                System.out.println( "Player 1 wins this round! Score: " + player1Wins + "-" + player2Wins );
            } else { player2Wins++; System.out.println( "Player 2 wins this round! Score: " + player1Wins + "-" + player2Wins );
            }
        }
    }

    @Override public void displayWinner() {
        if (player1Wins >= 3) {
            System.out.println("Player 1 wins the game!");
        } else { System.out.println("Player 2 wins the game!");
        }
    }

    public static void main(String[] args) {
        Main game = new Main();
        game.play(2);
    }
}