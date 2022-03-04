package ch1_1;

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class Ex36 {
    public static void main(String[] args) {
        int M = Integer.parseInt(args[0]);
        int N = Integer.parseInt(args[1]);

        int[] a = new int[M];
        int[][] table = new int[M][M];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < a.length; j++) {
                a[j] = j;
            }
            StdRandom.shuffle(a);
            for (int j = 0; j < a.length; j++) {
                table[j][a[j]] += 1;
            }
        }

        String format = "%" + (((int) Math.log10(N / M)) + 2) + "s";

        for (int[] row : table) {
            for (int num : row) {
                StdOut.printf(format, num);
            }
            StdOut.print("\n");
        }
    }
}