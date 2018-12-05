package com.acoderx.design.interpreter;

import java.util.Stack;

/**
 * Description:解释器模式
 *
 * @author xudi
 * @since 2018-12-05
 */
public class Client {
    public static void main(String[] args){
        String token = "4 3 +";
        String[] tokenList = token.split(" ");
        Stack<Expression> stack = new Stack<>();
        for (String s : tokenList) {
            if (isOperator(s)) {
                Expression right = stack.pop();
                Expression left = stack.pop();
                Expression expression = getExpress(s, left, right);
                int result = expression.interpreter();
                stack.push(new NumberExpression(result));
            } else {
                stack.push(new NumberExpression(Integer.parseInt(s)));
            }
        }
        System.out.println(stack.pop().interpreter());
    }

    private static boolean isOperator(String s) {
        return "+".equals(s) || "-".equals(s);
    }

    private static Expression getExpress(String s, Expression left, Expression right) {
        switch (s) {
            case "+":
                return new PlusExpression(left, right);
            default:
                return null;
        }
    }
}
