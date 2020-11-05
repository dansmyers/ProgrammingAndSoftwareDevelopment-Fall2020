/**
 * A class that represents a Deck of 52 cards
 * 
 * @author dmyers
 *
 */

// Key idea: using one class as as building block of another, more complex class

// How to represent the collection of 52 playing cards?
//
// One option: 1-d array that holds 52 cards
//
// Second option: create an ArrayList of Card objects

// ArrayList is a built-in Java data structure that represnts a list of items
//
// An ArrayList is LIKE a 1-d array, but is not required to have a fixed size
//
// Remember: 1-d arrays have a size that's set when you create the array with new
//
// ArrayList can grow and shrink over the life of the program

// To get access to ArrayList, you must import it from java.util
import java.util.ArrayList;
import java.util.Collections;


public class Deck {
	
	// Create a private ArrayList of Card objects that can represent the deck of 52 cards
	//
	// When you create an ArrayList, Java wants to know the type of item held inside the list
	// Specify the internal type of the ArrayList using < >
	private ArrayList<Card> cards;
	
	
	/**
	 * Constructor -- initialize the Deck of cards
	 */
	public Deck() {
		
		// Allocate memory to create the new ArrayList
		this.cards = new ArrayList<Card>();
		
		// We have now allocated an empty list that can hold Card objects,
		// but doesn't have anything in it yet
		
		// We need to create the 52 separate playing cards and put them in the
		// List so we can use it like a deck
		
		// We COULD declare each Card manually and then add them to the list
		//
		// Card twoOfClubs = new Card(Suit.CLUBS, Rank.TWO);
		//
		// and so forth for 51 more cards
		
		// Loop through the contents of the Suit and Rank enums create a new card
		// for each combination of Suit and Rank
		
		// This is an example of the "enhanced" for loop
		// way to iterate over the contents of a set of things without declaring
		// an index variable
		
		for (Suit s : Suit.values()) {
			for (Rank r : Rank.values()) {
				Card c = new Card(s, r);
				this.cards.add(c);
			}
		}
	}
	
	/**
	 * Shuffle the deck of cards
	 */
	public void shuffle() {
		
		// How to shuffle?
		//
		// Be as lazy as possible - use Java's built-in shuffling method
		// Collections.shuffle
		Collections.shuffle(this.cards);
	}
	
	
	/**
	 * Deal the next card in the deck
	 */
	public Card deal() {
		// There could be a few different ways of implementing this
		//
		// Strategy: use a built-in method of the ArrayList to remove
		// the first card in the deck and then return it
		Card nextCard = this.cards.remove(0);
		return nextCard;
	}
	
	
	/**
	 * toString -- return a String representation of the cards
	 */
	public String toString() {
		return this.cards.toString();  // Use built-in ArrayList toString to get a String representation
	}
	
	
	/**
	 * Write a main to test this class
	 * 
	 * This main operates just as if it was written inside a DeckTest or some other class
	 */
	public static void main(String[] args) {
		
		// Initialize a new deck of 52 cards
		Deck d = new Deck();
		
		// Make the deck d shuffle itself
		d.shuffle();
		
		// Print the deck
		System.out.println(d);
		
		// Deal the first card from the deck
		Card c = d.deal();
		System.out.println(c);
		
		// Print the deck again and show that the first card has been removed
		System.out.println(d);
		
	}
	
}
