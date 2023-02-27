package xyz.kdeDevelop.백준.S1_입출력과_사칙연산.P8_18108;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String input = bufferedReader.readLine();
        bufferedReader.close();

        System.out.println(Integer.parseInt(input) - 543);
    }
}
