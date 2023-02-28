package xyz.kdeDevelop.백준.S2_조건문.P7_2480;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = bufferedReader.readLine().split(" ");
        bufferedReader.close();

        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        int c = Integer.parseInt(input[2]);

        int result = 0;

        if (a == b && b == c) {
            result += 10000;
            result += a * 1000;
        } else if (a == b || a == c) {
            result += 1000;
            result += a * 100;
        } else if (b == c) {
            result += 1000;
            result += b * 100;
        } else {
            result += Math.max(a, Math.max(b, c)) * 100;
        }

        System.out.println(result);
    }
}
