package xyz.kdeDevelop.백준.S9_약수와_배수와_소수.P5_2581;

import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int M = Integer.parseInt(scanner.nextLine());
        int N = Integer.parseInt(scanner.nextLine());

        int result = 0;
        int min = 0;

        for (int T0 = M ; T0 <= N ; T0 ++) {
            //System.out.print("T0 : " + T0 + " ");

            TreeSet<Integer> divisor = new TreeSet<>();

            for (int T1 = 1 ; T1 <= N ; T1 ++)
                if (T0 % T1 == 0)
                    divisor.add(T1);

            //System.out.print("BEFORE RESULT : " + result + " ");
            if (divisor.size() == 2) {
                result += T0;
                if (min == 0) {
                    min = T0;
                }
            }
            //System.out.print("AFTER RESULT : " + result + " ");
            //System.out.println("AFTER MIN : " + min);
        }

        if (result == 0)
            System.out.println(-1);
        else {
            System.out.println(result + "\n" + min);
        }

        scanner.close();
    }
}
