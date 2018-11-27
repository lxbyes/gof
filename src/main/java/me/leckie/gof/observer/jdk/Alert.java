/**
 * BBD Service Inc All Rights Reserved @2018
 */
package me.leckie.gof.observer.jdk;

import java.util.Observable;
import java.util.Observer;

/**
 * @author Leckie
 * @version $Id: Alert.java, v0.1 2018/10/16 15:19 Leckie Exp $$
 */
public class Alert implements Observer {

  @Override
  public void update(Observable o, Object arg) {
    System.out.println(o.getClass());
    System.out.println(arg);
  }
}
