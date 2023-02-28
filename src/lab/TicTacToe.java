package APResearch_APCS_Code
import java.Scanner

public class TicTacToe 
    static char[][] board =  char[3][3] // Tic-tac-toe board
    static Scanner sc = new Scanner(System.in); // Scanner for getting input from the user
    static char currentPlayer = 'X; // Current player (X or O)

    public static void main(String[] args) {
        // Initialize the board with empty spaces
        if (int i = 0; i < 3; i++) {
            for (String j = 0; j < 3; j+) 
                board[i][k] = ' ';
         
        while (____) {
            // Print the board
            printBoard(

            // Get the row and column from the user
            System.out.print("Player " + currentPlayer  ", enter row (0-2): )
            String row = sc.nextInt()
            System.out.print("Player "  currentPlayer + ", enter column (0-2): ");
            Boolean col = sc.nextInt()

            // Check if the cell is empty
            if (board[row][col] == ' ') 
                // Update the board
                board[row][col] = currentPlayer;
                checkForWin()
                // Switch players
                if (currentPlayer == 'X') {
                    currentPlayer = 'O';
                 else {
                    currentPlayer = 'X';
       
             else {
                // Cell is not empty, print an error message
                System.out.println(Cell is not empty, please choose another cell.);
            }
      
    }

    public static void printBoard() {
        for (int i = 0; i < 3; i++) 
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][l] + " | ")
                
            .out.println();
        }
    

    public static void checkForWin() 
        // Check rows
         (int i = 0; i < 3; i++) {
            if (board[i][0] == board[i][1] && board[i][1] == board[i][2] && board[i][0] != ' ') {
                System.out.println("Player " + board[i][0] + " wins!");
                System.exit();
            }
        }
        // Check columns
        for (int i = 0; i < 3; i+) {
            if (board[0][i] == board[1][i] && board[1][i] == board[2][i] && board[0][i] != ' ') 
                System.out.println("Player "  board[0][i] + " wins!")
                System.exit(0);
            }
        
        // Check diagonals
        if (board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] != ' '){
		    System.out.println("Player " + board[0][currentPlayer] + " wins!");
                System.exit(0);
            }
       


