package com.dongguo.string02;

import lombok.Data;
import lombok.ToString;
import lombok.experimental.Accessors;

/**
 * @author dongguo
 * @date 2023/2/8
 * @description:
 */
@Data
@ToString
@Accessors(chain = true)
public class Student implements Comparable {
    private String name;
    private Integer age;

    /**
     * 按照年龄排序
     *
     * @param o
     * @return
     */
    @Override
    public int compareTo(Object o) {
        if (o instanceof Student) {
            Student student = (Student) o;
            int value = Integer.compare(this.getAge(), ((Student) student).getAge());
            if (value == 0){
                this.getName().compareTo(((Student) student).getName());
            }else {
                return value;
            }
        }
        throw new RuntimeException("传入的类型错误");
    }
}
