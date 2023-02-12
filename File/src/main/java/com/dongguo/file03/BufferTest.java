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
public class BufferTest {


    @Test
    public void test1() {
        String sourceName = "C:\\Users\\dongguo\\Desktop\\1.mp4";
        String targetName = "C:\\Users\\dongguo\\Desktop\\2.mp4";
        copyFile(sourceName, targetName);
    }

    /**
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
            byte[] buffer = new byte[1024];
            int len;
            while ((len = fis.read(buffer)) != -1) {
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
        log.info("共花费时间{}毫秒", end - start);
    }

    @Test
    public void test() {
        String sourceName = "C:\\Users\\dongguo\\Desktop\\1.mp4";
        String targetName = "C:\\Users\\dongguo\\Desktop\\2.mp4";
        copyFileWithBuffer(sourceName, targetName);
    }

    private void copyFileWithBuffer(String sourceName, String targetName) {
        long start = System.currentTimeMillis();
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        try {
            File sourceFile = new File(sourceName);
            File targetFile = new File(targetName);

            FileInputStream fis = new FileInputStream(sourceFile);
            FileOutputStream fos = new FileOutputStream(targetFile);

            bis = new BufferedInputStream(fis);
            bos = new BufferedOutputStream(fos);

            byte[] buffer = new byte[1024];
            int len;
            while ((len = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, len);
                bos.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bos.close();
                bis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        long end = System.currentTimeMillis();
        log.info("共花费时间{}毫秒", end - start);
    }

    @Test
    public void test2() {
        String sourceName = "person.txt";
        String targetName = "person-copy.txt";

        BufferedReader br = null;
        BufferedWriter bw = null;
        try {
            FileReader reader = new FileReader(sourceName);
            FileWriter writer = new FileWriter(targetName);

            br = new BufferedReader(reader);
            bw = new BufferedWriter(writer);

            String data;
            while ((data = br.readLine()) != null) {
                bw.write(data);
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bw.close();
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
