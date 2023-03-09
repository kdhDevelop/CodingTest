package xyz.kdeDevelop.백준.S8_기본_수학_1.P6_10757;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] ABInput = scanner.nextLine().split(" ");

        int T = Math.max(ABInput[0].length(), ABInput[1].length());

        StringBuilder stringBuilder;

        stringBuilder = new StringBuilder();
        for (int T0 = 0 ; T0 < T - ABInput[0].length() ; T0 ++) {
            stringBuilder.append("0");
        }
        stringBuilder.append(ABInput[0]);
        ABInput[0] = stringBuilder.toString();

        stringBuilder = new StringBuilder();
        for (int T0 = 0 ; T0 < T - ABInput[1].length() ; T0 ++) {
            stringBuilder.append("0");
        }
        stringBuilder.append(ABInput[1]);
        ABInput[1] = stringBuilder.toString();

        //System.out.println("A : " + ABInput[0]);
        //System.out.println("B : " + ABInput[1]);


        boolean carry = false;

        List<Character> result = new ArrayList<>();

        for (int T0 = T-1 ; T0 >= 0 ; T0 --) {

            //System.out.print("T0 : " + T0);
            int tmpA = Integer.parseInt(String.valueOf(ABInput[0].charAt(T0)));
            int tmpB = Integer.parseInt(String.valueOf(ABInput[1].charAt(T0)));

            int sum = tmpA + tmpB;

            //System.out.print(" || IS CARRY : " + carry);

            if (carry)
                sum ++;

            //System.out.print(" || tmpA : " + tmpA + " || tmpB : " + tmpB + " || SUM : " + sum + " || CARRY : " + carry);

            carry = false;

            if (sum > 9) {
                carry = true;
                sum -= 10;
            }

            //System.out.println(" || CHANGE CARRY : " + carry);

            result.add(String.valueOf(sum).charAt(0));
        }

        if (carry)
            result.add('1');

        StringBuilder resultStringBuilder = new StringBuilder();
        for (int T0 = result.size()-1 ; T0 >= 0 ; T0 --)
            resultStringBuilder.append(result.get(T0));

        System.out.println(resultStringBuilder);

        scanner.close();
    }
}
