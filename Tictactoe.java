import java.util.*;

public class Tictactoe
{
    protected int X,Y;                                   //Player X and Y moves
    protected char [][]GameBoard = new char[3][3];      //Gameboard
    protected Scanner scan = new Scanner(System.in);
    protected char Player1;                             //player identifiers

    public Tictactoe(char P1move)                         // constructor
    {
        Player1 = P1move;
    }
    public char getPlayer1()                           //returns player1 identifier
    {
        return Player1;
    }
    public void game()                                 // Game
    { 
        boolean gameplay = true;

        for(int i = 0; i < 3; i++)                     //board
        {
            for(int j = 0; j < 3; j++)
                GameBoard[i][j] = ' ';
        }
        while(gameplay)                               //game process
        {
            moves();                                    //players moves
            Board();
            if(Player1 == 'x')
                Player1 = 'o';
            else
                Player1 = 'x';
            // checks win
            if(GameBoard[0][X] == GameBoard[1][X]
                    && GameBoard[0][X] == GameBoard[2][X])
                gameplay = false;
            if(GameBoard[Y][0] == GameBoard[Y][1]
                    && GameBoard[Y][0] == GameBoard[Y][2])
                gameplay = false;
            if (GameBoard[0][0] == GameBoard[1][1] && GameBoard[0][0] == GameBoard[2][2]
                    && GameBoard[1][1] != ' ')
                gameplay = false;
            if(GameBoard[0][2] == GameBoard[1][1] && GameBoard[0][2] == GameBoard[2][0]
                    && GameBoard[1][1] != ' ')
                gameplay = false;
            //if either player gets a mark in all four corners of the board, that player wins.
            if((GameBoard[0][0] == GameBoard[0][2] && GameBoard[0][0] == GameBoard[2][2]
                    && GameBoard[0][0] == GameBoard[2][0])
                    &&   (((GameBoard[0][X] == 'o') || (GameBoard[0][X] == 'x'))&&
                    ((GameBoard[2][X] == 'x') || (GameBoard[2][X] == 'o'))&&
                    ((GameBoard[Y][0] == 'x') || (GameBoard[Y][0] == 'o'))&&
                    ((GameBoard[Y][2] == 'x') || (GameBoard[Y][2] == 'o'))))
                gameplay = false;
            if(gameplay == true)
                System.out.print("Next player, ");
            else if(gameplay == false && Player1 == 'o')
                System.out.println("Player x wins!");
            else if(gameplay == false && Player1 == 'x')
                System.out.println("Player o wins!");
        }
    }
    public void moves()                          //players' moves
    {
        do{
            System.out.print("Enter your moves: ");
            X = scan.nextInt() -1;              // x coordinate
            Y = scan.nextInt() -1;              // y coordinate
        }while((X != 0 && X != 1 && X != 2) || (Y != 0 && Y != 1 && Y != 2));   // verifies if moves are valid
        GameBoard[Y][X] = Player1;        // alocates identifier in array cordinate
    }

    public void Board()                     // prints 3x3 tictactoe board
    {
        for(int i = 0; i < 3; i++) {
            System.out.println();
            for(int j = 0; j < 3; j++) {
                if(j == 0)
                    System.out.print("| ");
                System.out.print(GameBoard[i][j] + " | ");
            }
        }
        System.out.println();
    }
}
