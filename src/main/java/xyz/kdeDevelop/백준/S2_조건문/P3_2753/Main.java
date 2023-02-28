package xyz.kdeDevelop.백준.S2_조건문.P3_2753;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(bufferedReader.readLine());
        bufferedReader.close();

        if ((input % 4) == 0) {
            if ((input % 100) != 0 || (input % 400) == 0) {
                System.out.println("1");
                return;
            }
        }
        System.out.println("0");
    }
}
