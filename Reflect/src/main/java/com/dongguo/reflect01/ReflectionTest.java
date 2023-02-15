package com.dongguo.reflect01;

import org.junit.jupiter.api.Test;

/**
 * @author dongguo
 * @date 2023/2/12
 * @description:
 */
public class ReflectionTest {
    @Test
    public void test(){
        Person p = new Person();
        Class clazz1 = p.getClass();
        Class clazz2 = Person.class;
        System.out.println(clazz1 == clazz2);
    }
}
