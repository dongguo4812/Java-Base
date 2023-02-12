package com.dongguo.set;

import java.util.*;

public class HashSetTest {
    public static void main(String[] args) {

        Comparator comparator = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if (o1 instanceof Student && o2 instanceof Student){
                    Student s1 = (Student) o1;
                    Student s2 = (Student) o2;
                    if (s1.getName().equals(s2.getName())){
                        return Integer.compare(s1.getAge(), s2.getAge());
                    }else {
                      return s1.getName().compareTo(s2.getName());
                    }
                }
                return 0;
            }
        };

        //1 创建容器对象
        Set set = new TreeSet(comparator);
        //2 存储学生对象
        set.add(new Student("zhangsan",20));
        set.add(new Student("lisi",21));
        set.add(new Student("zhangsan",28));
        set.add(new Student("wangwu",23));
        //3 获取所有学生
        for (Iterator it = set.iterator(); it.hasNext();){
            Student student = (Student) it.next();
            System.out.println(student);
        }
    }
}
