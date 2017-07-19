/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deck.of.cards;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Ryan Cabanas
 */
public class Card {
  private String rank;
  private String suit;

  private static List<String> ranks;
  private static List<String> suits;

  static {
    populateRanks();
    populateSuits();
  }

  Card(String rank, String suit) {
    this.rank = rank;
    this.suit = suit;
  }

  private static void populateRanks() {
    List<String> ranksList = Arrays.asList(
            "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A");
    ranks = new ArrayList<>(ranksList);
  }

  private static void populateSuits() {
    List<String> suitsList = Arrays.asList("Heart", "Club", "Spade", "Diamond");
    suits = new ArrayList<>(suitsList);
  }

  static List<String> getRanks() {
    return new ArrayList(ranks);
  }

  static List<String> getSuits() {
    return new ArrayList(suits);
  }

  String getRank() {
    return rank;
  }

  String getSuit() {
    return suit;
  }

  void setRank(String rank) {
    //assert(ranks.contains(rank));

    if (ranks.contains(rank)) {
      this.rank = rank;
    } else {
      System.out.println("Invalid rank.");
    }
  }

  void setSuit(String suit) {
    //assert(suits.contains(suit));

    if (suits.contains(suit)) {
      this.suit = suit;
    } else {
      System.out.println("Invalid suit.  Valid options are: Heart, Spade, Club, Diamond");
    }
  }

  @Override
  public String toString() {
    return rank + " " + suit + "s";
  }
}

class CardDemo {
  public static void main(String[] args) {
    Card card = new Card("3", "Club");
    System.out.println(card.toString());
    System.out.println("Your card is a " + card.getRank() + " of " + card.getSuit() + "s.");

    card.setRank("1");
    card.setRank("A");
    System.out.println("Your card is a " + card.getRank() + " of " + card.getSuit() + "s.");

    card.setSuit("Clover");
    card.setSuit("Diamond");
    System.out.println("Your card is a " + card.getRank() + " of " + card.getSuit() + "s.");

    List<String> testList = Card.getRanks();
    System.out.println(testList.toString());
    testList.add("Bugga");
    System.out.println(testList.toString());
    List<String> testList2 = Card.getRanks();
    System.out.println(testList2.toString());
  }
}
