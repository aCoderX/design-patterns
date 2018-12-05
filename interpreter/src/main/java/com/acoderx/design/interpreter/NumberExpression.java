package com.acoderx.design.interpreter;

/**
 * Description:
 *
 * @author xudi
 * @since 2018-12-05
 */
public class NumberExpression implements Expression {
    private int num;

    public NumberExpression(int num) {
        this.num = num;
    }

    @Override
    public int interpreter() {
        return num;
    }
}
