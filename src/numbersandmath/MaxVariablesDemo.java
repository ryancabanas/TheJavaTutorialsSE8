/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numbersandmath;

public class MaxVariablesDemo {
    public static void main(String args[]) {

        //integers
        byte smallestByte = Byte.MIN_VALUE;
        short smallestShort = Short.MIN_VALUE;
        int smallestInteger = Integer.MIN_VALUE;
        long smallestLong = Long.MIN_VALUE;

        //real numbers
        float smallestFloat = Float.MIN_VALUE;
        double smallestDouble = Double.MIN_VALUE;

        //Display them all.
        System.out.println("The smallest byte value is "
                           + smallestByte + ".");
        System.out.println("The smallest short value is "
                           + smallestShort + ".");
        System.out.println("The smallest integer value is "
                           + smallestInteger + ".");
        System.out.println("The smallest long value is "
                           + smallestLong + ".");

        System.out.println("The smallest float value is "
                           + smallestFloat + ".");
        System.out.println("The smallest double value is "
                           + smallestDouble + ".");
    }
}
