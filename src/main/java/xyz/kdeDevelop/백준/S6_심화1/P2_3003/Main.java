package xyz.kdeDevelop.백준.S6_심화1.P2_3003;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");

        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append(1 - Integer.parseInt(input[0]));
        stringBuilder.append(" ");
        stringBuilder.append(1 - Integer.parseInt(input[1]));
        stringBuilder.append(" ");
        stringBuilder.append(2 - Integer.parseInt(input[2]));
        stringBuilder.append(" ");
        stringBuilder.append(2 - Integer.parseInt(input[3]));
        stringBuilder.append(" ");
        stringBuilder.append(2 - Integer.parseInt(input[4]));
        stringBuilder.append(" ");
        stringBuilder.append(8 - Integer.parseInt(input[5]));

        System.out.println(stringBuilder);

        scanner.close();

    }
}
