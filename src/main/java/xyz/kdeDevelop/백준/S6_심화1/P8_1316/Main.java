package xyz.kdeDevelop.백준.S6_심화1.P8_1316;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine());

        int result = 0;
        for (int T0 = 0 ; T0 < N ; T0 ++) {
            boolean group = true;
            HashSet<Character> checker = new HashSet<>();
            String input = bufferedReader.readLine();

            for (int T1 = 0 ; T1 < input.length()-1 ; T1 ++) {
                char chr = input.charAt(T1);
                char nextChr = input.charAt(T1+1);

                if (chr != nextChr) {
                    checker.add(chr);
                    if (checker.contains(nextChr)) {
                        group = false;
                        break;
                    }
                }
            }

            if (group)
                result++;
        }
        System.out.println(result);
        bufferedReader.close();
    }
}
