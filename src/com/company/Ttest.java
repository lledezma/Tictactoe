package com.company;
import java.util.*;

public class Ttest
{
    public static void main(String[] args)
    {
        char Player;                            // player indetifiers
        int X = 1;                           //X example coordinate
        int Y = 2;                           //Y example coordinate
        char [][]GameBoard = new char[3][3];    // Gameboard
        Scanner scan = new Scanner(System.in);
        int a;                                  // game continuity verifier
        System.out.println("This is a Tictactoe game just like a classic tictactoe game. With a 3x3 gameboard. \n"
                + "You can only choose between x and o as an identifier. \n"
                + "if you choose anything but that, you will be asked to enter x or o again. \n"
                + "Give coordinates 1,2, or 3, but not greater than 3, for x y, similiar to a point in a X and Y graph. \n"
                + "enjoy the game.");
        System.out.println();
        // prints identifier
        do
        {
            System.out.print("Player 1 choose your identifier, either x or o(not zero): ");
            Player = scan.next().charAt(0);
        }while(Player != 'x' && Player != 'o');

        // prints example board
        for(int i = 0; i < 3; i++)
        {
            System.out.println();
            for(int j = 0; j < 3; j++)
            {
                if(j == 0)
                    System.out.print("| ");
                System.out.print(GameBoard[i][j] + " | ");
            }
        }
        System.out.println();
        Tictactoe TicTacToe = new Tictactoe(Player);                                        // Tictactoe game
        System.out.println("Enter your moves, for example: " + X + " " + Y);               //gives example moves
        TicTacToe.game();
        // verifies if players want game to continue
        do
        {
            System.out.print("If you want to play again just type 1, if no just type any other number. ");
            a = scan.nextInt();
            if(a == 1){
                System.out.println("Player that lost starts the game.");
                TicTacToe.game();}
            else
                System.out.println("Goodbye");

        }while(1 == a);
    }
}