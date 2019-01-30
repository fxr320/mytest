package com.day15.io.test;

import org.junit.Test;

import java.io.*;

/**
 * Created by admin on 2019/1/17
 * AT 8:28
 **/
public class TestObjectStream {


    @Test
    public void test2() {

        RandomAccessFile raf = null;
        try {
            raf = new RandomAccessFile("access.txt", "rw");
            raf.write("abcdef\n".getBytes());
            raf.write("12345".getBytes());
            System.out.println(raf.getFilePointer());
            //raf.write(1000);
            raf.writeUTF("fasdfasdfasdfasdfsadfasdfasf");
            System.out.println(raf.getFilePointer());
            raf.seek(0);
            byte[] b = new byte[5];
            int len = 0;
            while ((len = raf.read(b)) != -1) {
                System.out.print(new String(b, 0, len));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                raf.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

    @Test
    public void test1() {

        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream("person.txt"));
            Person p1 = (Person) ois.readObject();
            System.out.println(p1);
            Person p2 = (Person) ois.readObject();
            System.out.println(p2);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                ois.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

    @Test
    public void test() {
        ObjectOutputStream oos = null;
        try {
            FileOutputStream fos = new FileOutputStream("person.txt");
            oos = new ObjectOutputStream(fos);
            Person p1 = new Person("dfasdf", 11);
            Person p2 = new Person("111", 22);
            oos.writeObject(p1);
            oos.flush();
            oos.writeObject(p2);
            oos.flush();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                oos.close();
            } catch (Exception e1) {
                e1.printStackTrace();
            }
        }

    }
}

class Person implements Serializable {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
