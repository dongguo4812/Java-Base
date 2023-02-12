package com.dongguo.net;

import org.junit.jupiter.api.Test;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author dongguo
 * @date 2023/2/12
 * @description:
 */
public class InetAddressTest {
    @Test
    public void test(){
        try {
            //获取本机ip
            InetAddress address = InetAddress.getLocalHost();
            String hostName = address.getHostName();
            String hostAddress = address.getHostAddress();

            System.out.println(address);
            System.out.println(hostName);
            System.out.println(hostAddress);
            //通过ip获取
            InetAddress address2= InetAddress.getByName("192.168.122.1");
            System.out.println(address2);

            InetAddress address3= InetAddress.getByName("127.0.0.1");
            System.out.println(address3);
            //通过域名获取
            InetAddress address4= InetAddress.getByName("www.baidu.com");
            System.out.println(address4);
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
