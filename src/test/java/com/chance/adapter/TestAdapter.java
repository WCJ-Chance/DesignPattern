package com.chance.adapter;

import com.chance.adapter.combination.SDAdapterTF;
import org.junit.Test;

public class TestAdapter {
    @Test
    public void testInheritance() {
        Computer computer = new Computer();
        SDCard sdCard = new SDCardImpl();
        System.out.println(computer.read(sdCard));

//        TFCard tfCard = new TFCardImpl();
        com.chance.adapter.inheritance.SDAdapterTF sdAdapterTF = new com.chance.adapter.inheritance.SDAdapterTF();
        System.out.println(computer.read(sdAdapterTF));
    }

    @Test
    public void testCombination() {
        Computer computer = new Computer();
        SDAdapterTF sdAdapterTF = new SDAdapterTF(new TFCardImpl());
        System.out.println(sdAdapterTF.readSD());
    }
}
