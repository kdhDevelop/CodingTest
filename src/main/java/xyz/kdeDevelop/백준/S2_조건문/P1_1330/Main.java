package xyz.kdeDevelop.백준.S2_조건문.P1_1330;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = bufferedReader.readLine().split(" ");
        bufferedReader.close();

        int A = Integer.parseInt(input[0]);
        int B = Integer.parseInt(input[1]);

        if (A > B)
            System.out.println(">");
        else if (A < B)
            System.out.println("<");
        else
            System.out.println("==");
    }
}
