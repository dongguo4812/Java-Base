package com.dongguo.stream.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author dongguo
 * @date 2022/11/22
 * @description:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product{
    int id;
    String name;
    Double price;
}
