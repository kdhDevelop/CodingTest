package xyz.kdeDevelop.백준.S3_반복문.P12_10951;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        String input;
        while ((input = bufferedReader.readLine()) != null && !input.isEmpty()) {

            String[] inputSplit = input.split(" ");
            int A = Integer.parseInt(inputSplit[0]);
            int B = Integer.parseInt(inputSplit[1]);

            bufferedWriter.write((A + B) + "\n");
        }

        bufferedWriter.flush();
        bufferedWriter.close();
        bufferedReader.close();
    }
}
