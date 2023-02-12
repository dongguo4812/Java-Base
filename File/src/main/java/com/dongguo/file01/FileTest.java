package com.dongguo.file01;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

/**
 * @author dongguo
 * @date 2023/2/11
 * @description:
 */
public class FileTest {

    public static void main(String[] args) {
        File file = new File("hello.txt");
        String path = file.getAbsolutePath();
        System.out.println(path);
    }
    @Test
    public void test() {
        File file = new File("hello.txt");
        String path = file.getAbsolutePath();
        System.out.println(path);

//        File file = new File("E:\\workspace\\Java-Base\\File\\hello.txt");
//        File file = new File("E:" + File.separator + "workspace" + File.separator + "Java-Base" + File.separator + "File" + File.separator + "hello.txt");
//        File file = new File("E:\\workspace", "java");
//
//        File file2 = new File(file, "hello.txt");
//        try {
//            file.mkdirs();
//            file2.createNewFile();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
    }
}
