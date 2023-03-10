package xyz.kdeDevelop.백준.S9_약수와_배수와_소수.P4_1978;

import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer.parseInt(scanner.nextLine());
        String[] NInput = scanner.nextLine().split(" ");

        int result = 0;
        for (String temp : NInput) {
            int N = Integer.parseInt(temp);

            if (N == 0)
                continue;

            TreeSet<Integer> divisor = new TreeSet<>();

            for (int T0 = 1 ; T0 <= N ; T0 ++)
                if (N % T0 == 0)
                    divisor.add(T0);

            if (divisor.size() == 2)
                result ++;
        }

        System.out.println(result);

        scanner.close();
    }
}
