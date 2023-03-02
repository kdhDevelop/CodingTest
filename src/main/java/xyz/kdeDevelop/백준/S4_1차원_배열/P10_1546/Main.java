package xyz.kdeDevelop.백준.S4_1차원_배열.P10_1546;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine());
        int sum = 0;
        String[] input = bufferedReader.readLine().split(" ");
        TreeSet<Integer> scores = new TreeSet<>();

        for (String temp : input) {
            int score = Integer.parseInt(temp);
            scores.add(score);
            sum += score;
        }

        System.out.println(((((double) sum / (double) N) / scores.last()) * 100));

        bufferedReader.close();
    }
}
