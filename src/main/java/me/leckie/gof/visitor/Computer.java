/**
 * BBD Service Inc All Rights Reserved @2018
 */
package me.leckie.gof.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Leckie
 * @version $Id: Computer.java, v0.1 2018/10/17 9:10 Leckie Exp $$
 */
public class Computer implements ComputerPart {

  private List<ComputerPart> parts;

  public Computer() {
    parts = new ArrayList<>();
    parts.add(new Monitor());
    parts.add(new Mouse());
    parts.add(new Keyboard());
  }

  @Override
  public void accept(ComputerPartVisitor visitor) {
    for (ComputerPart part : parts) {
      part.accept(visitor);
    }
    visitor.visit(this);
  }
}
