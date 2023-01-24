package com.chance.adapter;

public class SDCardImpl implements SDCard{
    @Override
    public String readSD() {
        return "sd card reading data";
    }

    @Override
    public void writeSD(String msg) {
        System.out.println("sd card writing data: " + msg);
    }
}
