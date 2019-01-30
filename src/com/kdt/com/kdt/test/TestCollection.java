package com.kdt.com.kdt.test;

import org.junit.Test;

import java.util.*;

/**
 * Created by admin on 2019/1/12
 * AT 20:39
 **/
public class TestCollection {

    @Test
    public void test1() {
//        Collection c = new ArrayList();
//        c.add("afdasdf");
//        c.add(123);
//        c.add(new Date());
//        c.add(null);
//        c.add(new Customer("aa", 12));
//        c.add(new Customer("bb", 22));
        //System.out.println(c.contains(1233));
        //c.remove(123);
//        System.out.println(c.contains(new Customer("aa",12)));
//        System.out.println(c.isEmpty());
//        Iterator it = c.iterator();
//        while (it.hasNext()) {
//            System.out.println(it.next());
//        }
//
//        List list = new ArrayList();
//        list.add("fasdf");
//        list.add("232");
//        list.add(3234);
//        list.add(new Customer("adf", 22));
        //list.add(2, "aaa");

//        Object o = list.get(3);
//        System.out.println(o);

//        Iterator it1 = list.iterator();
//        while (it1.hasNext()) {
//            System.out.println(it1.next());
//        }

    }

    @Test
    public void test2() {
        Set set = new HashSet();
        set.add("fadsf");
        set.add("111");
        set.add("fadsfasdf");
        Customer c1 = new Customer("11", 111, new MyDate(1980, 12, 20));
        Customer c2 = new Customer("11", 111, new MyDate(1982, 11, 20));
        System.out.println("c1:" + c1.hashCode() + ",c2:" + c2.hashCode());
        set.add(c1);
        set.add(c2);
        set.add(new Customer("13", 113, new MyDate(1990, 10, 20)));
        System.out.println(set.size());
        Iterator it2 = set.iterator();
        while (it2.hasNext()) {
            System.out.println(it2.next());
        }
    }

    @Test
    public void test3() {

//        Set set = new TreeSet();
//        //set.add("1111");
//        //set.add("dfsafasf");
//        set.add(new Customer("aa", 11, new MyDate(1922, 3, 4)));
//        set.add(new Customer("aaa", 112, new MyDate(1932, 3, 4)));
//        set.add(new Customer("aaa", 112, new MyDate(1933, 3, 4)));
//
//        System.out.println(set.size());
//
//        Iterator it = set.iterator();
//        while (it.hasNext()) {
//            System.out.println(it.next());
//        }

        Map m =new HashMap();
        m.put("adf","111");
        m.put("fdsaf","1323");

//       Set key =  m.keySet();
//        for(Object o : key){
//            System.out.println(o + ","+m.get(o));
//        }

        Set<Map.Entry> entry = m.entrySet();
        for(Map.Entry en : entry){
           // Map.Entry a = (Map.Entry)en;
            System.out.println(en.getKey() + ", "+ en.getValue());
        }

    }

    @Test
    public void test4(){
//        Comparator com = new Comparator(){
//            @Override
//            public int compare(Object o1, Object o2) {
//                if(o1 instancefo Customer && o2.instanceof Customer){
//                    Customer c1 = (Customer)o1;
//                    Customer c2 = (Customer)o2;
//
//                    int i  = c1.getName().compareTo(c2.getName());
//                    if(i == 0){
//
//                    }else{
//                        return i;
//                    }
//                }
//                return 0;
//            }
//        }
    }


}

class MyDate implements Comparable {

    private int day;
    private int month;
    private int year;

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    @Override
    public String toString() {
        return "MyDate{" +
                "day=" + day +
                ", month=" + month +
                ", year=" + year +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyDate myDate = (MyDate) o;
        return day == myDate.day &&
                month == myDate.month &&
                year == myDate.year;
    }

    @Override
    public int hashCode() {
        return Objects.hash(day, month, year);
    }

    @Override
    public int compareTo(Object o) {

        if (o instanceof MyDate) {
            MyDate d = (MyDate) o;
            int i = this.year - d.year;
            if (i == 0) {
                i = this.month - d.month;
                if (i == 0) {
                    return this.day - d.day;
                } else {
                    return i;
                }
            } else {
                return i;
            }
        }

        return 0;
    }
}

class Customer implements Comparable {
    private String name;
    private int age;
    private MyDate birthday;

    public Customer() {
        super();
    }

    public Customer(String name, int age, MyDate birthday) {
        super();
        this.name = name;
        this.age = age;
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", age=" + age + '\'' + birthday +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return age == customer.age &&
                Objects.equals(name, customer.name) &&
                Objects.equals(birthday, customer.birthday);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, birthday);
    }


    @Override
    public int compareTo(Object o) {

        if (o instanceof Customer) {
            Customer c1 = (Customer) o;
            int i = this.name.compareTo(c1.name);
            if (i == 0) {
                i = this.age - c1.age;
                if (i == 0) {
                    return this.birthday.compareTo(c1.birthday);
                } else {
                    return i;
                }
            } else {
                return i;
            }

        }
        return 0;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }
}
