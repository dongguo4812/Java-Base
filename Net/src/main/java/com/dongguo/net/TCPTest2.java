package com.dongguo.net;

import org.junit.jupiter.api.Test;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author dongguo
 * @date 2023/2/12
 * @description:
 */
public class TCPTest2 {
    @Test
    public void client() throws IOException {
        System.out.println("上传客户端启动");
        Socket socket = null;
        OutputStream os = null;
        FileInputStream fis = null;
        try {
            //1 创建客户端对象，明确目的地址和端口（服务端）
            socket = new Socket("192.168.122.1", 10002);
            //2 获取scoket流中的输出流，将数据发送给服务端
            os = socket.getOutputStream();

            fis = new FileInputStream(new File("背景图.jpg"));
            byte[] buffer = new byte[1024];
            int len;
            while ((len = fis.read(buffer)) != -1) {
                os.write(buffer, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4 关闭资源
            os.close();
            socket.close();
        }
    }

    @Test
    public void server() {
        System.out.println("上传服务端启动");
        ServerSocket serverSocket = null;
        Socket socket = null;
        InputStream is = null;
        try {
            //1 创建服务器对象
            serverSocket = new ServerSocket(10002);
            //2 获取客户端对象
            socket = serverSocket.accept();
            //3 通过客户端对象获取socket流的读取流
            is = socket.getInputStream();
            FileOutputStream fos = new FileOutputStream(new File("背景图-copy.jpg"));
            byte[] buf = new byte[1024];
            int len;
            while ((len = is.read(buf)) != -1) {
                fos.write(buf, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                is.close();
                socket.close();
                serverSocket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
