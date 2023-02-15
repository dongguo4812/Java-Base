package com.dongguo.reflect01;

import org.junit.jupiter.api.Test;

/**
 * @author dongguo
 * @date 2023/2/13
 * @description:
 */
public class NewInstanceTest {
    @Test
    public void test(){
        try {
            Class clazz = Person.class;
            Person person = (Person)clazz.newInstance();
            System.out.println(person);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
