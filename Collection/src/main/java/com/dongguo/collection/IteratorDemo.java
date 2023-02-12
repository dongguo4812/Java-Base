package com.dongguo.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorDemo {
    /**
     * 集合中的迭代器
     * 获取集合中的元素的方式
     * 接口Iterator：两个抽象方法
     * boolean hasNext（） 判断集合中还有没有可以取出的运输，如果有返回true
     * next（）取出集合中的下一个元素
     * <p>
     * 接口Iterator 找实现类
     * Collection 接口定义方法
     * Iterator iterator（）
     * ArrayList 重写方法iterator（），返回了Iterator接口的实现类的对象
     * 使用ArrayList集合的对象
     * Iterator it=array。iterator（），运行结果就是Iterator接口的实现类的对象
     * it是接口的实现类的对象 调用方法hasNext和next集合元素迭代
     */
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<String>();//迭代器代码不需要改变只需改变ArrayList
        coll.add("aaa");
        coll.add("bbb");
        coll.add("ccc");
        //用迭代器，对集合ArrayList中的元素进行取出
        //调用集合的方法iterator（）获取出，Iterator接口的实现类的对象
        Iterator<String> it = coll.iterator();
        //接口实现类对象，调用方法hasNex（）判断集合中是否有元素
        boolean b = it.hasNext();
        System.out.println(b);
        //接口实现类的对象，调用next（）方法取出集合中的元素
//        String s=it.next();
//        System.out.println(s);

        //迭代使用循环实现 循环的条件集合中没有元素
        while (it.hasNext()) {
            String s = it.next();
            System.out.println(s);
        }
    }
}
