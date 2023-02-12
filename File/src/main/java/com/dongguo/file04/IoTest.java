package com.dongguo.file04;

import org.junit.jupiter.api.Test;

import java.io.*;

/**
 * @author dongguo
 * @date 2023/2/12
 * @description:
 */
public class IoTest {
    @Test
    public void test() {
        InputStreamReader isr = null;
        OutputStreamWriter osw = null;
        try {
            FileInputStream fis = new FileInputStream(new File("person.txt"));
            FileOutputStream fos = new FileOutputStream("person-copy.txt");
            //参数二指定字符集，取决于读取的文件保存时的字符集
            isr = new InputStreamReader(fis, "utf-8");
            osw = new OutputStreamWriter(fos, "utf-8");
            char[] buffer = new char[1024];
            int len;
            while ((len = isr.read(buffer)) != -1) {
                osw.write(buffer, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                isr.close();
                osw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }



}
