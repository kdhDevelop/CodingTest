package xyz.kdeDevelop.백준.S3_반복문.P1_2739;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(bufferedReader.readLine());
        bufferedReader.close();

        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int T = 1 ; T < 10 ; T ++)
            bufferedWriter.write(input + " * " + T + " = " + (input * T) + "\n");

        bufferedWriter.flush();
        bufferedReader.close();
    }
}
