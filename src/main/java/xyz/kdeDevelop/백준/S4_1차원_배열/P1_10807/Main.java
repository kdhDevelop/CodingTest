package xyz.kdeDevelop.백준.S4_1차원_배열.P1_10807;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(bufferedReader.readLine());
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        List<Integer> input = new ArrayList<>();

        while (stringTokenizer.hasMoreTokens())
            input.add(Integer.parseInt(stringTokenizer.nextToken()));

        int find = Integer.parseInt(bufferedReader.readLine());
        int result = 0;

        for (int temp : input)
            if (temp == find)
                result ++;

        System.out.println(result);

        bufferedWriter.flush();
        bufferedWriter.close();
        bufferedReader.close();
    }
}
