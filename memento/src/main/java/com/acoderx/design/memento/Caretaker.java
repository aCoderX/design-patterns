package com.acoderx.design.memento;

/**
 * Description:
 *
 * @author xudi
 * @since 2018-12-04
 */
public class Caretaker {
    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
