/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javadotlang;



/**
 *
 * @author Ryan Cabanas
 */
public class Main {
  public static void main(String[] args) {
    String name = "Ryan Edward Cabanas";
    String result = "";
    for (int i = 0; i < name.length(); i++) {
      if (Character.isUpperCase(name.charAt(i)))
        result += name.charAt(i);
    }
    System.out.println(result);    
  }
}
