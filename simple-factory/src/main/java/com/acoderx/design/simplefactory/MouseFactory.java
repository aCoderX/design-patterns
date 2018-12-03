package com.acoderx.design.simplefactory;

/**
 * Description:鼠标工厂
 *
 * @author xudi
 * @since 2018-11-30
 */
public class MouseFactory {
    public static Mouse createMouse(String type) {
        if ("dell".equals(type)) {
            return new DellMouse();
        } else if ("hp".equals(type)) {
            return new HpMouse();
        }else {
            return null;
        }
    }
}
