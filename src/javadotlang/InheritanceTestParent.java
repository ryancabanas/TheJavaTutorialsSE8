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
public class InheritanceTestParent {
  protected int member;

  public InheritanceTestParent(int member) {
    prepMember(member);
  }

  void prepMember(int member) {
    this.member = member + 1;
    System.out.println("Inside the parent 'prepMember' method.");
  }

  int getMember() {
    return member;
  }

  void printSomething() {
    thePrinter();
  }

  void thePrinter() {
    System.out.println("Printing this from the parent.");
  }
}

class InheritanceTestChild extends InheritanceTestParent {

  public InheritanceTestChild(int member) {
    super(member);
  }

  @Override
  void prepMember(int member) {
    this.member = member + 2;
    System.out.println("Inside the child 'prepMember' method.");
  }

  @Override
  void thePrinter() {
    System.out.println("Printing this from the parent.");
  }
}

class Demo {
  public static void main(String[] args) {
    InheritanceTestParent test = new InheritanceTestChild(50);
    System.out.println(test.getMember());
    test.printSomething();
  }
}
