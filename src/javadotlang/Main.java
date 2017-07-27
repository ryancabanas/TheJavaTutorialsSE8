/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javadotlang;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



/**
 *
 * @author Ryan Cabanas
 */
public class Main {
  public static void main(String[] args) {
    List<Integer> integerList = new ArrayList<>();
    integerList.add(10);
    integerList.add(22);
    integerList.add(13);
    integerList.add(41);
    integerList.add(15);

    List<String> stringList = new ArrayList<>();
    stringList.add("Drew");
    stringList.add("Bob");
    stringList.add("Cliff");
    stringList.add("keller");
    stringList.add("dude");

    try {
      Object max = Main.maxInRange(integerList, 0, 2);
      System.out.println(max);
    } catch (Exception e) {
      System.out.println(e);
    }
    
  }
  
  static <T extends Comparable<T>> T maxInRange(
          List<? extends T> list, int begin, int end) throws IndexOutOfBoundsException {
    if (begin < 0 || begin >= list.size() || end < 0 || end >= list.size()) {
      throw new IndexOutOfBoundsException();
    }
    
    List<? extends T> newList = list.subList(begin, end+1);
    T maxValue = newList.get(0);
    
    for (int i = 1; i < newList.size(); i++) {
      if (maxValue.compareTo(newList.get(i)) < 0) {
        maxValue = newList.get(i);
      }
    }
    
    return maxValue;
  }
}
