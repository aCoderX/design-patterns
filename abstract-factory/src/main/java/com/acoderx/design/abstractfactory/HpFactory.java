package com.acoderx.design.abstractfactory;

/**
 * Description:Hp工厂
 *
 * @author xudi
 * @since 2018-12-03
 */
public class HpFactory implements PcFactory{
    @Override
    public Mouse createMouse() {
        return new HpMouse();
    }

    @Override
    public Keyboard createKeyboard() {
        return new HpKeyboard();
    }
}
