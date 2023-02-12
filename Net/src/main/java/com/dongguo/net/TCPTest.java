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
public class TCPTest {
    @Test
    public void client() throws IOException {
        System.out.println("客户端启动");
        Socket socket = null;
        OutputStream os = null;
        try {
            //1 创建客户端对象，明确目的地址和端口（服务端）
            socket = new Socket("192.168.122.1", 10002);
            //2 获取scoket流中的输出流，将数据发送给服务端
            os = socket.getOutputStream();
            //3 通过输出流写数据
            os.write("TCP通信，我是客户端".getBytes());
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
        System.out.println("服务器启动");
        ServerSocket serverSocket = null;
        Socket socket = null;
        InputStream is = null;
        ByteArrayOutputStream baos = null;
        try {
            //1 创建服务器对象
            serverSocket = new ServerSocket(10002);
            //2 获取客户端对象
            socket = serverSocket.accept();
            //3 通过客户端对象获取socket流的读取流
            is = socket.getInputStream();
            //不建议这样写 容易出现中文乱码
//            byte[] buf = new byte[1024];
//            int len = is.read(buf);
//            String str = new String(buf, 0, len);
//            System.out.println(str);

            baos = new ByteArrayOutputStream();
            byte[] buf = new byte[10];
            int len;
            while ((len = is.read(buf)) != -1) {
                baos.write(buf, 0, len);
            }
            System.out.println(baos.toString());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                baos.close();
                is.close();
                socket.close();
                serverSocket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
