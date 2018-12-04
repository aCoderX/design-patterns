package com.acoderx.design.memento;

/**
 * Description:备忘录模式
 * 有三个角色：originator（发起者：需要被备份的对象）、caretaker（看管者：负责存储备份）、memento（备份）
 *
 * @author xudi
 * @since 2018-12-04
 */
public class Client {
    public static void main(String[] args){
        Originator originator = new Originator();
        originator.setAge(1);
        originator.setName("first");
        System.out.println("--------原属性----------");
        System.out.println(originator);
        Caretaker caretaker = new Caretaker();
        caretaker.setMemento(originator.createMemento());

        System.out.println("--------备份完成，修改属性----------");
        originator.setName("second");
        originator.setAge(2);
        System.out.println(originator);

        System.out.println("--------恢复属性----------");
        originator.restoreMemento(caretaker.getMemento());
        System.out.println(originator);

    }
}
