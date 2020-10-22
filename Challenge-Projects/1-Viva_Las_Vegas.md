# Challenge Project - Viva Las Vegas

<img src="https://upload.wikimedia.org/wikipedia/en/c/c3/Viva_Las_Vegas_1964_Poster.jpg" width="30%" />

*Oh, there's blackjack, poker, and the roulette wheel  
  A fortune won and lost on every deal  
  All you need's a strong heart and a nerve of steel  
  Viva Las Vegas*

## Due December 11 (one week before the end of classes)

## Description

In this project, you'll implement a full-fledged text-based casino program that allows the user to select from and play different games of chance.

This project will tie together all of the Java features that we've used in the first part of the class, including variables, input, random numbers, conditional statements, methods, and loops.

Your program will support four games.

### Red Queen

A version of the classic "Three Card Monty" hustle. There are three cards: a red queen and two black jacks. The player picks one card and wins if it's the queen. I've implemented this game for you to illustrate the flow of the casino program.

The playRedQueen method prompts the user to pick a number 1-3, representing one of the three face-down cards. It then generates a random number 1-3. The player wins if the chosen number matches the random number and loses otherwise.

### Roulette

Played on a small wheel with numbers 0-12. There are four possible bets:

1. Even
2. Odd
3. Number in 1-6. including both
4. Number in 7-12 including both

Your method should read the number of the user's bet, then generate a random spin in [0, 12]. If the outcome of the spin matches the player's bet, the player wins. All bets lose on a spin of zero.

### Slots

Generate three numbers in [0, 9], inclusive. The player wins if any two of the three match.

Slots uses a `while` loop to let the player keep spinning as long as he or she wants. At the end of the loop, ask if the player wants to continue and stop the loop when the player answers no.

### Sic Bo

Sic bo ("dice pair") is a dice game of Chinese origin, now available in many American casinos that cater to Asian gamers. The game is similar to craps: players roll three dice and bet on the outcome.

There are a wide variety of possible bets, but the two most common wagers in sic bo are "big" and "small".

- The big bet wins if the sum of the three dice is 11 to 17 (including both), but not three-of-a-kind
- The small bet wins if the sum of the three dice is 4 to 10 (including both), but not three-of-a-kind

Tip: both bets lose if the result is a triple, so you can test for that first, then move on to the test the sum if the result is not a triple. To test for a triple, you need the logical and of three comparisons

```
die1 == die2 && die2 == die3 && die1 == die3
```

### Hazard

Hazard is an old dice game that is the predecessor of craps.

In our version, the player rolls two dice and bets on one of two outcomes:

1. A roll of 7 or 11 will appear first.
2. A roll of 2, 3, or 12 will appear first.

If the roll is any number other than 7, 11, 2, 3, or 12, the game uses a loop to generate more rolls.


### Tips

- Start early! Don't wait until the last minute. Let me know if you have questions or are unclear on what a game is asking you to do.

- Read the descriptions and the comments carefully. Use the comments as a guide: fill in each step of the program below the comments decribing that step.

- You must use the Random object named rng to generate your random vaues. Don't use Math.random() or your programs' output won't match what the tests expect.

- Write headers for the methods that don't have them.



## Starter Code

```
/**
 * Viva Las Vegas
 * 
 * @author CMS 121
 */
 
import java.util.Scanner;
import java.util.Random;

public class Casino {
    
    /**
     * Global random number generator -- use rng for all random values
     */
    public static Random rng = new Random(0);  // DON'T EDIT THIS LINE
    
    
    /**
     * Global Scanner -- use input for all Scanner operations
     * The Mimir test code works best with a static Scanner
     */
    public static Scanner input = new Scanner(System.in);
    
    
    /**
     * Read and return an integer from the terminal
     * 
     * @return  the input integer
     */
    public static int readInt() {
        return input.nextInt();
    }
    
    
    /**
     * Read a line from the terminal
     * 
     * @return  the input line
     */
    public static String readLine() {
        return input.nextLine();
    }
    
    
    /**
     * Red Queen: pick one of three cards and win with probability 1 / 3
     */
    public static void playRedQueen() {
        System.out.println("\nWelcome to Red Queen.");
        System.out.println("Pick one of my three cards. If it's the Red Queen, you win.");
        System.out.println("Pick a card 1-3.");
        
        // Read the player's choice
        int playerCard = readInt();
        
        if (playerCard < 1 || playerCard > 3) {
            System.out.println("That is not a valid card.");
            return;
        }
        
        // Use the random number generator to draw a number in [1, 3]
        int winningCard = rng.nextInt(3) + 1;
        
        // Check the winning condition
        // Return true or false based on the outcome
        if (playerCard == winningCard) {
            System.out.println("That's the Red Queen!");
        } else {
            System.out.println("Sorry, that's a Black Jack.");
        }
    }
    
    
    public static void playRoulette() {
        System.out.println("\nWelcome to Roulette.");
        System.out.println("1. Even");
        System.out.println("2. Odd");
        System.out.println("3. 1 to 6");
        System.out.println("4. 7 to 12");
        System.out.println("Choose your bet.");
        
        // Read the user's bet using the readInt() method

        // If the bet is not valid, print an error message and return
        
        // Generate a random integer value in [0, 12]

        // Print the result of the spin

        // If the spin is zero, lose immediately
        
        // Else if the spin is nonzero, test for winning combinations
        
        // Else, the player must have lost
        
    }
    
    
    public static void playSlotMachine() {
        System.out.println("\nWelcome to the Slot Machine.");
        
        boolean playing = true;
        
        while (playing) {
            // Generate three random values in [0, 9]
            int spin1 = rng.nextInt(10);
        
            // Print the three random spins

            // If two of the three spins match, print winning message
            
            // Else, print losing message
            
            // Ask if the user would like to play again
            System.out.println("Would you like to spin again?");
            System.out.println("1. Yes");
            System.out.println("2. No");
            
            // Read the response using the readInt method

            // If the response is 2, set playing = false to end the loop

        }
        
    }
    
    
    public static void playSicBo() {
        System.out.println("\nWelcome to Sic Bo.");
        System.out.println("1. Big");
        System.out.println("2. Little");
        System.out.println("What is your bet?");
    
        // Read the player's bet
        int bet = readInt();
        
        // Simulate three rolls
        
        // Check if the three dice are a triple
        // If so, print a losing message and return
        
        // If the sum is big and the player's bet is 1, print winner
        
        // Else if the sum is little and the player's bet is 2, print winner
        
        // Else, print losing message
    }
    
    
    public static void playHazard() {
        
        System.out.println("\nWelcome to Hazard.");
        System.out.println("1. 7 or 11");
        System.out.println("2. 2, 3, or 12");
        System.out.println("Which group of numbers will come up first?");
        
        // Read the bet using readInt

        boolean looping = true;
        
        while (looping) {
          
            // Prompt the user to press ENTER and wait for a response
            System.out.println("\nPress ENTER to roll the dice.");
            readLine();
            
            // Generate the random sum of two dice
            
            // Print the two dice and the sum

            // Check the four win/loss combinations:
            // 1. sum is 7 or 11, player bet 1 --> win
            // 2. sum is 7 or 11, player bet 2 --> lose
            // 3. sum is 2, 3, or 12, player bet 1 --> lose
            // 4. sum is 2, 3, or 12, player bet 2 --> win
            
            // If any win or loss combination occurs, set looping = false

        }
    } 
    
    
    public static void printWelcomeMessage() {
        System.out.println("Welcome to the Casino Royale.");
        System.out.println("1. Red Queen");
        
        // Fill in print statements for the other games
        
        System.out.println("Which game would you like to play?");
    }
    
    
    /**
     * Main
     */
    public static void main(String[] args) {

        // Print the welcome message and game list
        printWelcomeMessage();
        
        // Read the user's game choice
        int choice = readInt();
        
        // Select the game based on the choice
        if (choice == 1) {
            playRedQueen();
        } 
        
        // Add more cases to play the other games
        
        else if (choice > 4) {
            System.out.println("That's not a game we play here, Mr. Presley.");
        }
        
        System.out.println("\nThank you for playing.");   
    }
    
}
```
