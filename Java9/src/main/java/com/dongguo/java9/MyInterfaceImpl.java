package com.dongguo.java9;

/**
 * @author dongguo
 * @date 2023/2/15
 * @description:
 */
public class MyInterfaceImpl implements MyInterface {
    @Override
    public void methodAbstract() {

    }
    //重写默认方法
//    @Override
//    public void methodDefault() {
//        MyInterface.super.methodDefault();
//    }

    public static void main(String[] args) {
        //接口中的静态方法只能接口自己调用  实现类无法调用
        MyInterface.methodStatic();
        //接口中的默认方法实现类可以通过实例去调用
        MyInterfaceImpl impl = new MyInterfaceImpl();
        impl.methodDefault();
        //接口中的私有方法 只能接口自己调用
    }
}
