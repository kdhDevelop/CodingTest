package xyz.kdeDevelop.백준.S9_약수와_배수와_소수.P6_11653;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = Integer.parseInt(scanner.nextLine());

        List<Integer> prime = new ArrayList<>();

        int tmpN = N;
        while (tmpN != 1) {
            for (int T0 = 2; T0 <= tmpN; T0++) {
                if (tmpN % T0 == 0) {
                    tmpN /= T0;
                    prime.add(T0);
                    break;
                }
            }
        }

        StringBuilder stringBuilder = new StringBuilder();
        for (Integer temp : prime)
            stringBuilder.append(temp).append("\n");

        System.out.println(stringBuilder);

        scanner.close();
    }
}
