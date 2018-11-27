/**
 * BBD Service Inc All Rights Reserved @2018
 */
package me.leckie.gof.visitor;

/**
 * @author Leckie
 * @version $Id: Xiaoxuesheng.java, v0.1 2018/10/17 9:17 Leckie Exp $$
 */
public class Xiaoxuesheng implements ComputerPartVisitor {

  @Override
  public void visit(ComputerPart computerPart) {
    System.out.println("Use " + computerPart.getClass().getSimpleName());
  }
}
