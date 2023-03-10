package xyz.kdeDevelop.백준.S9_약수와_배수와_소수.P3_9506;

import java.io.*;
import java.util.Iterator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            int n = Integer.parseInt(bufferedReader.readLine());
            int sum = 0;
            TreeSet<Integer> divisor = new TreeSet<>();

            if (n == -1)
                break;

            for (int T0 = 1 ; T0 < n ; T0 ++) {
                if (n % T0 == 0) {
                    divisor.add(T0);
                    sum += T0;
                }
            }

            if (n == sum) {
                bufferedWriter.write(n + " = ");

                Iterator<Integer> itr = divisor.iterator();
                while (itr.hasNext()) {
                    bufferedWriter.write(String.valueOf(itr.next()));

                    if (itr.hasNext())
                        bufferedWriter.write(" + ");
                }
            } else {
                bufferedWriter.write(n + " is NOT perfect.");
            }
            bufferedWriter.write("\n");
        }

        bufferedWriter.flush();
        bufferedWriter.close();
        bufferedReader.close();
    }
}
