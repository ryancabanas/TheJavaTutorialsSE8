/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deckofcardsenum;

/**
 *
 * @author Ryan Cabanas
 */
public class Card {
  private final Rank rank;
  private final Suit suit;

  public Card(Rank rank, Suit suit) {
    this.rank = rank;
    this.suit = suit;
  }

  public Rank getRank() {
    return rank;
  }

  public Suit getSuit() {
    return suit;
  }

  @Override
  public String toString() {
    return rank + " of " + suit;
  }
}

class CardDemo {
  public static void main(String[] args) {
  Card test = new Card(Rank.ACE, Suit.SPADES);
  System.out.println(test);
  }
}