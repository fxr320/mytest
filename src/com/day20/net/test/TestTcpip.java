package com.day20.net.test;

import org.junit.Test;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by admin on 2019/1/27
 * AT 16:14
 **/
public class TestTcpip {
    @Test
    public void client() {

        try {

            Socket socket = new Socket("127.0.0.1", 9999);
            OutputStream os = socket.getOutputStream();
            os.write("你好！".getBytes("utf-8"));
            os.close();
            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void server() {

        try {
            ServerSocket ss = new ServerSocket(9999);
            Socket socket = ss.accept();
            InputStream is = socket.getInputStream();
            byte[] b = new byte[1024];
            int len;
            while ((len = is.read(b)) != -1) {
                System.out.println(new String(b, 0, len));
            }
            is.close();
            socket.close();
            ss.close();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
