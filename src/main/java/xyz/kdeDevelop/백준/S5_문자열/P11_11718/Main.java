package xyz.kdeDevelop.백준.S5_문자열.P11_11718;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        String input;
        while((input = bufferedReader.readLine()) != null && !input.isEmpty())
            bufferedWriter.write(input + "\n");

        bufferedWriter.flush();
        bufferedWriter.close();
        bufferedReader.close();
    }
}
