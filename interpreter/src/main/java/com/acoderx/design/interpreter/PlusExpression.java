package com.acoderx.design.interpreter;

/**
 * Description:
 *
 * @author xudi
 * @since 2018-12-05
 */
public class PlusExpression implements Expression {
    private Expression left;
    private Expression right;

    public PlusExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpreter() {
        return left.interpreter()+right.interpreter();
    }
}
