package xyz.kdeDevelop.백준.S7_2차원_배열.P2_2566;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int max = Integer.MIN_VALUE;
        int row = 0;
        int column = 0;

        for (int T0 = 0 ; T0 < 9 ; T0 ++) {
            String[] input = bufferedReader.readLine().split(" ");

            for (int T1 = 0 ; T1 < 9 ; T1 ++) {
                int number = Integer.parseInt(input[T1]);

                if (max < number) {
                    max = number;
                    row = T0;
                    column = T1;
                }
            }
        }

        System.out.println(max + "\n" + (row+1) + " " + (column+1));

        bufferedReader.close();
    }
}
