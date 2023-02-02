package com.dongguo.top;

/**
 * @author dongguo
 * @date 2023/1/29
 * @description:
 */
public class PersonTest {
    public static void main(String[] args) {
        //创建Person对象
        Person person = new Person();
        //属性赋值
        person.name = "张三";
        person.age = 18;
        //调用方法
        person.talk("英语");
    }
}

/**
 * 定义Person类
 */
class Person {
    //属性
     String name;
     Integer age;
     String email;

    //方法
    public void eat() {
        System.out.println("吃饭");
    }

    public void sleep() {
        System.out.println("睡觉");
    }

    public void talk(String language) {
        System.out.println("说" + language);
    }
}
