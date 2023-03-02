package xyz.kdeDevelop.백준.S4_1차원_배열.P6_10813;

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
            basket[T] = T+1;

        for (int T = 0 ; T < M ; T ++) {
            String[] ijInput = bufferedReader.readLine().split(" ");
            int i = Integer.parseInt(ijInput[0])-1;
            int j = Integer.parseInt(ijInput[1])-1;

            int temp = basket[i];
            basket[i] = basket[j];
            basket[j] = temp;
        }

        StringBuilder stringBuilder = new StringBuilder();

        for (int temp : basket)
            stringBuilder.append(temp + " ");

        System.out.println(stringBuilder);

        bufferedReader.close();
    }
}
