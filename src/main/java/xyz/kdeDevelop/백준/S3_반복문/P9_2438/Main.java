package xyz.kdeDevelop.백준.S3_반복문.P9_2438;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = scanner.nextInt();

        for (int T = 1 ; T <= N ; T ++) {
            StringBuilder stringBuilder = new StringBuilder();

            for (int TI = 0 ; TI < T ; TI ++)
                stringBuilder.append("*");

            stringBuilder.append("\n");
            bufferedWriter.write(stringBuilder.toString());
        }
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
