package xyz.kdeDevelop.백준.S2_조건문.P5_2884;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = bufferedReader.readLine().split(" ");
        bufferedReader.close();

        int H = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);

        if (M < 45) {
            M = (60 + (M - 45));
            if (H == 0) {
                System.out.println("23 " + M);
            } else {
                System.out.println((H - 1) + " " + M);
            }
        } else {
            System.out.println(H + " " + (M - 45));
        }
    }
}
