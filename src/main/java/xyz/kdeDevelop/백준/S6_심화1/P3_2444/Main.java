package xyz.kdeDevelop.백준.S6_심화1.P3_2444;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = Integer.parseInt(scanner.nextLine());

        StringBuilder stringBuilder = new StringBuilder();

        for (int T0 = 0 ; T0 < N-1 ; T0 ++) {
            stringBuilder.append(blankBuilder((N-1)-T0));
            stringBuilder.append(starBuilder(1+(T0*2)));
            stringBuilder.append("\n");
        }

        stringBuilder.append(starBuilder((N*2)-1));
        stringBuilder.append("\n");

        for (int T0 = N-2 ; T0 >= 0 ; T0 --) {
            stringBuilder.append(blankBuilder((N-1)-T0));
            stringBuilder.append(starBuilder(1+(T0*2)));
            stringBuilder.append("\n");
        }

        System.out.println(stringBuilder);

        scanner.close();
    }

    private static String blankBuilder(int count) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int T0 = 0 ; T0 < count ; T0 ++)
            stringBuilder.append(" ");
        return stringBuilder.toString();
    }

    private static String starBuilder(int count) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int T0 = 0 ; T0 < count ; T0 ++)
            stringBuilder.append("*");
        return stringBuilder.toString();
    }
}
