package xyz.kdeDevelop.백준.S7_2차원_배열.P3_10798;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] resultArray = new String[15];

        for (int T0 = 0 ; T0 < 5 ; T0 ++) {
            String input = bufferedReader.readLine();

            for (int T1 = 0 ; T1 < input.length() ; T1 ++) {
                if (resultArray[T1] == null)
                    resultArray[T1] = "";
                resultArray[T1] = resultArray[T1].concat(String.valueOf(input.charAt(T1)));
            }
        }

        StringBuilder stringBuilder = new StringBuilder();
        for (String temp0 : resultArray) {
            if (temp0 != null)
                stringBuilder.append(temp0);
        }

        System.out.println(stringBuilder);

        bufferedReader.close();
    }
}
