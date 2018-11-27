/**
 * BBD Service Inc All Rights Reserved @2018
 */
package me.leckie.gof.listener;

import java.util.Vector;

/**
 * @author Leckie
 * @version $Id: Button.java, v0.1 2018/10/16 14:05 Leckie Exp $$
 */
public class Button implements EventSource {

  private Vector<ClickEventListener> listeners = new Vector<ClickEventListener>();

  public void click() {
    ClickEvent event = new ClickEvent(this);
    for (ClickEventListener clickEventListener : listeners) {
      clickEventListener.onClick(event);
    }
  }

  public void addEventListener(ClickEventListener eventListener) {
    this.listeners.add(eventListener);
  }

  public void removeEventListener(ClickEventListener eventListener) {
    this.listeners.remove(eventListener);
  }

}
