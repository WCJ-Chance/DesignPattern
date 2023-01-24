package com.chance.singleton.hungry;

public class TestHungry {

    @org.junit.Test
    public void testSingleton() {
        Hungry instance1 = Hungry.getInstance();
        Hungry instance2 = Hungry.getInstance();
        System.out.println(instance1 == instance2);
    }
}
