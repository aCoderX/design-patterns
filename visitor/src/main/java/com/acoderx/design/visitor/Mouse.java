package com.acoderx.design.visitor;

/**
 * Description:
 *
 * @author xudi
 * @since 2018-12-04
 */
public class Mouse implements ComputerPart {
    @Override
    public void accept(ComputerPartVisitor visitor) {
        visitor.visit(this);
    }
}
