package xyz.kdeDevelop.백준.S6_심화1.P7_2941;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int result = 0;
        for (int T0 = 0 ; T0 < input.length() ; T0 ++) {
            char chr = input.charAt(T0);

            if (T0 != input.length()-1) {
                char nextChr = input.charAt(T0+1);
                if (chr == 'c') {
                    if (nextChr == '=' || nextChr == '-') {
                        result ++;
                        T0 ++;
                        continue;
                    }
                }
                if (chr == 'd') {
                    if (nextChr == 'z') {
                        if (T0 != input.length()-2) {
                            char tmp = input.charAt(T0+2);
                            if (tmp == '=') {
                                result ++;
                                T0 += 2;
                                continue;
                            }
                        }
                    }
                    if (nextChr == '-') {
                        result ++;
                        T0 ++;
                        continue;
                    }
                }
                if (chr == 'l') {
                    if (nextChr == 'j') {
                        result ++;
                        T0 ++;
                        continue;
                    }
                }
                if (chr == 'n') {
                    if (nextChr == 'j') {
                        result ++;
                        T0 ++;
                        continue;
                    }
                }
                if (chr == 's') {
                    if (nextChr == '=') {
                        result ++;
                        T0 ++;
                        continue;
                    }
                }
                if (chr == 'z') {
                    if (nextChr == '=') {
                        result ++;
                        T0 ++;
                        continue;
                    }
                }
            }
            result++;
        }

        System.out.println(result);

        scanner.close();
    }
}
