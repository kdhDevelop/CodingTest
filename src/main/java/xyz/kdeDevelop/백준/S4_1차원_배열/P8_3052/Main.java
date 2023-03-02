package xyz.kdeDevelop.백준.S4_1차원_배열.P8_3052;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        Set<Integer> result = new HashSet<>();

        for (int T = 0 ; T < 10 ; T ++)
            result.add((Integer.parseInt(bufferedReader.readLine())%42));

        System.out.println(result.size());

        bufferedReader.close();
    }
}
