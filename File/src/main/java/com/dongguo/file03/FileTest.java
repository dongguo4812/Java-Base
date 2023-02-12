package com.dongguo.file03;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.io.*;

/**
 * @author dongguo
 * @date 2023/2/12
 * @description:
 */
@Slf4j
public class FileTest {
    @Test
    public void test(){
        FileInputStream inputStream = null;
        try {
            File file = new File("hello.txt");
            inputStream = new FileInputStream(file);

            byte[] buffer = new byte[3];
            int len;
            while ((len =inputStream.read(buffer)) != -1){
                String str = new String(buffer, 0, len);
                System.out.print(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (inputStream != null){
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Test
    public void test1(){
        String sourceName = "背景图.jpg";
        String targetName = "背景图-copy.jpg";
        copyFile(sourceName, targetName);
    }

    /**
     *
     * @param sourceName
     * @param targetName
     */
    private void copyFile(String sourceName, String targetName) {
        long start = System.currentTimeMillis();
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            File sourceFile = new File(sourceName);
            File targetFile = new File(targetName);
            fis = new FileInputStream(sourceFile);
            fos = new FileOutputStream(targetFile);
            byte[] buffer = new byte[5];
            int len;
            while ((len = fis.read(buffer)) != -1){
                fos.write(buffer, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fis.close();
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        long end = System.currentTimeMillis();
        log.info("共花费时间{}毫秒", end -start);
    }
}
