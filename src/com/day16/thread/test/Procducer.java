package com.day16.thread.test;

/**
 * Created by admin on 2019/1/21
 * AT 10:34
 **/
class TestNofiy {

    public static void main(String[] args) {
        Clerk clerk = new Clerk();
        Procducer procducer = new Procducer(clerk);
        Consumer consumer = new Consumer(clerk);
        Thread p1 = new Thread(procducer);
        Thread p2 = new Thread(procducer);
        Thread c1 = new Thread(consumer);
        p1.setName("生产者1");
        p2.setName("生产者2");
        c1.setName("消费者1");
        p1.start();
         p2.start();
        c1.start();

    }

}

public class Procducer implements Runnable {

    private Clerk clerk;

    public Procducer(Clerk clerk) {
        this.clerk = clerk;
    }

    @Override
    public void run() {

        while (true) {
            this.clerk.addProduct();
        }
    }
}

class Consumer implements Runnable {

    private Clerk clerk;

    public Consumer(Clerk clerk) {
        this.clerk = clerk;
    }

    @Override
    public void run() {
        while (true) {
            try {
                //  Thread.sleep(10);
            } catch (Exception e) {
                e.printStackTrace();
            }
            this.clerk.reduceProduct();
        }
    }
}

class Clerk {

    private int product;

    public synchronized void addProduct() {
        if (this.product >= 20) {
            try {
                // System.out.println("fasdfasfd");
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } else {
            this.product++;
            System.out.println(Thread.currentThread().getName() + ",正在生产：" + this.product);
        }
        notifyAll();
    }

    public synchronized void reduceProduct() {
        if (this.product <= 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } else {
            this.product--;
            System.out.println(Thread.currentThread().getName() + ",正在消费：" + this.product);
        }
        notifyAll();
    }

}