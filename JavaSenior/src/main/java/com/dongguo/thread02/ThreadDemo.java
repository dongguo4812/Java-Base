package com.dongguo.thread02;

public class ThreadDemo {
    public static void main(String[] args) {
        ThreadTest d1=new ThreadTest("zhangsan");
        ThreadTest d2=new ThreadTest("lisi");
        d1.start();
        d2.start();
        for (int x=1;x<20;x++){
            System.out.println(Thread.currentThread().getName()+".."+x);//主线程的名字main
        }
    }
}
