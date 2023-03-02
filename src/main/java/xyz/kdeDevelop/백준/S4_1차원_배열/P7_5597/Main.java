package xyz.kdeDevelop.백준.S4_1차원_배열.P7_5597;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        Set<Integer> atte = new HashSet<>();

        for (int T = 1 ; T <= 30 ; T ++)
            atte.add(T);

        for (int T = 0 ; T < 28 ; T ++)
            atte.remove(Integer.parseInt(bufferedReader.readLine()));

        for (Integer temp : atte)
            System.out.println(temp);

        bufferedReader.close();
    }
}
