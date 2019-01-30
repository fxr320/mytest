package com.day20.net.test;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.URL;
import java.net.UnknownHostException;

/**
 * Created by admin on 2019/1/27
 * AT 15:57
 **/
public class TestInetAddress {
    @Test
    public void test() throws UnknownHostException {
        InetAddress ip = InetAddress.getByName("www.baidu.com");
        System.out.println(ip.getHostName() + "," + ip.getHostAddress());
    }

    @Test
    public void test1() {
        BufferedReader br = null;
        try {
            URL url = new URL("http://121.41.229.47:30004/kdt/error2.jsp");
            InputStream is = url.openStream();
            InputStreamReader isr = new InputStreamReader(is, "gbk");
            br = new BufferedReader(isr);
            String str = "";
            while ((str = br.readLine()) != null) {
                System.out.println(str);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                br.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
}
