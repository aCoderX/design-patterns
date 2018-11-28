package com.acoderx.design.builder;

/**
 * Description:建造者模式
 *
 * @author xudi
 * @since 2018-11-28
 */
public class Person {
    private String name;
    private Integer age;

    public static Builder builder() {
        return new Builder();
    }

    /**
     * 建造者
     */
    public static class Builder {
        private Person person = new Person();
        private Builder(){}
        public Builder withName(String name) {
            person.name = name;
            return this;
        }

        public Builder withAge(Integer age) {
            person.age = age;
            return this;
        }

        public Person build() {
            return person;
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
