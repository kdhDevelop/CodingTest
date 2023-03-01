package xyz.kdeDevelop.백준.S3_반복문.P5_25314;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        StringBuilder stringBuilder = new StringBuilder();
        for (int T = 0 ; T < N / 4 ; T ++)
            stringBuilder.append("long ");

        stringBuilder.append("int");

        System.out.println(stringBuilder);
    }
}
