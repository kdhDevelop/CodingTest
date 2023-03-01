package xyz.kdeDevelop.백준.S3_반복문.P3_8393;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        bufferedReader.close();

        int result = 0;
        for (int T = 1 ; T <= n ; T ++)
            result += T;

        System.out.println(result);
    }
}
