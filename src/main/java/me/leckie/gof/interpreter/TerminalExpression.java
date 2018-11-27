package me.leckie.gof.interpreter;

import java.util.StringTokenizer;

/**
 * @author Leckie
 * @version $Id: TerminalExpression.java, v0.1 2018/11/27 13:28 Leckie Exp $$
 */
public class TerminalExpression extends Expression {

    private String literal = null;

    public TerminalExpression(String str) {
        this.literal = str;
    }

    @Override
    public boolean interpret(String str) {
        StringTokenizer stringTokenizer = new StringTokenizer(str);
        while (stringTokenizer.hasMoreTokens()) {
            String test = stringTokenizer.nextToken();
            if (test.equals(literal)) {
                return true;
            }
        }
        return false;
    }
}
