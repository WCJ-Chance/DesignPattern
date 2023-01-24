package com.chance.decorator.example02;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class BaseFileDataLoader implements DataLoader{

    private String filePath;

    public BaseFileDataLoader(String filePath) {
        this.filePath = filePath;
    }

    // 读
    @Override
    public String read() {
        try {
            String result = FileUtils.readFileToString(new File(filePath), "utf-8");
            return result;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    // 写
    @Override
    public void write(String data) {
        try {
            FileUtils.writeStringToFile(new File(filePath), data , "utf-8");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
