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
    List<Integer> integerList = Arrays.asList(2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15);
    UnaryPredicate<Integer> p = (x) -> x == 1;
    System.out.println(Main.findFirst(integerList, 0, 5, p));
  }
  
  public static <T extends Integer>
        int findFirst(List<T> list, int begin, int end, UnaryPredicate<T> p) {
    T theOne = null;
    boolean relativelyPrime = true;
    
    for (T t : list) {
      for (int i = begin; i <= end; i++) {
        if (gcd(t, list.get(i)) > 1) {
          relativelyPrime = false;
          break;
        }
      }
      
      if (!relativelyPrime) {
        relativelyPrime = true;
        continue;
      }
      
      theOne = t;
      break;
    }    
    
    return theOne;
  }
  
  public static int gcd(int a, int b) {
    if (b == 0 && a > 0) {
      return a;
    }
    return gcd(b, a % b);
  }
  
  public static interface UnaryPredicate<T> {
    boolean test(T t);
  }
}
