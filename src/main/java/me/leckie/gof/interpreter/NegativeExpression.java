package me.leckie.gof.interpreter;

/**
 * @author Leckie
 * @version $Id: NegativeExpression.java, v0.1 2018/11/27 13:43 Leckie Exp $$
 */
public class NegativeExpression extends Expression {

  private Expression expression = null;

  public NegativeExpression(Expression expression) {
    this.expression = expression;
  }

  @Override
  public boolean interpret(String str) {
    return !expression.interpret(str);
  }
}
