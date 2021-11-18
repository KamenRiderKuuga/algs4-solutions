package ch1_1;

import java.math.BigInteger;
import java.util.Arrays;

import edu.princeton.cs.algs4.StdOut;

public class Ex20 {
    public static long F(int N) {
        if (N == 0)
            return 0;
        if (N == 1)
            return 1;
        return F(N - 1) + F(N - 2);
    }

    public static BigInteger iterationF(int N) {
        BigInteger[] processArray = new BigInteger[N + 1];
        for (int i = 0; i <= N; i++) {
            if (i == 0 || i == 1) {
                processArray[i] = BigInteger.valueOf(i);
            } else {
                processArray[i] = processArray[i - 1].add(processArray[i - 2]);
            }
        }

        StdOut.println(Arrays.toString(processArray));
        return processArray[100];
    }

    public static void main(String[] args) {
        StdOut.println(iterationF(100));

        for (int N = 0; N < 100; N++)
            StdOut.println(N + " " + F(N));
    }
}