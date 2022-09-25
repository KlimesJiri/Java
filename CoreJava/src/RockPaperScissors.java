import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {

        String[] rps = {"r", "p", "s"};
        String computerMove = rps[new Random().nextInt(rps.length)];

        Scanner scanner = new Scanner(System.in);
        String playerMove;

        while(true){
            while (true){
                System.out.println("Please enter your move (r, p, s)");
                playerMove = scanner.nextLine();
                if (playerMove.equals("r")||playerMove.equals("p")||playerMove.equals("s")){
                    break;
                }
                System.out.println("This is not a valid move");
            }

            System.out.println("The computer played: " + computerMove);

            if (playerMove.equals(computerMove)){
                System.out.println("The game was a tie!");
            }
            else if (playerMove.equals("r")){
                if (computerMove.equals("p")){
                    System.out.println("You lose!");
                } else if (computerMove.equals("s")){
                    System.out.println("You win!");
                }
            }
            else if (playerMove.equals("p")){
                if (computerMove.equals("s")){
                    System.out.println("You lose!");
                } else if (computerMove.equals("r")){
                    System.out.println("You win!");
                }
            }
            else if (playerMove.equals("s")){
                if (computerMove.equals("r")){
                    System.out.println("You lose!");
                } else if (computerMove.equals("p")){
                    System.out.println("You win!");
                }
            }

            String playAgain;

            while (true){
                System.out.println("Play again? (y/n)");
                playAgain = scanner.nextLine();
                if (playAgain.equals("y")||playAgain.equals("n")){
                    break;
                }
                System.out.println("This is not a valid move");
            }

            if (playAgain.equals("n")){
                System.out.println("Thank your for playing our Rock - Paper - Scissors game.");
                break;
            }
        }
    }
}
