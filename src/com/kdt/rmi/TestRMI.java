package com.kdt.rmi;

import java.io.Serializable;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by admin on 2019/1/17
 * AT 10:18
 **/
public class TestRMI {
    public static void main(String[] args) {
        Collection coll = new ArrayList<>();
        coll.add("Fsadfa");
        coll.add("34243");

    }
}

class Client {

    public static void main(String[] args) {


        System.out.println("客户端开始：");
        Registry registry = null;
        try {
            registry = LocateRegistry.getRegistry("127.0.0.1", 8088);
            String[] list = registry.list();
            for (String s : list) {
                System.out.println(s);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            if (registry != null) {
                IService service = (IService) registry.lookup("cmdy");
                String result = service.queryName("hahahah");
                Man man = service.queryMan();
                System.out.println("resutl from remote:" + result + "," + man.toString());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("客户端开始启动：");
    }

}

class Server {

    public static void main(String[] args) {

        System.out.println("服务端开始：");
        Registry registry = null;
        try {
            registry = LocateRegistry.createRegistry(8088);
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            IService service = new ServiceImpl();
            if (registry != null) {
                registry.rebind("cmdy", service);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("服务端注册成功");
    }

}

interface IService extends Remote {

    public String queryName(String no) throws RemoteException;

    public Man queryMan() throws RemoteException;

}

class ServiceImpl extends UnicastRemoteObject implements IService {

    private static final long serialVersionUID = 342349028340923840L;

    public ServiceImpl() throws RemoteException {
        super();
    }

    @Override
    public String queryName(String no) throws RemoteException {
        System.out.println("hello" + no);
        System.out.println("fadsfasfdasfdadsf");
        return String.valueOf(System.currentTimeMillis());

    }

    @Override
    public Man queryMan() {
        return new Man("afdsf");
    }
}

class Man implements Serializable {

    private String name;

    public Man(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Man{" +
                "name='" + name + '\'' +
                '}';
    }
}