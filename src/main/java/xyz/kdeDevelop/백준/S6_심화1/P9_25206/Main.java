package xyz.kdeDevelop.백준.S6_심화1.P9_25206;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        double totalGrade = 0;
        double totalCredit = 0;
        for (int T0 = 0 ; T0 < 20 ; T0 ++) {
            String[] input = bufferedReader.readLine().split(" ");

            if (!input[2].equals("P")) {
                double credit = Double.parseDouble(input[1]);

                double grade = credit * getGrade(input[2]);
                totalGrade += grade;
                totalCredit += credit;
            }
        }

        double result = totalGrade / totalCredit;

        System.out.println(result);

        bufferedReader.close();
    }

    private static double getGrade(String grade) {
        switch (grade) {
            case "A+": return 4.5;
            case "A0": return 4.0;
            case "B+": return 3.5;
            case "B0": return 3.0;
            case "C+": return 2.5;
            case "C0": return 2.0;
            case "D+": return 1.5;
            case "D0": return 1.0;
            default: return 0.0;
        }
    }
}
