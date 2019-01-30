package com.youneed.demo1;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by admin on 2019/1/29
 * AT 9:32
 **/
public class TestStream {

    List<Employee> employees = Arrays.asList(
            new Employee("张三", 23, 1, 9900.99),
            new Employee("李四", 43, 2, 7800.99),
            new Employee("王五", 13, 3, 1200.99),
            new Employee("赵六", 56, 4, 6660.99)
    );

    @Test
    public void test() {
        this.employees.stream().filter(x -> x.getAge() > 22).distinct().sorted((o1, o2) -> {
            if (o1.getAge() == o2.getAge()) {
                return o1.getName().compareTo(o2.getName());
            } else {
                return -o1.getAge() - o2.getAge();
            }
        }).forEach(System.out::println);

        Set treeSet = new TreeSet();
        treeSet.add("adfasdf");
        treeSet.add("434");
    }
}
