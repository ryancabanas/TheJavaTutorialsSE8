/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numbersandmath;

/**
 *
 * @author Ryan Cabanas
 */
public class FPAdder {
  public static void main(String[] args) {
    if (args.length < 2) {
      System.out.println("Error: specify 2, or more, float arguments");
    } else {
      float result = 0;
      for (String arg : args) {
        result += Float.parseFloat(arg);
      }
      System.out.printf("Sum of arguments is: %.2f%n", result);
    }
  }
}
