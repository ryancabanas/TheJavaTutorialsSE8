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

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    final Deck other = (Deck) obj;
    return Arrays.deepEquals(this.cards, other.cards);
  }

  @Override
  public int hashCode() {
    int hash = 3;
    hash = 73 * hash + Arrays.deepHashCode(this.cards);
    return hash;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    for (int i = 1; i <= NUM_SUITS; i++) {
      for (int j = 1; j <= NUM_RANKS; j++) {
        sb.append(getCard(i, j).toString());
        sb.append("\n");
      }
    }
    return sb.toString().substring(0, sb.length()-1);
  }
}

class DeckDemo {
  public static void main(String[] args) {
    Deck deck1 = new Deck();
    Deck deck2 = new Deck();
    System.out.println(deck1.equals(deck2));
    System.out.println(deck1.toString());
  }
}
