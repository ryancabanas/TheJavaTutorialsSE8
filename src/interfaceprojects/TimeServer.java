/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaceprojects;

import java.time.LocalDateTime;

/**
 *
 * @author Ryan Cabanas
 */
public interface TimeServer {
  boolean isNotificationOn();
  void turnNotificationOn();
  void turnNotificationOff();
  LocalDateTime setNotification(long secondsFrequency);
  LocalDateTime setNotification(long secondsFrequency, boolean turnNotificationOn);
}
