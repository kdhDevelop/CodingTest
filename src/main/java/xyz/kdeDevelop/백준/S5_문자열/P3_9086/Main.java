package xyz.kdeDevelop.백준.S5_문자열.P3_9086;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(bufferedReader.readLine());

        StringBuilder stringBuilder = new StringBuilder();
        for (int T0 = 0 ; T0 < T ; T0 ++) {
            String input = bufferedReader.readLine();

            stringBuilder.append(input.charAt(0));
            stringBuilder.append(input.charAt(input.length()-1));
            stringBuilder.append("\n");
        }

        System.out.println(stringBuilder);

        bufferedReader.close();
    }
}
