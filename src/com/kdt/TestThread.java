package com.kdt;

/**
 * Created by admin on 2018/12/29
 * AT 11:53
 **/
public class TestThread {

    public static void main(String[] args) {

        SellerTicket st = new SellerTicket();

        new Thread(st).start();
        new Thread(st).start();
        new Thread(st).start();

    }

}


class SellerTicket implements Runnable {

    private int ticket = 100;

    @Override
    public void run() {

        for (int i = 0; i < 100; i++) {

            if (ticket > 0) {

                System.out.println(Thread.currentThread().getName() + "卖票" + "tiket=" + ticket--);
            } else {
                //System.out.println(Thread.currentThread().getName()+"卖完了");
            }

        }

    }
}