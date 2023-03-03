package xyz.kdeDevelop.백준.S5_문자열.P8_1152;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        StringTokenizer stringTokenizer = new StringTokenizer(input);
        int result = 0;
        while(stringTokenizer.hasMoreTokens()) {
            stringTokenizer.nextToken();
            result ++;
        }

        System.out.println(result);


        scanner.close();
    }
}
