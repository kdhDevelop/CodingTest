package xyz.kdeDevelop.백준.S3_반복문.P4_25304;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int X = Integer.parseInt(bufferedReader.readLine());
        int N = Integer.parseInt(bufferedReader.readLine());

        int result = 0;
        for (int T = 0 ; T < N ; T ++) {
            String[] input = bufferedReader.readLine().split(" ");

            int a = Integer.parseInt(input[0]);
            int b = Integer.parseInt(input[1]);

            result += (a * b);
        }
        bufferedReader.close();

        if (X == result)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
