package com.dongguo.reflect01;

import org.junit.jupiter.api.Test;

/**
 * @author dongguo
 * @date 2023/2/13
 * @description:
 */
public class ClassLoaderTest {
    @Test
    public void test(){
        ClassLoader classLoader = ClassLoaderTest.class.getClassLoader();
        System.out.println(classLoader);
        ClassLoader classLoaderParent = classLoader.getParent();
        System.out.println(classLoaderParent);
        ClassLoader parent = classLoaderParent.getParent();
        System.out.println(parent);
        ClassLoader stringClassLoader = String.class.getClassLoader();
        System.out.println(stringClassLoader);
    }
}
