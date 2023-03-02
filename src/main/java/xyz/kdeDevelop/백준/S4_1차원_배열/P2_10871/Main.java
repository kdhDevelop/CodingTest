package xyz.kdeDevelop.백준.S4_1차원_배열.P2_10871;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] inputA = bufferedReader.readLine().split(" ");

        int N = Integer.parseInt(inputA[0]);
        int X = Integer.parseInt(inputA[1]);

        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        while (stringTokenizer.hasMoreTokens()) {
            int A = Integer.parseInt(stringTokenizer.nextToken());

            if (A < X) {
                bufferedWriter.write(A + " ");
            }
        }


        bufferedWriter.flush();
        bufferedWriter.close();
        bufferedReader.close();
    }
}
