/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overrideproject;

import java.util.Arrays;

public class Deck {

  public static final int NUM_SUITS = 4;
  public static final int NUM_RANKS = 13;
  public static int numCards = NUM_SUITS * NUM_RANKS;

  private final Card[][] cards;

  public Deck() {
      cards = new Card[NUM_SUITS][NUM_RANKS];
      for (int suit = Card.DIAMONDS; suit <= Card.SPADES; suit++) {
          for (int rank = Card.ACE; rank <= Card.KING; rank++) {
              cards[suit-1][rank-1] = new Card(rank, suit);
          }
      }
  }

  public Card getCard(int suit, int rank) {
      return cards[suit-1][rank-1];
  }
    
//  @Override
//  public boolean equals(Object thatObject) {
//    if (this == thatObject)
//      return true;
//
//    if (thatObject == null)
//      return false;
//
//    if (getClass() != thatObject.getClass())
//      return false;
//
//    Card[][] that = (Card[][]) thatObject;
//
//    if (cards.length != )
//    
//    for (int i = 0; i ) {
//      
//    }
//    return getRank() == that.getRank()
//            && getSuit() == that.getSuit();
//  }

  @Override
  public int hashCode() {
    int hash = 3;
    hash = 73 * hash + Arrays.deepHashCode(this.cards);
    return hash;
  }
}