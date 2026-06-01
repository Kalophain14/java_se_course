import java.util.Random;
import java.util.Scanner;

public class RockPaperSissor {
    public static  void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        //Declar Variable
        String [] choices = {"rock", "paper", "scissors"};
        String playerChoice;
        String computerChoice;
        String playAgain = "Yes";

        //Get user input
        System.out.print("Enter your move (rock, paper, scissors: ");
        playerChoice = sc.nextLine().toLowerCase();

        if(!playerChoice.equals("rock") &&
                !playerChoice.equals("paper") &&
                !playerChoice.equals("scissors")){
            System.out.println("Invalid input");
        }

        //Get random choice from computer
        computerChoice = choices[rand.nextInt(choices.length)];
        System.out.println("Computer choice: "+ computerChoice);
        
        //Check win conditions
        if (playerChoice.equals(computerChoice))
        {
            System.out.println("Its a tie");
        }
        else if(playerChoice.equals("rock") && computerChoice.equals("scissors") ||
                (playerChoice.equals("paper") && computerChoice.equals("rock")) ||
                (playerChoice.equals("scissors") && computerChoice.equals("paper")))
        {
            System.out.println("You win");
        }
        else
        {
            System.out.println("You lose");
        }

        //Ask to play again?

        //Goodbye Message

        sc.close();
    }
}