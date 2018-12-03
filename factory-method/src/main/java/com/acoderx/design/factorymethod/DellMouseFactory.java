package com.acoderx.design.factorymethod;

/**
 * Description:dell鼠标工厂
 *
 * @author xudi
 * @since 2018-12-03
 */
public class DellMouseFactory implements MouseFactory{
    @Override
    public Mouse createMouse() {
        return new DellMouse();
    }

}
