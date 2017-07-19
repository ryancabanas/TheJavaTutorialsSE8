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
public class NumberHolder {
    public int anInt;
    public float aFloat;
}

class NumberHolderDemo {
  public static void main(String[] args) {
    NumberHolder numberHolder = new NumberHolder();
    numberHolder.anInt = 1;
    numberHolder.aFloat = 1.11F;

    System.out.println("\"anInt\" is: " + numberHolder.anInt);
    System.out.println("\"aFloat\" is: " + numberHolder.aFloat);
  }
}
