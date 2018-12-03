package com.acoderx.design.abstractfactory;

/**
 * Description:pc工厂
 *
 * @author xudi
 * @since 2018-12-03
 */
public interface PcFactory {
    Mouse createMouse();

    Keyboard createKeyboard();
}
