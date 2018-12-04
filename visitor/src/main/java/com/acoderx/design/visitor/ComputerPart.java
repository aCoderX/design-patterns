package com.acoderx.design.visitor;

/**
 * Description:
 *
 * @author xudi
 * @since 2018-12-04
 */
public interface ComputerPart {
    void accept(ComputerPartVisitor visitor);
}
