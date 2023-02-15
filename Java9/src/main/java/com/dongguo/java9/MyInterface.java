package com.dongguo.java9;

/**
 * @author dongguo
 * @date 2023/2/15
 * @description:
 */
public interface MyInterface {
    //默认权限修饰符为public
    void methodAbstract();
    static void methodStatic(){
        System.out.println("接口中的静态方法");
    }
    default void methodDefault(){
        System.out.println("接口中的默认方法");
        methodPrivate();
    }
    //私有方法
    private void methodPrivate(){
        System.out.println("接口中的私有方法");
    }
}
