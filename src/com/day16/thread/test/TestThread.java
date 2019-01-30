package com.day16.thread.test;

import org.junit.Test;

/**
 * Created by admin on 2019/1/17
 * AT 9:00
 **/
public class TestThread {

    public static void main(String[] args) {

        SubThread t = new SubThread();
        t.start();

        for (int i = 1; i < 100; i++) {

            System.out.println(Thread.currentThread().getName() + "," + i);

        }
    }

}

class SubThread extends Thread {

    @Override
    public void run() {

        for (int i = 1; i < 100; i++) {

            System.out.println(Thread.currentThread().getName() + "," + i);

        }

    }
}