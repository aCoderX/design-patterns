package com.acoderx.design.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * Description:
 *
 * @author xudi
 * @since 2018-12-04
 */
public class Computer implements ComputerPart {
    List<ComputerPart> computerParts;
    public Computer() {
        computerParts = new ArrayList<>();
        computerParts.add(new Mouse());
    }
    @Override
    public void accept(ComputerPartVisitor visitor) {
        for (ComputerPart computerPart : computerParts) {
            computerPart.accept(visitor);
        }
    }
}
