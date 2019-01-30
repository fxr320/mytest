package com.day16.thread.test;

import org.junit.Test;

/**
 * Created by admin on 2019/1/22
 * AT 17:39
 **/
public class Test1 {
    @Test
    public void test() {
        PrintNum printNum = new PrintNum();
        Thread t1 = new Thread(printNum);
        Thread t2 = new Thread(printNum);
        Thread t3 = new Thread(printNum);
        t1.setName("A");
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setName("B");
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setName("C");
        t2.setPriority(Thread.MIN_PRIORITY);

        t1.start();
        t2.start();
        t3.start();


    }

}


class PrintNum implements Runnable {

    int printnum = 1;

    @Override
    public void run() {

        while (true) {
            synchronized (this) {
                notifyAll();
                if (printnum <= 10) {

                    System.out.println(Thread.currentThread().getName() + "" + printnum++);

                    try {
                        this.wait(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }


                }
            }
//            try {
//                Thread.sleep(100);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }

        }

    }
}