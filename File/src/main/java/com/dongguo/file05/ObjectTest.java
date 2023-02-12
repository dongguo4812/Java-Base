package com.dongguo.file05;

import org.junit.jupiter.api.Test;
import java.io.*;

/**
 * @author dongguo
 * @date 2023/2/12
 * @description:
 */
public class ObjectTest {
    @Test
    public void test() {
        //序列化过程 将内存中的java对象保存到磁盘或通过网络进行传输
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream("person.dat"));
            oos.writeObject(new Person("张三",18));
            oos.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                oos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Test
    public void test2() {
        //反序列化过程
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream("person.dat"));
            Object object = ois.readObject();
            System.out.println((Person) object);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                ois.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}


