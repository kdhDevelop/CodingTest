package xyz.kdeDevelop.백준.S9_약수와_배수와_소수.P1_5086;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            String[] input = bufferedReader.readLine().split(" ");

            int a = Integer.parseInt(input[0]);
            int b = Integer.parseInt(input[1]);

            if (a == 0 && b == 0)
                break;

            if (a % b == 0) {
                bufferedWriter.write("multiple\n");
            } else if (b % a == 0) {
                bufferedWriter.write("factor\n");
            } else {
                bufferedWriter.write("neither\n");
            }

        }

        bufferedWriter.flush();
        bufferedWriter.close();
        bufferedReader.close();
    }
}
