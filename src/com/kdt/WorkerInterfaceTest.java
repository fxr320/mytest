package com.kdt;

/**
 * Created by admin on 2018/12/27
 * AT 10:12
 **/
public class WorkerInterfaceTest {

    public static void execute(WorkerInterface wi) {
        wi.doHomeWork();
    }

    public static int execute1(WorkerInterface wi) {
        return wi.doHouseWork(1, 4);
    }


    public static void main(String[] args) {

        execute(new WorkerInterface() {
            @Override
            public void doHomeWork() {
                System.out.println("sssssss");
            }

            @Override
            public int doHouseWork(int a, int b) {
                return a + b;
            }
        });
        execute1(new WorkerInterface() {
            @Override
            public void doHomeWork() {
                System.out.println("sssssss");
            }

            @Override
            public int doHouseWork(int a, int b) {
                System.out.println(a + b);
                return a + b;
            }
        });

        //execute1(() -> System.out.println("sss"));
        Runnable r  = () -> System.out.println("fadsfasf");
        System.out.println(r);

        new Thread(r).start();

//        execute(()-> System.out.println("dddddddddddd"));
//
//        //System.out.println((int a,int b)->{return a+b});
//        execute(() -> System.out.println("Hello World"));
//
//        execute((int a, int b) -> System.out.println(a+b));
    }
}
