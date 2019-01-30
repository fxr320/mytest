package com.kdt.com.kdt.test1;

import java.util.*;

/**
 * Created by admin on 2019/1/13
 * AT 10:39
 **/
public class Dao<V> {

    private Map<String, V> map;

    public Dao() {
        map = new HashMap<>();
    }

    @MyInnation("fasdfasd")
    public void save(String id, V entry) {
        this.map.put(id, entry);
    }

    public V get(String id) {
        return this.map.get(id);
    }

    @SuppressWarnings({"fasdfasf"})
    @Deprecated
    public void update(String id, V entry) {
        this.map.put(id, entry);
    }

    public List<V> list() {

        List<V> list = new ArrayList<>();
        for (Iterator<Map.Entry<String, V>> it = this.map.entrySet().iterator(); it.hasNext(); ) {
            Map.Entry<String, V> entry = it.next();
            list.add(entry.getValue());
        }

        return list;
    }

    public void delete(String id) {
        this.map.remove(id);
    }

    public int size() {
        return this.map.size();
    }

    public <E> E getE(E entry) {
        return entry;
    }

    public <E> List<E> getList(E[] e, List<E> list) {
        for (E e1 : e) {
            list.add(e1);
        }
        return list;
    }

}
