package com.dongguo.file05;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

/**
 * @author dongguo
 * @date 2023/2/12
 * @description:
 */
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Person implements Serializable {
    private static final long serialVersionUID = 1319463332986826529L;
    private String name;
    private Integer age;
    private Double score;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
}
