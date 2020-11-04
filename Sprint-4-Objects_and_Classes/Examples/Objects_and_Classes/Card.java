/**
 * Create a class that represents a single playing card
 * Combine with a Deck class to represent a full deck of 52 cards
 * 
 * @author dmyers
 *
 */

// How to represent the Suit and Rank of the Card?

// Each of those variables can only take on a fixed set of values
// Types with a limited set of values are called enumerated types

// enumerated = you can write down all the possible values of the variable

// Java has a feature called enum that can be used to automatically create
// enumerated types

// Recall: we used final int values to represent fixed types in the RPS program
//
// final int ROCK = 1;
//
// Could use the same final int technique to represent Suits and Ranks
//
// In fact, that's what enum does behind the scenes. Each name within an enum
// maps to a constant value
//
// The advantage if using enums is that the declaration is more streamlined
// Also allows Java to check the types and ensure that we're using data in appropriate ways

enum Suit {
	CLUBS, DIAMONDS, HEARTS, SPADES;
}

enum Rank {
	ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING;
}

public class Card {

	// Declare instance variables (data members, fields, attributes)
	//
	// Recall: private variables can't be accessed outside of this class
	private Suit suit;
	private Rank rank;
	
	/**
	 * Constructor -- create a new card with a specified Suit and Rank
	 */
	public Card(Suit newSuit, Rank newRank) {
		this.suit = newSuit;
		this.rank = newRank;
	}
	
	/**
	 * Get methods -- return the value of suit and rank
	 */
	public Suit getSuit() {
		return this.suit;
	}
	
	public Rank getRank() {
		return this.rank;
	}
	
	/**
	 * toString method
	 */
	public String toString() {
		return this.rank + " of " + this.suit;
	}
	
}
