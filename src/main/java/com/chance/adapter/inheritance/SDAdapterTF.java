package com.chance.adapter.inheritance;

import com.chance.adapter.SDCard;
import com.chance.adapter.TFCardImpl;

public class SDAdapterTF extends TFCardImpl implements SDCard {
    @Override
    public String readSD() {
        return readTF();
    }

    @Override
    public void writeSD(String msg) {
        writeTF(msg);
    }

    @Override
    public String readTF() {
        return super.readTF();
    }

    @Override
    public void writeTF(String msg) {
        super.writeTF(msg);
    }
}
