package com.java8;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * Created by admin on 2019/1/27
 * AT 17:00
 **/
public class lambda {

    List<Employee> employees = Arrays.asList(
            new Employee("张三", 35, 8900.99),
            new Employee("李四", 12, 9000.99),
            new Employee("王五", 28, 4000.99),
            new Employee("赵六", 47, 1100.99)
    );

    @Test
    public void test() {
        this.employees.stream().map(Employee::getAge)
                .limit(2)
                .sorted()
                .forEach(System.out::println);
        System.out.println("===============");
        this.employees.stream().filter((x) -> x.getAge() > 22).limit(2).forEach(System.out::println);
    }

    @Test
    public void test1() {
        this.happy(1000.0, (m) -> System.out.println("dfasdfasfd" + m + "大规模喹"));
    }

    private void happy(double m, Consumer<Double> c) {
        c.accept(m);
    }

    //Lambda 表达式的基础语法: JAVA8 引入了一个新的操作符“->”
    @Test
    public void test2() {
        String s = " \"fadsfa1111sdfssss ";
        char c = '\n';
        System.out.println(strTest(s, (str) -> str.trim()));
        System.out.println(strTest(s, (str) -> str.substring(4, 10)));

    }

    private String strTest(String str, Function<String, String> func) {
        return func.apply(str);
    }

    @Test
    public void test3() {
        List<String> list = Arrays.asList("111", "3434", "fsdadf", "45345", "24532");
        for (String ss : list) {
            this.getList(ss, (o) -> o.equals(ss));
        }
    }

    public void getList(String s, Predicate p) {
        String sdf = "111";
        if (p.test(sdf)) {
            System.out.println(s);
        }
    }


}
