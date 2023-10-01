package com.motalib;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class GradleTutorial {
    public static void main(String[] args) throws IOException {
        System.out.println("printing from main class");


        String language = args[0];

        InputStream resourceStream = GradleTutorial.class.getClassLoader().getResourceAsStream(language + ".txt");
        assert resourceStream != null;
        BufferedReader bufferedInputStream = new BufferedReader(new InputStreamReader(resourceStream, StandardCharsets.UTF_8));

        System.out.println(bufferedInputStream.readLine());


    }
}
