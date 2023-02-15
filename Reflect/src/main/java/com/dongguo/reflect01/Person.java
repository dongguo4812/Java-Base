package com.dongguo.reflect01;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author dongguo
 * @date 2023/2/12
 * @description:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Person {
    private String name;
    public int age;

    private Person(String name) {
        this.name = name;
    }

    public void show() {
        System.out.println("我是一个人");
    }

    public String showNation(String nation) {
        System.out.println("我是一个" + nation + "人");
        return nation;
    }
}
