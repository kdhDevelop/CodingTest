package xyz.kdeDevelop.백준.S3_반복문.P8_11022;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int inputT = Integer.parseInt(bufferedReader.readLine());

        for (int T = 1 ; T <= inputT ; T ++) {
            String[] input = bufferedReader.readLine().split(" ");
            int A = Integer.parseInt(input[0]);
            int B = Integer.parseInt(input[1]);
            int C = A + B;

            bufferedWriter.write("Case #" + T + ": " + A + " + " + B + " = " + C + "\n");
        }

        bufferedWriter.flush();
        bufferedWriter.close();
        bufferedReader.close();
    }
}
