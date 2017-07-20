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
public class Deck {
  private final Card[] deck = new Card[52];

  public Deck() {
    int i = 0;
    for (Rank rank : Rank.values()) {
      for (Suit suit : Suit.values()) {
        deck[i++] = new Card(rank, suit);
      }
    }
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();

    for (Card card : deck) {
      sb.append(card.toString());
      sb.append("\n");
    }

    return sb.toString();
  }
}

class DeckDemo {
  public static void main(String[] args) {
    Deck deck = new Deck();
    System.out.println(deck.toString());
  }
}
