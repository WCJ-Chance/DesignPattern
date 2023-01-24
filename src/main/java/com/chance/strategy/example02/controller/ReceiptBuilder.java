package com.chance.strategy.example02.controller;

import com.chance.strategy.example02.entity.Receipt;

import java.util.ArrayList;
import java.util.List;

public class ReceiptBuilder {
    public static List<Receipt> getReceiptList() {
        List<Receipt> list = new ArrayList<>();
        list.add(new Receipt("MT1101回执信息", "MT1101"));
        list.add(new Receipt("MT2101回执信息", "MT2101"));
        list.add(new Receipt("MT4101回执信息", "MT4101"));
        list.add(new Receipt("MT8101回执信息", "MT8101"));
        return list;
    }
}
