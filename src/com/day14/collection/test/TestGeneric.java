package com.day14.collection.test;

/**
 * Created by admin on 2019/1/22
 * AT 23:39
 **/
public interface TestGeneric<T> {
    public T getT();
}

class TestG implements TestGeneric<String>{
    @Override
    public String getT() {
        return "fdsafasdf";
    }

    public static void main(String[] args) {
        TestG t = new TestG();
        System.out.println(t.getT());
    }
}
