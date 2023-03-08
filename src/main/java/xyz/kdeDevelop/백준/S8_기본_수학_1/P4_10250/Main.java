package xyz.kdeDevelop.백준.S8_기본_수학_1.P4_10250;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(bufferedReader.readLine());

        for (int T0 = 0 ; T0 < T ; T0 ++) {
            String[] HWNInput = bufferedReader.readLine().split(" ");

            int H = Integer.parseInt(HWNInput[0]);
            int W = Integer.parseInt(HWNInput[1]);
            int N = Integer.parseInt(HWNInput[2]);

            int roomNumber = 0;
            int floor = 0;

            floor = N % H;
            if (floor == 0)
                floor = H;
            roomNumber = N / H;
            if (floor != H)
                roomNumber++;

            bufferedWriter.write(floor + String.format("%02d", roomNumber) + "\n");
        }

        bufferedWriter.flush();
        bufferedWriter.close();
        bufferedReader.close();
    }
}
