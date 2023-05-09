import java.util.Scanner;

public class TicTacToeUI {
    public static void main(String[] args) {
        boolean flag = true;

        TicTacToe game = new TicTacToe();

        game.reset();

        Scanner s = new Scanner(System.in);

        System.out.println("Welcome to Tic-Tac-Toe!");

        System.out.println(" ");

        while (flag) {
            //Write a while loop that runs until there is a
            //winner or the game board is full.
            while ( !(game.isFull() || game.isWinner()) ) {


                //Print out the game board
                System.out.println(game);

                //Print out whose turn it is and tell them to select a space.
                System.out.println(game.getTurn() + ", select a space.");

                //Write a while loop that runs until the playSpace method returns true
                //when provided the space the player wants to play
                while ( !game.playSpace(s.nextLine()) ) {

                    //Print out Please select a valid space.
                    System.out.println("Please select a valid space");

                    //Print out the game board.
                    System.out.println(game);

                    //Close the while loop for the playSpace check.
                }

                //Close the while loop that runs until there is a winner/full board.
            }

            //Check to see if there is no winner.
            System.out.println( game.isWinner() );

            //If there is not a winner, then the board is full and there is a tie,
            //so print out Aww, there is a tie.
            if (game.isFull()) {


                //Otherwise there was a winner.
                System.out.println("Aww, it was a tie.");
            }
            else {

                //Print out the game board.
                System.out.println(game);

                //Print out Congrats <player>, You are the winner!
                System.out.println("Congrats player " + game.getTurn() + " You are the winner!");

                //Close the conditional.
            }

            //Print out Play Again? (Y)es or (N)o
            System.out.println("Play Again? Y or N");

            //check their input is not yes regardless of case. If they do
            //not type yes, exit the program by changing flag;
            //otherwise reset the game so that it can be played again.
            if (s.nextLine().equalsIgnoreCase("n")){
                flag = false;
            }
            else {
                game.reset();
            }

        }

    }
}