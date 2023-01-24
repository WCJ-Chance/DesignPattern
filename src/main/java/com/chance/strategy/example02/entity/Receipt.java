package com.chance.strategy.example02.entity;

public class Receipt {

    // 回执内容
    private String message;

    // 回执类型：MT1101 MT2101 MT4101 MT8101
    private String type;

    public Receipt() {
    }

    public Receipt(String message, String type) {
        this.message = message;
        this.type = type;
    }

    public String getMessage() {
        return message;
    }

    public String getType() {
        return type;
    }
}
