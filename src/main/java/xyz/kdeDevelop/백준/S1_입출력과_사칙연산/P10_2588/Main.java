package xyz.kdeDevelop.백준.S1_입출력과_사칙연산.P10_2588;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int inputA = Integer.parseInt(bufferedReader.readLine());
        String inputB = bufferedReader.readLine();
        bufferedReader.close();

        for (int T = inputB.length() - 1 ; T >= 0 ; T --) {
            int temp = Integer.parseInt(String.valueOf(inputB.charAt(T)));

            System.out.println(inputA * temp);
        }

        System.out.println(inputA * Integer.parseInt(inputB));
    }
}
