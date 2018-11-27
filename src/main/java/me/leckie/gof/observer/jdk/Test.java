/**
 * BBD Service Inc All Rights Reserved @2018
 */
package me.leckie.gof.observer.jdk;

/**
 * @author Leckie
 * @version $Id: Test.java, v0.1 2018/10/16 15:20 Leckie Exp $$
 */
public class Test {

  public static void main(String[] args) {
    MessageBox messageBox = new MessageBox();
    messageBox.addObserver(new Alert());
    messageBox.receive("Hello, World!");
  }
}
