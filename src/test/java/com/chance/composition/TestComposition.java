package com.chance.composition;

import com.chance.composition.example02.Directory;
import com.chance.composition.example02.File;
import org.junit.Test;

public class TestComposition {
    @Test
    public void test() {
        Directory root = new Directory("root");
        Directory bin = new Directory("bin");
        Directory tmp = new Directory("tmp");
        Directory usr = new Directory("usr");
        File vi = new File("vi", 1);
        File test = new File("test", 2);
        Directory mysql = new Directory("mysql");
        File my_conf = new File("my.conf", 3);
        File test_db = new File("test.db", 4);
        root.add(bin);
        root.add(tmp);
        root.add(usr);
        bin.add(vi);
        bin.add(test);
        usr.add(mysql);
        mysql.add(my_conf);
        mysql.add(test_db);

        root.printList("");
    }
}
