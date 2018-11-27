/**
 * BBD Service Inc All Rights Reserved @2018
 */
package me.leckie.gof.visitor;

/**
 * @author Leckie
 * @version $Id: ComputerPartDisplayVisitor.java, v0.1 2018/10/17 9:04 Leckie Exp $$
 */
public interface ComputerPartVisitor {

  void visit(ComputerPart computerPart);

}
