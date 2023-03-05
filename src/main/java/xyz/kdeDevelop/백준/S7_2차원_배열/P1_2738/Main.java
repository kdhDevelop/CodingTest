package xyz.kdeDevelop.백준.S7_2차원_배열.P1_2738;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] NMInput = bufferedReader.readLine().split(" ");

        int N = Integer.parseInt(NMInput[0]);
        int M = Integer.parseInt(NMInput[1]);

        int[][] result = new int[N][M];

        for (int T0 = 0 ; T0 < 2 ; T0 ++) {
            for (int T1 = 0 ; T1 < N ; T1 ++) {
                String[] input = bufferedReader.readLine().split(" ");
                for (int T2 = 0 ; T2 < input.length ; T2 ++) {
                    result[T1][T2] += Integer.parseInt(input[T2]);
                }
            }
        }

        for (int[] temp1 : result) {
            for (int temp2 : temp1) {
                bufferedWriter.write(temp2 + " ");
            }
            bufferedWriter.write("\n");
        }

        bufferedWriter.flush();
        bufferedWriter.close();
        bufferedReader.close();
    }
}
