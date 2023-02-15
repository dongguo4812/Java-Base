package com.dongguo.stream.entity;

import lombok.*;

import java.util.List;

/**
 * @author dongguo
 * @date 2022/11/22
 * @description:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Author implements Comparable<Author> {
    private Long id;
    private String name;
    private String introduction;
    private Integer age;
    private List<Book> bookList;

    @Override
    public int compareTo(Author author) {
        return this.getAge() - author.getAge();
    }
}
