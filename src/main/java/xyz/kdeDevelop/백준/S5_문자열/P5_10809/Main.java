package xyz.kdeDevelop.백준.S5_문자열.P5_10809;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] checker = new int[26];
        String input = scanner.nextLine();

        for (int T0 = 0 ; T0 < 26 ; T0 ++)
            checker[T0] = -1;

        for (int T0 = 0 ; T0 < input.length() ; T0 ++) {
            int chrNum = (int) input.charAt(T0) - 97;

            if (checker[chrNum] == -1)
                checker[chrNum] = T0;
        }

        StringBuilder stringBuilder = new StringBuilder();
        for (int temp : checker) {
            stringBuilder.append(temp);
            stringBuilder.append(" ");
        }

        System.out.println(stringBuilder);

        scanner.close();
    }
}
