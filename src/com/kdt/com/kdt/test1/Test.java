package com.kdt.com.kdt.test1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by admin on 2019/1/13
 * AT 10:39
 **/
public class Test {

    public static void main(String[] args) {

        Dao dao = new Dao<>();
        dao.save("111",new User(111,"fasdf",23));
        dao.save("112",new User(112,"aaaaa",24));
        dao.save("113",new User(113,"bbb",25));

        System.out.println(dao.size());

        List<User> list = dao.list();

        Iterator<User> it = list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println();
        User u = (User)dao.get("111");
        System.out.println(u);

        dao.delete("112");
        System.out.println(dao.size());

        //dao.update();
        User u1 = (User)dao.getE(new User(11,"322",22));
        System.out.println(u1);

        User[] us = new User[]{new User(1,"dd",2),new User(2,"fd",3)};
        List<User> listu = new ArrayList<User>();
        List<User> list2 = dao.getList(us,listu);
        System.out.println(list2);

        List<Object> listo = new ArrayList<>();
        List<String> lists = new ArrayList<>();
        //listo = lists;
        List<?> listss = lists;
//        listss.add("afsdfa");
//        listss.add(1111);
        listss.add(null);
        System.out.println(listss);
    }

}
