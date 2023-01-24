package com.chance.decorator;

import com.chance.decorator.example02.BaseFileDataLoader;
import com.chance.decorator.example02.DataLoader;
import com.chance.decorator.example02.DataLoaderDecorator;
import com.chance.decorator.example02.EncryptionDataDecorator;
import org.junit.Test;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class TestDecorator {
    @Test
    public void testEncryptionDataDecorator() {
        String info = "你好,hello 世界 World！";
        DataLoader baseFileDataLoader = new BaseFileDataLoader(
                "/Users/chancewang/Documents/Code/Java/DesignPattern/src/main/resources/TestFile"
        );
        DataLoader encryptionDataDecorator = new EncryptionDataDecorator(baseFileDataLoader);
        encryptionDataDecorator.write(info);
        System.out.println(encryptionDataDecorator.read());
    }
}
