## Tictactoe

A simple command-line Tic-Tac-Toe game implemented in Java.

## Features

- 3x3 game board for classic Tic-Tac-Toe gameplay
- Two players can choose their identifiers (`x` or `o`)
- Input validation for player identifiers and move coordinates
- Unlimited games with option to replay after each match
- Displays the game board after each move

## How to Run

1. Compile the Java files:
	```sh
	javac Tictactoe.java Ttest.java
	```

2. Run the main program:
	```sh
	java Ttest
	```

## Gameplay

- Player 1 chooses their identifier (`x` or `o`)
- Players take turns entering their moves as coordinates (1-3 for both X and Y)
- The game checks for a win after each move and announces the winner
- After a game ends, players can choose to play again or exit

## Files

- [`Tictactoe.java`](Tictactoe.java): Implements the game logic and board display
- [`Ttest.java`](Ttest.java): Main entry point, handles user interaction and game loop

## Example

```
Player 1 choose your identifier, either x or o(not zero): x

|   |   |   | 
|   |   |   | 
|   |   |   | 

Enter your moves, for example: 1 2
Enter your moves: 1 2
...
```

Enjoy the game!

## License

This project is for educational/demo purposes.