package xyz.kdeDevelop.백준.S4_1차원_배열.P9_10811;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] NMInput = bufferedReader.readLine().split(" ");


        int N = Integer.parseInt(NMInput[0]);
        int M = Integer.parseInt(NMInput[1]);

        int[] basket = new int[N];

        for (int T = 0 ; T < N ; T ++)
            basket[T] = (T+1);

        for (int T = 0 ; T < M ; T ++) {
            String[] input = bufferedReader.readLine().split(" ");

            int i = Integer.parseInt(input[0]);
            int j = Integer.parseInt(input[1]);
            int repeatTime = (int) Math.ceil((double) (j - i) / 2);

            for (int T1 = 0 ; T1 < repeatTime ; T1 ++) {
                int temp = basket[i -1];
                basket[i -1] = basket[j -1];
                basket[j -1] = temp;
                i++;
                j--;
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int temp : basket)
            stringBuilder.append(temp + " ");

        System.out.println(stringBuilder);
        bufferedReader.close();
    }
}
