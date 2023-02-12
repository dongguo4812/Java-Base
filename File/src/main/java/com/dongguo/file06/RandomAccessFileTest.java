package com.dongguo.file06;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.charset.StandardCharsets;

/**
 * @author dongguo
 * @date 2023/2/12
 * @description:
 */
public class RandomAccessFileTest {
    @Test
    public void test() {
        RandomAccessFile raf1 = null;
        RandomAccessFile raf2 = null;
        try {
            raf1 = new RandomAccessFile("背景图.jpg", "r");
            raf2 = new RandomAccessFile("背景图-copy.jpg", "rw");

            byte[] buffer = new byte[1024];
            int len;
            while ((len = raf1.read(buffer)) != -1) {
                raf2.write(buffer, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                raf1.close();
                raf2.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Test
    public void test1() {
        RandomAccessFile raf = null;
        try {
            raf = new RandomAccessFile("hello.txt", "rw");
            StringBuilder builder = new StringBuilder((int) new File("hello.txt").length());
            raf.seek(2);//指针调到角标为2的位置   之后的数据都是角标2之后的数据

            byte[] buffer = new byte[20];
            int len;
            while ((len = raf.read(buffer)) != -1) {
                //将读取的字节添加到StringBuilder中
                builder.append(new String(buffer, 0, len));
            }
            //调回指针角标2
            raf.seek(2);
            raf.write("hello".getBytes());
           //将StringBuilder添加的数据写入到文件中
            raf.write(builder.toString().getBytes());

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                raf.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
