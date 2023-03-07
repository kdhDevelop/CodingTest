package xyz.kdeDevelop.백준.S8_기본_수학_1.P1_2292;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = Integer.parseInt(scanner.nextLine());

        List<Integer> list = new ArrayList<>();

        int tmp0 = N;
        int count = 0;

        while (tmp0 >= 0) {
            tmp0 -= (6 * count);
            list.add(tmp0);
            count ++;
        }

        System.out.println(list.size());

        scanner.close();
    }
}
