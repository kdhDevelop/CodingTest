package xyz.kdeDevelop.백준.S5_문자열.P1_27866;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String S = scanner.nextLine();
        int i = Integer.parseInt(scanner.nextLine());

        System.out.println(S.charAt(i-1));

        scanner.close();
    }
}
