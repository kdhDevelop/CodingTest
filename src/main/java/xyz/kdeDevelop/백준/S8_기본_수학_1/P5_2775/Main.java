package xyz.kdeDevelop.백준.S8_기본_수학_1.P5_2775;

import java.io.*;

public class Main {

    private static int[][] apt;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(bufferedReader.readLine());

        for (int T0 = 0 ; T0 < T ; T0 ++) {
            int k = Integer.parseInt(bufferedReader.readLine());
            int n = Integer.parseInt(bufferedReader.readLine());

            apt = new int[k+1][n+1];
            apt[0][1] = 1;
            apt[1][1] = 1;
            bufferedWriter.write(getPersonCount(k, n) + "\n");

            //printArray();
        }

        bufferedWriter.flush();
        bufferedWriter.close();
        bufferedReader.close();
    }


    public static int getPersonCount(int k, int n) {

        if (k == 0)
            return n;
        if (n == 1)
            return 1;

        if (apt[k-1][n] == 0)
            apt[k-1][n] = getPersonCount(k-1, n);
        if (apt[k][n-1] == 0)
            apt[k][n-1] = getPersonCount(k, n-1);

        return apt[k-1][n] + apt[k][n-1];
    }

    public static void printArray() {
        System.out.println("\n\n");

        for (int T0 = apt.length - 1 ; T0 >= 0 ; T0 --) {
            System.out.print("K : " + T0 + " || ");
            int[] temp = apt[T0];
            for (int T1 = 0 ; T1 < temp.length ; T1 ++) {
                System.out.print(temp[T1] + " ");
            }
            System.out.println("");
        }
    }
}
