package com.example.task03;

import java.io.*;
import java.nio.charset.Charset;

public class Task03Main {
    public static void main(String[] args) throws IOException {

        System.out.println(readAsString(new FileInputStream("task03/src/test/resources/input.test"), Charset.forName("KOI8-R")));

    }

    public static String readAsString(InputStream inputStream, Charset charset) throws IOException {
        if (inputStream == null) {
            throw new IllegalArgumentException("inputStream cannot be null");
        }

        if (charset == null) {
            throw new IllegalArgumentException("charset cannot be null");
        }

        int currentByte;
        StringBuilder result = new StringBuilder();

        try (Reader reader = new InputStreamReader(inputStream, charset)) {
            while ((currentByte = reader.read()) != -1) {
                char character = (char) currentByte;
                result.append(character);
            }
        }

        return result.toString();
    }
}
