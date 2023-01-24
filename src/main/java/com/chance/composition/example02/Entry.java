package com.chance.composition.example02;

public abstract class Entry {
    public abstract String getName();
    public abstract int getSize();
    public abstract void printList(String prefix);
    public abstract Entry add(Entry e);

    @Override
    public String toString() {
        return getName() + "(" + getSize() + ")";
    }
}
