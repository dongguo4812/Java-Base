package com.dongguo.stream;

import com.dongguo.stream.entity.Author;
import com.dongguo.stream.entity.Book;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author dongguo
 * @date 2022/11/22
 * @description:
 */
public class StreamDemo1 {
    // 初始化一些数据
    private static List<Author> getAuthors() {
        Author author1 = new Author(1L, "杨杰炜", "my introduction 1", 18, null);
        Author author2 = new Author(2L, "yjw", "my introduction 2", 19, null);
        Author author3 = new Author(3L, "yjw1", "my introduction 3", 14, null);
        Author author4 = new Author(4L, "wdt", "my introduction 4", 29, null);
        Author author5 = new Author(5L, "wtf", "my introduction 5", 12, null);

        List<Book> books1 = new ArrayList<>();
        List<Book> books2 = new ArrayList<>();
        List<Book> books3 = new ArrayList<>();

        // 上面是作者和书
        books1.add(new Book(1L, "类别,分类啊", "书名1", 45D, "这是简介哦"));
        books1.add(new Book(2L, "高效", "书名2", 84D, "这是简介哦"));
        books1.add(new Book(3L, "喜剧", "书名3", 83D, "这是简介哦"));

        books2.add(new Book(5L, "天啊", "书名4", 65D, "这是简介哦"));
        books2.add(new Book(6L, "高效", "书名5", 89D, "这是简介哦"));

        books3.add(new Book(7L, "久啊", "书名6", 45D, "这是简介哦"));
        books3.add(new Book(8L, "高效", "书名7", 44D, "这是简介哦"));
        books3.add(new Book(9L, "喜剧", "书名8", 81D, "这是简介哦"));

        author1.setBookList(books1);
        author2.setBookList(books2);
        author3.setBookList(books3);
        author4.setBookList(books3);
        author5.setBookList(books2);

        return new ArrayList<>(Arrays.asList(author1, author2, author3, author4, author5));
    }

    public static void main(String[] args) {
        List<Author> authors = getAuthors();
        authors.forEach(System.out::println);
    }

    @Test
    public void test1() {
        List<Author> authors = getAuthors();
        authors.stream()
                .distinct()
                .filter(author -> {
                    return author.getAge() < 18;
                })
                .forEach(author -> System.out.println(author.getName()));
    }

    @Test
    public void test2() {
        getAuthors().stream()
                .distinct()
                .sorted((o1, o2) -> {
                    return o2.getAge() - o1.getAge();
                })
                .limit(2)
                .forEach(System.out::println);
    }

    @Test
    public void test3() {
        getAuthors().stream()
                .distinct()
                .sorted((o1, o2) -> {
                    return o2.getAge() - o1.getAge();
                })
                .skip(1)
                .forEach(System.out::println);
    }

    @Test
    public void test4() {
        getAuthors().stream()
                .flatMap(author -> {
                    return author.getBookList().stream();
                })
                .distinct()
                .forEach(System.out::println);
    }

    @Test
    public void test5() {
        getAuthors().stream()
                .flatMap(author -> {
                    return author.getBookList().stream();
                })
                .distinct()
                .flatMap(book -> {
                    return Arrays.stream(book.getCategory().split(","));
                })
                .distinct()
                .forEach(System.out::println);
    }

    @Test
    public void test6() {
        List<String> list = getAuthors().stream()
                .map(author -> author.getName())
                .distinct()
                .collect(Collectors.toList());
        System.out.println(list);
    }
    @Test
    public void test7() {
        List<String> list = getAuthors().stream()
                .flatMap(author -> {
                    return author.getBookList().stream();
                })
                .distinct()
                .map(book -> book.getName())
                .distinct()
                .collect(Collectors.toList());
        System.out.println(list);
    }
    @Test
    public void test8() {
        Map<String, List<Book>> map = getAuthors().stream()
                .distinct()
                .collect(Collectors.toMap(author -> author.getName(), author -> author.getBookList()));
        System.out.println(map);

    }
}
