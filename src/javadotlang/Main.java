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
public class Main {
  public static void main(String[] args) {
    Integer[] a = {1, 2, 3};
    Integer[] b = {2, 1, 3};
    System.out.println(Arrays.equals(a, b));
  }
}