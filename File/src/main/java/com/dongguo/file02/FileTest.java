package com.dongguo.file02;

import org.junit.jupiter.api.Test;

import java.io.*;

/**
 * @author dongguo
 * @date 2023/2/12
 * @description:
 */
public class FileTest {
    /**
     * 将File目录下的hello.txt文件内容读取，并输出到控制台
     */
    @Test
    public void test() {
        FileReader reader = null;
        try {
            File file = new File("hello.txt");
            //注意file是否存在
            if (file.exists()) {
                reader = new FileReader(file);
                //read()返回读入的一个字符， 如果打到文件末尾返回-1  返回的是ascii码(int类型)要转回char类型
                int data;
                while ((data = reader.read()) != -1) {
                    System.out.print((char) data);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Test
    public void test2() {
        FileReader reader = null;
        try {
            File file = new File("hello.txt");
            //注意file是否存在
            if (file.exists()) {
                reader = new FileReader(file);
                //read()返回读入字符的个数， 如果打到文件末尾返回-1

                //定义一个buffer容量为3
                char[] cbuf = new char[3];

                int len;
                while ((len = reader.read(cbuf)) != -1) {
                    //遍历此次读取的字符
                    for (int i = 0; i < len; i++) {
                        System.out.print(cbuf[i]);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Test
    public void test3() {
        FileReader reader = null;
        try {
            File file = new File("hello.txt");
            //注意file是否存在
            if (file.exists()) {
                reader = new FileReader(file);
                //read()返回读入字符的个数， 如果打到文件末尾返回-1

                //定义一个buffer容量为3
                char[] cbuf = new char[3];

                int len;
                while ((len = reader.read(cbuf)) != -1) {
                    String str = new String(cbuf, 0, len);
                    System.out.println(str);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Test
    public void test4() {
        FileWriter writer = null;
        try {
            File file = new File("name.txt");
            //true表示不覆盖，只追加
            writer = new FileWriter(file, true);
            writer.write("张三");
            writer.write("李四");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Test
    public void test5() {
        FileReader reader = null;
        FileWriter writer = null;
        try {
            reader = new FileReader("hello.txt");
            writer = new FileWriter("hello-copy.txt");
            char[] cbuf = new char[3];
            int len;
            while ((len = reader.read(cbuf)) != -1) {
                String str = new String(cbuf, 0, len);
                writer.write(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
                if (writer != null) {
                    writer.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
