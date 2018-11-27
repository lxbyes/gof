/**
 * BBD Service Inc All Rights Reserved @2018
 */
package me.leckie.gof.listener;

/**
 * @author Leckie
 * @version $Id: ClickEvent.java, v0.1 2018/10/16 14:05 Leckie Exp $$
 */
public class ClickEvent implements Event {

  private EventSource eventSource;

  public ClickEvent(EventSource eventSource) {
    this.eventSource = eventSource;
  }

  public EventSource getEventSource() {
    return eventSource;
  }

}
