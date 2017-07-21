/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaceprojects;

/**
 *
 * @author Ryan Cabanas
 */
public class CharSequenceReverse implements CharSequence {
  private final StringBuilder reversedSB;

  public CharSequenceReverse(String string) {
    reversedSB = new StringBuilder(string).reverse();
  }

  @Override
  public char charAt(int index) {
    return reversedSB.charAt(index);
  }

  @Override
  public int length() {
    return reversedSB.length();
  }

  @Override
  public CharSequence subSequence(int start, int end) {
    return reversedSB.subSequence(start, end);
  }

  @Override
  public String toString() {
    return reversedSB.toString();
  }
}

class CharSequenceReverseDemo {
  public static void main(String... args) {
    CharSequenceReverse test = new CharSequenceReverse(
            "Select one of the sentences from this book to use as the data.");
    System.out.println(test.charAt(6));
    System.out.println(test.length());
    System.out.println(test.subSequence(1, 9));
    System.out.println(test.toString());
  }
}
