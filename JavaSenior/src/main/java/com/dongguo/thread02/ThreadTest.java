package com.dongguo.thread02;

public class ThreadTest extends Thread{
    private String name;
    //复写run方法
    public void run(){
        for (int x=1;x<10;x++){
            System.out.println(getName()+".."+name+".."+x);
        }
    }
    ThreadTest(String name){
        this.name=name;
    }
}
