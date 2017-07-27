/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javadotlang;

import java.util.Arrays;
import java.util.List;



/**
 *
 * @author Ryan Cabanas
 */
public class Main {
  public static void main(String[] args) {
    Integer[] ints = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    String[] strs = {"one", "two", "three"};
//    try {
//      Main.swapSpots(ints, 1, 8);
//      for (Integer aInt : ints) {
//        System.out.println(aInt);
//      }
//    } catch (Exception e) {
//    }
    try {
      Main.swapSpots(strs, 0, 2);
      for (String aStr : strs) {
        System.out.println(aStr);
      }
    } catch (Exception e) {
    }
    
  }
  
  static <T> void swapSpots(T[] array, int index1, int index2) throws Exception {
    if (index1 < 0 || index2 < 0 || index1 >= array.length || index2 >= array.length) {
      System.out.println("One of the parameter indexes is outside the array bounds.");
      throw new Exception();
    }
    T value1, value2;
    value1 = array[index1];
    value2 = array[index2];
    array[index1] = value2;
    array[index2] = value1;
  }
}
