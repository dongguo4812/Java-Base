package com.dongguo.string02;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author dongguo
 * @date 2023/2/8
 * @description:
 */
public class CompareTest {

    @Test
    public void test() {
        String[] str = new String[]{"aa", "ff", "bb", "gg", "dd"};
        Arrays.sort(str);
        System.out.println(Arrays.toString(str));
    }

    @Test
    public void test1() {
        Student[] stu = new Student[4];
        stu[0] = new Student().setName("张三").setAge(18);
        stu[1] = new Student().setName("李四").setAge(20);
        stu[2] = new Student().setName("李四").setAge(28);
        stu[3] = new Student().setName("王五").setAge(19);
        Arrays.sort(stu);
        System.out.println(Arrays.toString(stu));;
    }

    @Test
    public void test2(){
        String[] str = new String[]{"aa", "ff", "bb", "gg", "dd"};
        Arrays.sort(str, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        System.out.println(Arrays.toString(str));
    }

    @Test
    public void test3() {
        Student[] stu = new Student[4];
        stu[0] = new Student().setName("张三").setAge(18);
        stu[1] = new Student().setName("李四").setAge(20);
        stu[2] = new Student().setName("李四").setAge(28);
        stu[3] = new Student().setName("王五").setAge(19);
        Arrays.sort(stu, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return Integer.compare(o1.getAge(),o2.getAge());
            }
        });
        System.out.println(Arrays.toString(stu));;
    }
}
