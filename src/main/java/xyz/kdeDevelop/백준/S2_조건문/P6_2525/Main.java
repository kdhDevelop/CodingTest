package xyz.kdeDevelop.백준.S2_조건문.P6_2525;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] inputAB = bufferedReader.readLine().split(" ");
        String inputC = bufferedReader.readLine();
        bufferedReader.close();

        int A = Integer.parseInt(inputAB[0]);
        int B = Integer.parseInt(inputAB[1]);
        int C = Integer.parseInt(inputC);

        A += (C / 60);
        B += (C % 60);

        if (B >= 60) {
            B -= 60;
            A ++;
        }

        if (A >= 24)
            A = A % 24;

        System.out.println(A + " " + B);
    }
}
