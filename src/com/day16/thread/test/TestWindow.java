package com.day16.thread.test;

/**
 * Created by admin on 2019/1/18
 * AT 13:58
 **/
public class TestWindow implements Runnable {

    private int ticket = 100;
    Object o = new Object();

    @Override
    public void run() {

        while(true){
            synchronized(o){
                o.notifyAll();
                if(ticket > 0 ){
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + ","+ ticket--);
                }else{
                    break;
                }

                try {
                    o.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    public static void main(String[] args) {

        TestWindow w = new TestWindow();
        Thread t1 = new Thread(w);
        Thread t2 = new Thread(w);
        t1.setName("线程a");
        t2.setName("线程b");
        t1.start();
        t2.start();

    }
}
