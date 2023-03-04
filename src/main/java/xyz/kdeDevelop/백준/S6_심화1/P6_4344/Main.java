package xyz.kdeDevelop.백준.S6_심화1.P6_4344;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int C = Integer.parseInt(bufferedReader.readLine());

        StringBuilder stringBuilder = new StringBuilder();
        for (int T0 = 0 ; T0 < C ; T0 ++) {
            String[] input = bufferedReader.readLine().split(" ");

            int N = Integer.parseInt(input[0]);
            int sum = 0;
            int[] scoreArray = new int[N];
            for (int T1 = 0 ; T1 < N ; T1 ++) {
                int score = Integer.parseInt(input[T1+1]);
                scoreArray[T1] = score;
                sum += score;
            }

            int average = sum / N;
            int count = 0;
            for (int T1 = 0 ; T1 < N ; T1 ++)
                if (scoreArray[T1] > average)
                    count ++;

            double result = Math.round((double) count / (double) (input.length-1) * 100000) / 1000.0;
            stringBuilder.append(String.format("%.3f", result)).append("%").append("\n");
        }

        System.out.println(stringBuilder);

        bufferedReader.close();
    }
}
