package xyz.kdeDevelop.백준.S5_문자열.P4_11720;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = Integer.parseInt(scanner.nextLine());
        int result = 0;

        String input = scanner.nextLine();

        for (int T0 = 0 ; T0 < N ; T0 ++)
            result += Integer.parseInt(String.valueOf(input.charAt(T0)));

        System.out.println(result);

        scanner.close();
    }
}
