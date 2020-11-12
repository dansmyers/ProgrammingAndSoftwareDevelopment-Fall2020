```
public int score() {

    // Declare an int to hold the final score calculated for the hand
    int score = 0;
    
    int numAces = 0;

    
    // Loop through all of the cards in the Hand and add up their
    // individual values
    
    for (Card c : this.cards) {
        Rank r = c.getRank();
        
        if (r == Rank.TWO) {
            score += 2;
        } else if (r == Rank.THREE) {
            score += 3;
        }
        
        // Similar for other card Ranks
        
        // All face cards count for 10
        
        // Challenge: how to deal with the ACE
        // Rules: ACE counts for 11, unless that would make you
        // go over 21, in which case the ACE counts for 1
        // Problem: you can't know what each ACE counts for
        // until you score all the other cards in the Hand
        
        // Strategy: assume that all Aces count for 11 as I evalute
        // the score of the hand
        
        // Keep count of the number of aces that I encounter
        
        // At the end of the method, change any aces from 11 to 1
        // if necessary to keep the score under 21
        
        if (r == Rank.ACE) {
            score += 11;
            numAces++;
        }
    }
    
    // At the end of the for loop, we know the value of all cards
    // in the hand, assuming the aces counted for 11
    
    // While the score is greater than 21 and there are some aces
    // that counted for 11, change aces to count for 1 instead
    while (score > 21 && numAces > 0) {
        score -= 10;  // make an ace count for 1 instead of 11
        numAces--;
    }
    
    return score;
}
```
