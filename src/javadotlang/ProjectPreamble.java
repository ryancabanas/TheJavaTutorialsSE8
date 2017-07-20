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
public @interface ProjectPreamble {
  int id();
  String synopsis();
  String engineer() default "unassigned";
  String date() default "unknown";
}
