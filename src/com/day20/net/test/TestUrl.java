package com.day20.net.test;

import org.junit.Test;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

/**
 * Created by admin on 2019/1/29
 * AT 15:36
 **/
public class TestUrl {

    @Test
    public void test() {

        try {
            URL url = new URL("https://www.cnblogs.com/shijiaqi1066/p/3753224.html");
            System.out.println("getAuthority:" + url.getAuthority());
            System.out.println("getFile:" + url.getFile());
            System.out.println("getHost:" + url.getHost());
            System.out.println("query:" + url.getQuery());
            System.out.println("port:" + url.getPort());
            System.out.println(url.getProtocol());
            URLConnection urlConnection = url.openConnection();
            HttpURLConnection httpURLConnection = (HttpURLConnection) urlConnection;
            urlConnection.setDoInput(true);
            urlConnection.setDoOutput(true);
            urlConnection.setReadTimeout(1000);
            urlConnection.setConnectTimeout(1000);
            httpURLConnection.setRequestMethod("POST");
            urlConnection.connect();

//            System.out.println(urlConnection.getContentType());
//            System.out.println(urlConnection.getContentLength());
//            System.out.println(urlConnection.getContentEncoding());
//            System.out.println(new Date(urlConnection.getDate()));
//            System.out.println(new Date(urlConnection.getExpiration()));
//            System.out.println(new Date(urlConnection.getLastModified()));
//            System.out.println(urlConnection.getHeaderFields());
//            System.out.println(httpURLConnection.getResponseMessage());
//            System.out.println(httpURLConnection.getRequestMethod());

            OutputStream os = httpURLConnection.getOutputStream();
            os.write("ssss".getBytes());
            os.close();

            InputStream in = urlConnection.getInputStream();
            byte[] b = new byte[1024];
            int len;
            while ((len = in.read(b)) != -1) {
                System.out.println(new String(b, 0, len));
            }
            in.close();




//            System.out.println(urlConnection.getReadTimeout());
//            System.out.println(urlConnection.getConnectTimeout());


        } catch (Exception e) {
            e.printStackTrace();
        } finally {

        }


    }
}
