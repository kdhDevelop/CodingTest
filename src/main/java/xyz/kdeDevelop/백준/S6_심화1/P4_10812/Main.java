package xyz.kdeDevelop.백준.S6_심화1.P4_10812;

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

        for (int T0 = 0 ; T0 < N ; T0 ++)
            basket[T0] = T0+1;

        for (int T0 = 0 ; T0 < M ; T0 ++) {
            String[] ijkInput = bufferedReader.readLine().split(" ");
            int i = Integer.parseInt(ijkInput[0])-1;
            int j = Integer.parseInt(ijkInput[1])-1;
            int k = Integer.parseInt(ijkInput[2])-1;

            for (int T1 = 0 ; T1 < (k-i) ; T1 ++) {
                int tmp = basket[i];
                for (int T2 = i; T2 < j; T2++)
                    basket[T2] = basket[T2 + 1];
                basket[j] = tmp;
            }
        }

        StringBuilder stringBuilder = new StringBuilder();
        for (int temp : basket)
            stringBuilder.append(temp).append(" ");
        System.out.println(stringBuilder);

        bufferedReader.close();
    }
}
