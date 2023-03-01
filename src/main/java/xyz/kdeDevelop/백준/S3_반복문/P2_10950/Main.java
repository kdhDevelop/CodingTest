package xyz.kdeDevelop.백준.S3_반복문.P2_10950;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        int inputT = Integer.parseInt(bufferedReader.readLine());

        for (int T = 0 ; T < inputT ; T ++) {
            String[] input = bufferedReader.readLine().split(" ");

            int A = Integer.parseInt(input[0]);
            int B = Integer.parseInt(input[1]);

            bufferedWriter.write((A + B) + "\n");
        }
        bufferedWriter.flush();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
