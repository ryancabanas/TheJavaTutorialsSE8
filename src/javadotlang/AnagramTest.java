/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javadotlang;

import java.util.Arrays;

/**
 *
 * @author Ryan Cabanas
 */
public class AnagramTest {
  public static void main(String[] args) {
    String string1 = "parliament";
    String string2 = "partial men";
    System.out.println(AnagramTest.isAnagram(string1, string2));
  }
  
  static boolean isAnagram(String string1, String string2) {
    string1 = string1.replaceAll(" ", "");
    string2 = string2.replaceAll(" ", "");
    
    String[] stArray1 = string1.split("");
    String[] stArray2 = string2.split("");
    
    Arrays.sort(stArray1);
    Arrays.sort(stArray2);
    
    return Arrays.equals(stArray1, stArray2);
  }
}
