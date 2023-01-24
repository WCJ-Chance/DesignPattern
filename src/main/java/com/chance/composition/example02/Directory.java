package com.chance.composition.example02;

import java.util.ArrayList;

public class Directory extends Entry{

    private ArrayList<Entry> list;
    private String name;

    public Directory(String name) {
        this.list = new ArrayList<>();
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getSize() {
        int size = 0;
        // 遍历获取文件大小
        for (Entry e : list
             ) {
            size += e.getSize();
        }
        return size;
    }

    @Override
    public void printList(String prefix) {
        System.out.println("/" + this);
        for (Entry e : list
             ) {
            e.printList("/" + name);
        }
    }

    @Override
    public Entry add(Entry e) {
        list.add(e);
        return this;
    }
}
