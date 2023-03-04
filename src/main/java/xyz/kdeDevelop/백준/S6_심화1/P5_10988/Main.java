package xyz.kdeDevelop.백준.S6_심화1.P5_10988;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        StringBuilder stringBuilder = new StringBuilder();

        for (int T0 = input.length()-1 ; T0 >= 0 ; T0 --)
            stringBuilder.append(input.charAt(T0));

        String result = stringBuilder.toString();

        if (input.equals(result))
            System.out.println(1);
        else
            System.out.println(0);

        scanner.close();
    }
}
