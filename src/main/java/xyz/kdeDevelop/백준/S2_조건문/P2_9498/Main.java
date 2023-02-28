package xyz.kdeDevelop.백준.S2_조건문.P2_9498;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String input = bufferedReader.readLine();
        bufferedReader.close();

        int grade = Integer.parseInt(input);

        if (grade >= 90)
            System.out.println("A");
        else if (grade >= 80)
            System.out.println("B");
        else if (grade >= 70)
            System.out.println("C");
        else if (grade >= 60)
            System.out.println("D");
        else
            System.out.println("F");
    }
}
