package com.acoderx.design.decorator;

/**
 * Created by xudi on 2017/7/4.
 * 组件的具体实现，例如FileInputStream
 */
public class ConcreteComponent extends Component {
    @Override
    public int countNum() {
        return 10;
    }
}
