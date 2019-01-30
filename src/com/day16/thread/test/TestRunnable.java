package com.day16.thread.test;


import com.kdt.Man;
import org.junit.Test;

import java.net.URLClassLoader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by admin on 2019/1/18
 * AT 9:39
 **/
public class TestRunnable {

    @Test
    public void test() {

        String[] str = new String[]{"c","v","sa","fd","333","afd","2343"};
        List<String> list = Arrays.asList(str);
        Stream stream = Arrays.stream(str);
        long l = stream.count();
        Stream s = Stream.of(str);
        System.out.println(s);
        System.out.println(l);
        f1();
    }

    private void f1(){
        System.out.println("Fadsf");
    }


    public static void main(String[] args) {

        Windows w = new Windows();
        Thread t1 = new Thread(w);
        Thread t2 = new Thread(w);
        Thread t3 = new Thread(w);

        t1.start();
        t2.start();
        t3.start();

    }


}

class Windows implements Runnable {

    private int ticket = 100;

    @Override
    public void run() {
        while (true) {
            synchronized(this) {
                if (ticket > 0) {
                    try {
                        Thread.sleep(10);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + ":车票：" + ticket--);
                }
            }
        }
    }
}


