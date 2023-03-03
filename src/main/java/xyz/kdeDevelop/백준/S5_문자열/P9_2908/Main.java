package xyz.kdeDevelop.백준.S5_문자열.P9_2908;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");

        int A = getReverse(input[0]);
        int B = getReverse(input[1]);

        System.out.println(Math.max(A, B));

        scanner.close();
    }

    private static int getReverse(String input) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int T0 = input.length()-1 ; T0 >= 0 ; T0 --)
            stringBuilder.append(input.charAt(T0));

        return Integer.parseInt(stringBuilder.toString());
    }
}
