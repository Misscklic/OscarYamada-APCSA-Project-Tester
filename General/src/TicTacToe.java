public class TicTacToe
{

//fields

    /**2D array of Strings to hold the tic-tac-toe spaces called spaces */
    private String[][] spaces;

    /**String to hold whose turn it currently is called turn */
    private String turn;

//constructor

    /** Constructor to create a game of Tic-Tac-Toe.
     *  instantiates the array, resets the game, and sets
     *  the turn to player X.
     */
    public TicTacToe(){spaces = new String[3][3]; turn = "x";}

//methods

    /** Resets the game board. Sets the value of each space on
     *  the board to be a number, as a String, 1 - 9.
     */
    public void reset()
    {
        for (int row = 0; row < spaces.length; row++) {
            for (int col = 0; col < spaces[row].length; col++) {
                spaces[col][row] = String.valueOf( ( row + 1 ) + ( 3 * col ) );
            }
        }
    }

    /** Method to take a players turn in the game. Goes
     *  through the array and checks to see if a space
     *  is equal to the number the player is trying to play.
     *  If so, it sets the space to be the symbol of the
     *  current player, changes the turn to the other player,
     *  and returns true. If not, the method returns false.
     *  @param space the space that the player is trying to play.
     *  @return true if the space was played successfully and false
     *          otherwise.
     */
    public boolean playSpace(String space) {
        for (int row = 0; row < spaces.length; row++) {
            for (int col = 0; col < spaces[row].length; col++) {
                if (space.equals(spaces[col][row])){
                    spaces[col][row] = turn;
                    toggleTurn();
                    return true;
                }
            }
        }
        return false;
    }


    /** Checks to see if there is a winner of the game.
     *  @return true if someone has won and false otherwise.
     */
    public boolean isWinner()
    {
        //Check top horizontal.
        return spaces[0][0].equals(spaces[1][0]) && spaces[1][0].equals(spaces[2][0])
                //Check left vertical
                || spaces[0][0].equals(spaces[0][1]) && spaces[0][1].equals(spaces[0][2])
                //Check diagonal top left to bottom right.
                || spaces[0][0].equals(spaces[1][1]) && spaces[1][1].equals(spaces[2][2])
                //Check right vertical.
                || spaces[2][0].equals(spaces[2][1]) && spaces[2][1].equals(spaces[2][2])
                //Check middle horizontal.
                || spaces[0][1].equals(spaces[1][1]) && spaces[1][1].equals(spaces[2][1])
                //Check middle vertical.
                || spaces[1][0].equals(spaces[1][1]) && spaces[1][1].equals(spaces[1][2])
                //Check diagonal bottom left to top right.
                || spaces[2][0].equals(spaces[1][1]) && spaces[1][1].equals(spaces[0][2])
                //Check bottom horizontal.
                || spaces[0][2].equals(spaces[1][2]) && spaces[1][2].equals(spaces[2][2]);
    }

    /** Changes the players turn to O if X just played and
     *  X if O just played.
     */
    public void toggleTurn()
    {
        if (turn.equals("x")){
            turn = "o";
        }
        else if (turn.equals("o")){
            turn = "x";
        }
    }

    //Finish the toString method by completing the tasks asked of you
    //in the comments. Complete these tasks directly after the comment.
    //Do not delete any present code.

    /** returns a String representation of the current
     *  game board.
     *  @return the current game board as a String.
     */
    public String toString()
    {
        String s;
        s = "-------------\n";
        //Write a loop to go through the rows in the array.
        for (String[] space : spaces) {

            s = s + "|";

            //Write a loop to go through the columns in the array.

            for (String value : space) {

                //replace the comment below with the variable of the current array space
                s = s + " " + value + " |";

                //Close the inner loop.
            }
            s = s + "\n";
            s = s + "-------------\n";

            //Close the outer loop.
        }
        return s;
    }

    /** Returns X if it is currently X's turn and
     *  O if it is currently O's turn.
     *  @return whose turn it is.
     *
     */
    public String getTurn()
    {
        return turn;
    }

    /** Checks to see if every space on the board has been played.
     *  @return true if every space has been played and false otherwise.
     */
    public boolean isFull()
    {
        for (String[] space : spaces) {
            for (String value : space) {
                if (!(value.equals("x") || value.equals("o"))){
                    return false;
                }
            }
        }
        return true;
    }
}
