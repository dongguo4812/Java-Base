package com.dongguo.file04;

import org.junit.jupiter.api.Test;

import java.io.*;

/**
 * @author dongguo
 * @date 2023/2/12
 * @description:
 */
public class StreamTest {
    @Test
    public void test(){
        DataOutputStream dos = null;
        try {
            dos = new DataOutputStream(new FileOutputStream("data.txt"));
            dos.writeUTF("张三");
            dos.writeInt(18);
            dos.writeDouble(99.0);
            dos.flush();
            dos.writeBoolean(false);
            dos.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                dos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Test
    public void test2(){
        DataInputStream dis = null;
        try {
            dis = new DataInputStream(new FileInputStream("data.txt"));
            String name = dis.readUTF();
            int age = dis.readInt();
            double score = dis.readDouble();
            boolean boo = dis.readBoolean();
            System.out.println(name);
            System.out.println(age);
            System.out.println(score);
            System.out.println(boo);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                dis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
