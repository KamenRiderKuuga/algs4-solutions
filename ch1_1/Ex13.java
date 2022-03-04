package ch1_1;

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class Ex13 {
    public static void main(String[] args) {
        boolean[][] a = prepareTwoDimensionalArray(3, 5);

        for (int i = 0; i <= a.length; i++) {
            StdOut.printf("%d ", i);
        }

        for (int i = 0; i < a[0].length; i++) {
            StdOut.printf("%n%d ", i + 1);
            for (int j = 0; j < a.length; j++) {
                if (a[j][i] == true) {
                    StdOut.print("* ");
                } else {
                    StdOut.print("  ");
                }
            }
        }
    }

    private static boolean[][] prepareTwoDimensionalArray(int m, int n) {
        // now, we got m arrays of length n
        boolean[][] result = new boolean[m][n];

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                result[i][j] = StdRandom.uniform(0, 2) > 0 ? true : false;
            }
        }

        return result;
    }
}