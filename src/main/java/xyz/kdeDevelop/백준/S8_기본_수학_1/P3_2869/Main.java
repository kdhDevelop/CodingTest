package xyz.kdeDevelop.백준.S8_기본_수학_1.P3_2869;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] ABVInput = scanner.nextLine().split(" ");

        int A = Integer.parseInt(ABVInput[0]);
        int B = Integer.parseInt(ABVInput[1]);
        int V = Integer.parseInt(ABVInput[2]);

        int targetDistance = V - A;
        int moveDistancePerDay = A - B;

        int targetDay = targetDistance / moveDistancePerDay;

        if (targetDistance % moveDistancePerDay == 0)
            targetDay ++;
        else
            targetDay += 2;

        System.out.println(targetDay);

    }
}
