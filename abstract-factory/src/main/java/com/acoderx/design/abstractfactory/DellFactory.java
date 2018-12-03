package com.acoderx.design.abstractfactory;

/**
 * Description:dell工厂
 *
 * @author xudi
 * @since 2018-12-03
 */
public class DellFactory implements PcFactory {
    @Override
    public Mouse createMouse() {
        return new DellMouse();
    }

    @Override
    public Keyboard createKeyboard() {
        return new DellKeyboard();
    }
}
