package xyz.kdeDevelop.백준.S4_1차원_배열.P4_2562;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String input;
        int inputCount = 0;

        int max = Integer.MIN_VALUE;
        int count = 0;

        while ((input = bufferedReader.readLine()) != null && !input.isEmpty()) {
            inputCount ++;
            int number = Integer.parseInt(input);

            if (max < number) {
                max = number;
                count = inputCount;
            }
        }

        System.out.println(max + "\n" + count);
        bufferedReader.close();
    }
}
