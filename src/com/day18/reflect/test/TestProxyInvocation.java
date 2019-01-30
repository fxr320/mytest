package com.day18.reflect.test;

import org.junit.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by admin on 2019/1/27
 * AT 16:19
 **/
public class TestProxyInvocation {

    @Test
    public void test1() {
        Class cl = MyClass.class;
        Class[] c = cl.getInterfaces();
        for (Class c1 : c) {
            System.out.println(c1);
        }

        MyInterFace myInterFace = new MyClass();
        System.out.println(myInterFace instanceof MyInterFace);
    }

    public static void main(String[] args) {


        MyClass real = new MyClass();
        MyInvocation mi = new MyInvocation();

        Object obj = mi.setObject(real);
        System.out.println(obj instanceof MyInterFace);
        MyInterFace mc = (MyInterFace) obj;

        mc.show();

    }

}

interface MyInterFace {
    void show();
}

class MyClass implements MyInterFace {
    @Override
    public void show() {
        System.out.println("fadsfasfasf");
    }
}

class MyInvocation implements InvocationHandler {

    Object obj;

    public Object setObject(Object obj) {

        this.obj = obj;

        return Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(), this);

    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) {
        Object obj1 = null;
        try {
            obj1 = method.invoke(obj, args);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

        return obj1;
    }
}

