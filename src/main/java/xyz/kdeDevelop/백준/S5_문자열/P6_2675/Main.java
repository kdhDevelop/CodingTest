package xyz.kdeDevelop.백준.S5_문자열.P6_2675;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(bufferedReader.readLine());

        for (int T0 = 0 ; T0 < T ; T0 ++) {
            String[] input = bufferedReader.readLine().split(" ");
            int TI = Integer.parseInt(input[0]);

            StringBuilder stringBuilder = new StringBuilder();
            for (int T1 = 0 ; T1 < input[1].length() ; T1 ++) {
                for (int T2 = 0 ; T2 < TI ; T2 ++) {
                    stringBuilder.append(input[1].charAt(T1));
                }
            }
            bufferedWriter.write(stringBuilder.toString());
            bufferedWriter.write("\n");
        }

        bufferedWriter.flush();
        bufferedWriter.close();
        bufferedReader.close();
    }
}
