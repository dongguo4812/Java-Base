package com.dongguo.reflect02;

import cn.hutool.core.util.ObjectUtil;
import org.junit.jupiter.api.Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import java.util.Arrays;

/**
 * @author dongguo
 * @date 2023/2/13
 * @description:
 */
public class ClassTest {
    @Test
    public void test1() {
        Class clazz = Person.class;
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            //获取权限修饰符
            int modifiers = field.getModifiers();
            System.out.println(modifiers);
            System.out.println(Modifier.toString(modifiers));
            //数据类型
            Class type = field.getType();
            System.out.println(type.getName());
            //变量名
            String name = field.getName();
            System.out.println(name);
            System.out.println("------------------------");
        }
    }
    @Test
    public void test2() {
        Class clazz = Person.class;
        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method);
        }
    }

    @Test
    public void test3() {
        Class clazz = Person.class;
        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            //获取方法声明的注解
            Annotation[] annotations = method.getAnnotations();
            for (Annotation annotation:annotations) {
                System.out.println(annotation);
            }
            //权限修饰符
            int modifiers = method.getModifiers();
            System.out.println(Modifier.toString(modifiers));

            //返回值类型
            Class returnType = method.getReturnType();
            System.out.println(returnType.getName());

            //方法名
            String name = method.getName();
            System.out.println(name);


            //形参列表
            Class[] parameterTypes = method.getParameterTypes();
            if (ObjectUtil.isNotEmpty(parameterTypes)){
                for (Class typeClazz:parameterTypes) {
                    System.out.println(typeClazz.getName());
                }
            }

            //抛出的异常
            Class[] exceptionTypes = method.getExceptionTypes();
            for (Class exClass:exceptionTypes) {
                System.out.println(exClass.getName());
            }
            System.out.println("---------------------");
        }
    }
    @Test
    public void test4() {
        try {
            Class clazz = Person.class;
            Constructor[] constructors = clazz.getDeclaredConstructors();
            for (Constructor constructor:constructors) {
                System.out.println(constructor);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Test
    public void test5() {
        try {
            Class clazz = Person.class;
            //获取父类
            Class superclass = clazz.getSuperclass();
            System.out.println(superclass);
            //获取父类的泛型
            Type genericSuperclass = clazz.getGenericSuperclass();
            System.out.println(genericSuperclass);
            //获取泛型的
            ParameterizedType parameterizedType = (ParameterizedType) genericSuperclass;
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            System.out.println(Arrays.toString(actualTypeArguments));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test6() {
        try {
            Class clazz = Person.class;
            //获取接口
            Class[] interfaces = clazz.getInterfaces();
            System.out.println(Arrays.toString(interfaces));
            Class superclass = clazz.getSuperclass();
            Class[] interfaces1 = superclass.getInterfaces();
            System.out.println(Arrays.toString(interfaces1));
            //获取包
            Package aPackage = clazz.getPackage();
            System.out.println(aPackage);
            //获取注解
            Annotation[] annotations = clazz.getAnnotations();
            System.out.println(Arrays.toString(annotations));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Test
    public void test7() {
        try {
            Class clazz = Person.class;
            Field[] fields = clazz.getFields();
            System.out.println(Arrays.toString(fields));

            Field[] declaredFields = clazz.getDeclaredFields();
            System.out.println(Arrays.toString(declaredFields));
            Person person = (Person) clazz.newInstance();
            Field id = clazz.getField("id");
            id.set(person,1001);
            int pId = (int) id.get(person);
            System.out.println(pId);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Test
    public void test8() {
        try {
            Class clazz = Person.class;
            Person person = (Person) clazz.newInstance();
            //获取非public属性
            Field name = clazz.getDeclaredField("name");
            name.setAccessible(true);
            name.set(person,"张三");
            String pName = (String) name.get(person);
            System.out.println(pName);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Test
    public void test9() {
        try {
            Class clazz = Person.class;
            Person person = (Person) clazz.newInstance();
           //获取指定的某个方法  方法名，参数类型.class
            Method show = clazz.getDeclaredMethod("show", String.class);
            System.out.println(show);
            //方法调用者，方法实参
            show.setAccessible(true);
            show.invoke(person,"中国");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Test
    public void test10() {
        try {
            Class clazz = Person.class;
            Constructor constructor = clazz.getDeclaredConstructor(String.class);
            System.out.println(constructor);
            constructor.setAccessible(true);
            Person person = (Person)constructor.newInstance("张三");
            System.out.println(person);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
