package xyz.kdeDevelop.백준.S5_문자열.P7_1157;

import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().toUpperCase();
        TreeMap<Character, Integer> counter = new TreeMap<>();

        char maxChr = ' ';
        int max = Integer.MIN_VALUE;
        boolean check = false;

        for (int T0 = 0 ; T0 < input.length() ; T0 ++) {
            char chr = input.charAt(T0);

            if (counter.containsKey(chr))
                counter.put(chr, counter.get(chr) + 1);
            else
                counter.put(chr, 1);
        }

        for (char temp : counter.keySet()) {
            int count = counter.get(temp);

            if (max < count) {
                maxChr = temp;
                max = count;
                check = false;
            } else if (max > count) {
                continue;
            } else {
                check = true;
            }
        }

        if (check)
            System.out.println("?");
        else
            System.out.println(maxChr);


        scanner.close();
    }
}
