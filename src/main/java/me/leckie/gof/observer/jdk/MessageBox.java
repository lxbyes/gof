/**
 * BBD Service Inc All Rights Reserved @2018
 */
package me.leckie.gof.observer.jdk;

import java.util.Observable;

/**
 * @author Leckie
 * @version $Id: MessageBox.java, v0.1 2018/10/16 15:17 Leckie Exp $$
 */
public class MessageBox extends Observable {

  public void receive(String message) {
    if (message != null) {
      System.out.println("收到消息：" + message);
      // setChanged();
      notifyObservers(message);
    }
  }
}
