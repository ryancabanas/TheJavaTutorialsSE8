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
public class Vacuum implements VacuumBehaviors {
 
  private String powerState = "Off";
  private String powerChordState = "In";
  
    
  @Override
  public void turnOn() {
    powerState = "On";
  }
  
  @Override
  public void turnOff() {
    powerState = "Off";
  }
  
  @Override
  public void retractChord() {
    powerChordState = "In";
  }
  
  @Override
  public void extendChord() {
    powerChordState = "Out";
  }
  
  @Override
  public String getPowerState() {
    return powerState;
  }
  
  @Override
  public String getPowerChordState() {
    return powerChordState;
  }
  
  public static void main(String... args) {
    Vacuum vacuum = new Vacuum();
    System.out.println("Power chord is: " + vacuum.getPowerChordState()); // should be in
    vacuum.extendChord(); // pull chord out
    System.out.println("Power chord is: " + vacuum.getPowerChordState()); // should be out
    System.out.println("Power is: " + vacuum.getPowerState()); // should be off
    vacuum.turnOn(); // turn vacuum on
    System.out.println("Power is: " + vacuum.getPowerState()); // should be on
    vacuum.turnOff(); // should be off
    System.out.println("Power is: " + vacuum.getPowerState()); // should be off again
  }
}


interface VacuumBehaviors {
  void turnOn();
  void turnOff();
  void retractChord();
  void extendChord();
  String getPowerState();
  String getPowerChordState();
}
