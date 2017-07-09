package com.acoderx.design.iterator;

/**
 * Created by xudi on 2017/7/9.
 * 调用者
 */
public class Client {
    public static void main(String[] args){
        Aggregate<String> aggregate = new ConcreteAggregate<>();
        aggregate.add("test1");
        aggregate.add("test2");
        aggregate.add("test3");

        Iterator<String> iterator = aggregate.createIterator();
        while (iterator.hasNext()) {
            String s = iterator.next();
            System.out.println(s);
        }
    }
}
