package com.acoderx.design.memento;

/**
 * Description:
 *
 * @author xudi
 * @since 2018-12-04
 */
public class Originator {
    private String name;
    private int age;

    Memento createMemento() {
        Memento memento = new Memento();
        memento.setAge(this.age);
        memento.setName(this.name);
        return memento;
    }

    void restoreMemento(Memento memento) {
        this.age = memento.getAge();
        this.name = memento.getName();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Originator{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
