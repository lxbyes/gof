/**
 * BBD Service Inc All Rights Reserved @2018
 */
package me.leckie.gof.visitor;

/**
 * @author Leckie
 * @version $Id: ComputerPart.java, v0.1 2018/10/17 9:02 Leckie Exp $$
 */
public interface ComputerPart {

  default void accept(ComputerPartVisitor visitor) {
    visitor.visit(this);
  }

}
