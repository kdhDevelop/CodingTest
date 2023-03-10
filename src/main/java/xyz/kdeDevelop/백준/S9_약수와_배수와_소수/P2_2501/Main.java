package xyz.kdeDevelop.백준.S9_약수와_배수와_소수.P2_2501;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] NKInput = scanner.nextLine().split(" ");
        int N = Integer.parseInt(NKInput[0]);
        int K = Integer.parseInt(NKInput[1]);

        TreeSet<Integer> divisor = new TreeSet<>();

        for (int T0 = 1 ; T0 <= N ; T0 ++)
            if (N % T0 == 0)
                divisor.add(T0);

        if (divisor.size() < K)
            System.out.println(0);
        else {
            Iterator<Integer> itr = divisor.iterator();

            for (int T1 = 0 ; T1 < K-1 ; T1 ++)
                itr.next();

            System.out.println(itr.next());
        }

        scanner.close();
    }
}
