package com.chance.decorator.example02;

import java.io.UnsupportedEncodingException;
import java.util.Base64;

public class EncryptionDataDecorator extends DataLoaderDecorator{
    public EncryptionDataDecorator(DataLoader dataLoader) {
        super(dataLoader);
    }

    @Override
    public String read() {
        return decode(super.read());
    }

    @Override
    public void write(String data) {
        super.write(encode(data));
    }

    public String encode(String data) {
        Base64.Encoder encoder = Base64.getEncoder();
        try {
            byte[] bytes = data.getBytes("utf-8");
            return encoder.encodeToString(bytes);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    public String decode(String data) {
        Base64.Decoder decoder = Base64.getDecoder();
        try {
            byte[] bytes = data.getBytes("utf-8");
            return new String(decoder.decode(data), "utf-8");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }
}
