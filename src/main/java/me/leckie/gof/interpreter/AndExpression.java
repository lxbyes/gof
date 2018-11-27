package me.leckie.gof.interpreter;

/**
 * @author laixianbo
 * @version $Id: AndExpression.java, v0.1 2018/11/27 13:40 laixianbo Exp $$
 */
public class AndExpression extends Expression {

    private Expression left = null;

    private Expression right = null;

    public AndExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public boolean interpret(String str) {
        return left.interpret(str) && right.interpret(str);
    }
}
