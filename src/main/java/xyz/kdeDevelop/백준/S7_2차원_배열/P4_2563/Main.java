package xyz.kdeDevelop.백준.S7_2차원_배열.P4_2563;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int paperCount = Integer.parseInt(bufferedReader.readLine());
        boolean[][] paper = new boolean[100][100];

        for (int T0 = 0 ; T0 < paperCount ; T0 ++) {
            String[] input = bufferedReader.readLine().split(" ");

            int a = Integer.parseInt(input[0]);
            int b = Integer.parseInt(input[1]);

            for (int T1 = a ; T1 < a+10 ; T1 ++)
                for (int T2 = b ; T2 < b+10 ; T2 ++)
                    paper[T1][T2] = true;
        }

        int result = 0;
        for (int T0 = 0 ; T0 < 100 ; T0 ++)
            for (int T1 = 0 ; T1 < 100 ; T1 ++)
                if (paper[T0][T1])
                    result ++;

        System.out.println(result);

        bufferedReader.close();
    }
}
