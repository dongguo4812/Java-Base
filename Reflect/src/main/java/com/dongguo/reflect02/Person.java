package com.dongguo.reflect02;

/**
 * @author dongguo
 * @date 2023/2/13
 * @description:
 */
@MyAnnotation(value = "hi")
public class Person extends Creature<String> implements Comparable<String>, MyInterface {

    private String name;
    int age;
    public int id;

    public Person() {
    }

    @MyAnnotation(value = "abc")
    private Person(String name) {
        this.name = name;
    }


    Person(String name, int age, int id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    @MyAnnotation
    private String show(String nation) {
        System.out.println("我是一个" + nation + "人");
        return nation;
    }

    public String display(String play) {
        return play;
    }

    @Override
    public int compareTo(String o) {
        return 0;
    }

    @Override
    public void info() {

    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                '}';
    }
}
