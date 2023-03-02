package xyz.kdeDevelop.백준.S4_1차원_배열.P3_10818;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String N = bufferedReader.readLine();
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        while (stringTokenizer.hasMoreTokens()) {
            int number = Integer.parseInt(stringTokenizer.nextToken());

            min = Math.min(min, number);
            max = Math.max(max, number);
        }

        System.out.println(min + " " + max);


        bufferedReader.close();
    }
}
