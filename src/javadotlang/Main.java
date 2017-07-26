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
    System.out.println(Integer.toHexString(65));
    System.out.println(Integer.parseInt("230", 5));
    System.out.println(Integer.valueOf(1).equals(Long.valueOf(1)));
  }
}
