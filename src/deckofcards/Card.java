/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deckofcards;

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

  public static enum Ranks {
    TWO("2"), THREE("3"), FOUR("4"), FIVE("5"), SIX("6"), SEVEN("7"), EIGHT("8"),
    NINE("9"), TEN("10"), JACK("J"), QUEEN("Q"), KING("K"), ACE("A");

    private final String rank;

    Ranks(String rank) {
      this.rank = rank;
    }

    String getValue() {
      return rank;
    }
  }

    public static enum Suits {
    HEART("Heart"), CLUB("Club"), SPADE("Spade"), DIAMOND("Diamond");

    private final String suit;

    Suits(String suit) {
      this.suit = suit;
    }

    String getValue() {
      return suit;
    }
  }

  static {
    populateRanks();
    populateSuits();
  }

  Card(String rank, String suit) {
    this.rank = rank;
    this.suit = suit;
  }

  private static void populateRanks() {
    List<Ranks> enumRanksList = Arrays.asList(Ranks.values());
    List<String> ranksList = new ArrayList<>();

    enumRanksList.forEach((eachRank) -> {
      ranksList.add(eachRank.getValue());
    });

    ranks = new ArrayList<>(ranksList);
  }

  private static void populateSuits() {
    List<Suits> enumSuitsList = Arrays.asList(Suits.values());
    List<String> suitsList = new ArrayList<>();

    enumSuitsList.forEach((eachSuit) -> {
      suitsList.add(eachSuit.getValue());
    });

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
