package xyz.kdeDevelop.백준.S9_약수와_배수와_소수.P7_9020;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(bufferedReader.readLine());
        List<Integer> divisor = new ArrayList<>();
        int last = 1;

        for (int T0 = 0 ; T0 < T ; T0 ++) {
            int n = Integer.parseInt(bufferedReader.readLine());

            for (int T1 = last ; T1 < n ; T1 ++) {
                TreeSet<Integer> tempDivisor = new TreeSet<>();
                for (int T2 = 1 ; T2 <= T1 ; T2 ++) {
                    if (T1 % T2 == 0) {
                        tempDivisor.add(T2);
                    }
                }

                if (tempDivisor.size() == 2)
                    divisor.add(T1);
            }

            last = n;

            int partition1 = 0;
            int partition2 = 0;
            int minus = Integer.MAX_VALUE;

            for (int T1 = 0 ; T1 < divisor.size() / 2 + 1 ; T1 ++) {
                int tempPartition1 = divisor.get(T1);
                for (int T2 = 0 ; T2 < divisor.size() ; T2 ++) {
                    int tempPartition2 = divisor.get(T2);
                    if (tempPartition1 + tempPartition2 == n) {
                        //System.out.println("TEMP PARTITION 1 : " + tempPartition1 + " || TEMP PARTITION 2 : " + tempPartition2);

                        int tempMinus = Math.abs(tempPartition1 - tempPartition2);

                        if (tempMinus < minus) {
                            partition1 = tempPartition1;
                            partition2 = tempPartition2;

                            minus = tempMinus;
                        }
                    }
                }
            }

            bufferedWriter.write(partition1 + " " + partition2 + "\n");
        }

        bufferedWriter.flush();
        bufferedWriter.close();
        bufferedReader.close();
    }
}
