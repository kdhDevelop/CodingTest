package xyz.kdeDevelop.백준.S5_문자열.P10_5622;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int result = 0;

        for (int T0 = 0 ; T0 < input.length() ; T0 ++) {
            int number = getNumber(input.charAt(T0));
            result += number+1;
        }

        System.out.println(result);

        scanner.close();
    }

    private static int getNumber(int input) {
        if (input < 68)
            return 2;
        else if (input < 71)
            return 3;
        else if (input < 74)
            return 4;
        else if (input < 77)
            return 5;
        else if (input < 80)
            return 6;
        else if (input < 84)
            return 7;
        else if (input < 87)
            return 8;
        else if (input < 91)
            return 9;

        return 0;
    }
}
