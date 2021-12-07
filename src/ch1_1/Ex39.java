package ch1_1;

import java.util.Arrays;

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class Ex39 {
    public static void main(String[] args) {
        int T = Integer.parseInt(args[0]);
        int count = 4;
        int N = 100;

        int[] testResult = new int[count];

        for (int i = 0; i < T; i++) {
            N = 100;
            for (int j = 0; j < count; j++) {
                N *= 10;
                int[] a = new int[N];
                int[] b = new int[N];

                for (int k = 0; k < N; k++) {
                    a[k] = StdRandom.uniform(100000, 1000000);
                    b[k] = StdRandom.uniform(100000, 1000000);
                }

                Arrays.sort(a);
                for (int n : b) {
                    if (rank(n, a) != -1) {
                        testResult[j] += 1;
                    }
                }
            }
        }

        int paddingTo = (int) Math.log10(N) + 2;
        StdOut.printf("%" + paddingTo + "s", "N");
        StdOut.printf("%" + (paddingTo + 3) + "s", "Average");
        StdOut.print("\n");

        N = 100;
        for (int i = 0; i < count; i++) {
            N *= 10;
            StdOut.printf("%" + paddingTo + "s", N);
            StdOut.printf("%" + (paddingTo + 3) + ".2f", 1.0 * testResult[i] / T);
            StdOut.print("\n");
        }
    }

    public static int rank(int key, int[] a) {
        int lo = 0;
        int hi = a.length - 1;

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (a[mid] > key) {
                hi = mid - 1;
            } else if (a[mid] < key) {
                lo = mid + 1;
            } else {
                return mid;
            }
        }

        return -1;
    }
}