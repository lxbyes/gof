/**
 * BBD Service Inc All Rights Reserved @2018
 */
package me.leckie.gof.listener;

/**
 * @author Leckie
 * @version $Id: Test.java, v0.1 2018/10/16 14:27 Leckie Exp $$
 */
public class Test {

  public static void main(String[] args) {
    Button button = new Button();
    button.addEventListener(event -> {
      System.out.println(event.getEventSource().getClass());
      System.out.println("被点击了一下...");
    });
    button.click();
  }
}
