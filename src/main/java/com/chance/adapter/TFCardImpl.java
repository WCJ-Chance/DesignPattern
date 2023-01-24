package com.chance.adapter;

public class TFCardImpl implements TFCard{
    @Override
    public String readTF() {
        return "tf card reading data";
    }

    @Override
    public void writeTF(String msg) {
        System.out.println("tf card writing data: " + msg);
    }
}
