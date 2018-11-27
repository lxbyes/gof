/**
 * BBD Service Inc All Rights Reserved @2018
 */
package me.leckie.gof.visitor;

/**
 * @author Leckie
 * @version $Id: Test.java, v0.1 2018/10/17 9:18 Leckie Exp $$
 */
public class Test {

  public static void main(String[] args) {
    Computer computer = new Computer();
    Xiaoxuesheng xiaoming = new Xiaoxuesheng();
    computer.accept(xiaoming);
  }
}
