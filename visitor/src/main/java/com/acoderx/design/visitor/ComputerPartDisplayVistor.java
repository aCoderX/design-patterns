package com.acoderx.design.visitor;

/**
 * Description:
 *
 * @author xudi
 * @since 2018-12-04
 */
public class ComputerPartDisplayVistor implements ComputerPartVisitor {
    @Override
    public void visit(Mouse mouse) {
        System.out.println("mouse display");
    }
}
