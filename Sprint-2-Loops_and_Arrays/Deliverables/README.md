# Sprint 2 &ndash; Deliverables


## I Would Like to Say a Few Words

Write a program that uses a loop to prompt the user to enter a `String`. Keep prompting until the user types one of the following words:

```
nitwit
blubber
oddment
tweak
```

Tip:

- Use a `Scanner` with the `next` method to read a `String` input from the terminal.

- Use the `equals()` method to check if the input string is equal to one of the test words. **You can't compare strings using `==`**.


## If They're the Super Mario Brothers, Does That Mean His Name is Mario Mario?

At the end of each level in the original *Super Mario Bros.*, Mario jumps up a stair like the following:

```
     ##
    ###
   ####
  #####
 ######
#######
```

Write a set of loops that print Mario-style stairs of arbitrary height. Prompt the user to input the height of the staircase

Tips: 

- The first line has `height - 1` spaces and 2 blocks. The second line has `height - 2` spaces and 3 blocks.

- Use a `Scanner` with the `nextInt()` method to read the height of the staircase. You can assume the user inputs a valid number.



## Subtraction Game

Here's a mathematical strategy game.

Beginning with a pile of 21 stones, players alternate removing stones until none are left. On her turn, a player may take 1, 2,
or 3 stones. The player who takes the last stone is the winner.

This game is known by a few different names, inluding the Subtraction Game and Nim. 
A version was played on an episode of *Survivor*, where they called it Thai 21.

There are lots of variations:

- Changing the number of stones or the numbers that may be removed on each turn.
- Using multiple piles of stones. In classic Nim, a player may take as many stones as he wants, but from only one pile at a time.
- Playing a *misère* game (French for "destitution"), where the player who takes the last stone *loses*.

Write a program that implements the Thai 21 version of the Subtraction Game. Use the skeleton below to get started.

This program shows a useful strategy for game programs.

- You might think that the best way to handle a two-player game is to put both player's turns inside the the loop: on each iteration,
have player 1 make a move, then have player 2 make a move.

- This works, but it makes ending the loop tricky, because you don't want to do player 2's turn if player 1 wins.

- Here, we're going to use the loop to play just one turn. A variable keeps track of which player's turn it is.

- If the current player *doesn't* win, switch to the other player for the next pass through the loop.

```
/**
 * Subtraction Game
 *
 * @author CMS 167
 */

import java.util.Scanner;

public class SubtractionGame {
    
    
    /**
     * Main
     */
    public static void main(String[] args) {
    
        boolean playing = true;  // Guard variable
        int stones = 21;
        int player = 1;
        
        // Initialize a Scanner to read from the terminal
        
        while (playing) {
        
            System.out.println();
            System.out.println("Stones: " + stones):
            System.out.println("It's your turn, Player " + player + ".";
            System.out.println("Take 1, 2, or 3 stones from the pile.");
            
            // Use nextInt() to get the player's move
            
            // Reduce the number of stones
            
            // Check the winning condition
            // If there are 0 stones, print a winning message and set playing = false;
            
            // else, switch to the other player
        
        }
        
    }

}
```

## Nim

Let's upgrade the basic subtraction game to a full game of Nim.

- There are a number of piles of stones.

- On her turn, a player may remove **any number of stones** from **any single pile**.

- The player who takes the last stone is the **winner**.

Write a program called `Nim.java` that allows two players to play Nim against each other. Use the template below as a starting point.

- At the beginning of the game, prompt the user to enter a number of piles.

- Use an array to represent the piles. Put 20 stones in each pile as a starting value.

- As in the Subtraction Game problem, use a `while` loop for the main game logic.

- Prompt the user to choose one of the three piles by entering a number. Use a `while` loop to force the user to pick a valid non-empty pile.

- Prompt the user to choose a number of stones to remove. Again, use a `while` loop to force the user to pick a valid number of stones that is less than or equal
to the number remaining in the pile.

Here's some code to use as a starting point.

```
/**
 * NIM
 *
 * @author CMS 121
 */
 
import java.util.Scanner;
 
public class Nim {

    public static void main(String[] args) {
    
        // Initialize Scanner
        Scanner input = new Scanner(System.in);
        
        // Prompt for the number of piles
        System.out.println("WELCOME TO NIM.");
        System.out.println("Enter a number of piles.");
        int numPiles = input.readInt();
        
        // Check numPiles to verify that it's greater than 0
        // If it isn't, print a message and quit
        
        // Declare the array of stones
        int[] stones = new int[numPiles];
        
        // Use a for loop to set each element of stones to 20
        
        // Declare other variables
        boolean playing = true;  // Guard variable
        int player = 1;
                
        while (playing) {
        
            System.out.println();
            
            // Arrays.toString is a useful helper method for printing arrays
            System.out.println("Stones: " + Arrays.toString(stones)):
            
            System.out.println("It's your turn, Player " + player + ".";
            
            // Prompt the player to choose a pile
            // Use a while loop to force the choice of a valid non-empty pile
            
            // Prompt the user to choose a number of stones to remove from that pile
            // Choice must be greater than 0 and less than or equla to the remaining stones in the pile
            // Again, use a while loop to force a valid choice

            // Reduce the number of stones
            
            // Check the winning condition
            // If there are 0 stones remaining in any pile, print a winning message and set playing = false;
            
            // else, switch to the other player
        
        }
    
    }
}
```

Tips:

- Think about how you want the user to choose a pile. Should you treat the first pile as pile number zero or pile number one for the purposes 
of collecting your input?

- Think about how to determine the winning condition. Maybe you could create a variable that keeps track of the total number of stones remaining
in all of the piles and stop when that becomes zero?


