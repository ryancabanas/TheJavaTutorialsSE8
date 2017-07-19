/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deck.of.cards;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ryan Cabanas
 */
public class Deck {
  private List<Card> deck;

  Deck() {
    populateDeck();
  }

  private void populateDeck() {
    List<String> ranks = Card.getRanks();
    List<String> suits = Card.getSuits();
    List<Card> deckBuilder = new ArrayList<>();

    String rank;
    String suit;

    for (int i = 0; i < 13; i++) {
      rank = ranks.get(i);

      for (int j = 0; j < 4; j++) {
        suit = suits.get(j);
        deckBuilder.add(new Card(rank, suit));
      }
    }

    deck = deckBuilder;
  }

  List<Card> getDeck() {
    return new ArrayList<>(deck);
  }
}

class DeckDemo {
  public static void main(String[] args) {
    Deck deck = new Deck();
    List<Card> cards = deck.getDeck();
    int deskSize = cards.size();

    for (int i = 0; i < 52; i++) {
      System.out.println(cards.get(i).toString());
    }
  }
}
