package xyz.kdeDevelop.백준.S8_기본_수학_1.P2_1193;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int X = Integer.parseInt(scanner.nextLine());

        int tmp0 = X;
        int count = 0;

        while (true) {
            if (tmp0 - count <= 0)
                break;

            tmp0 -= count;
            count++;
        }

        int resultUp = 0;
        int resultDown = 0;

        if (count % 2 == 0) {
            resultUp = tmp0;
            resultDown = (count+1) - tmp0;
        } else {
            resultDown = tmp0;
            resultUp = (count+1) - tmp0;
        }

        String result = resultUp + "/" + resultDown;

        System.out.println(result);

        scanner.close();
    }
}
