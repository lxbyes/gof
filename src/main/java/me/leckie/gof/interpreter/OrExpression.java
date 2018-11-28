package me.leckie.gof.interpreter;

/**
 * @author Leckie
 * @version $Id: OrExpression.java, v0.1 2018/11/27 13:40 Leckie Exp $$
 */
public class OrExpression extends Expression {

  private Expression left = null;

  private Expression right = null;

  public OrExpression(Expression left, Expression right) {
    this.left = left;
    this.right = right;
  }

  @Override
  public boolean interpret(String str) {
    return left.interpret(str) || right.interpret(str);
  }
}
