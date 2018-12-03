package com.acoderx.design.factorymethod;

/**
 * Description:hp鼠标工厂
 *
 * @author xudi
 * @since 2018-12-03
 */
public class HpMouseFactory implements MouseFactory {
    @Override
    public Mouse createMouse() {
        return new HpMouse();
    }
}
