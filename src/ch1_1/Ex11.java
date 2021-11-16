package ch1_1;

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class Ex11 {
    public static void main(String[] args) {
        // now, we got 3 arrays of length 5
        boolean[][] a = new boolean[3][5];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j] = StdRandom.uniform(0, 2) > 0 ? true : false;
            }
        }

        for (int i = 0; i <= a[0].length; i++) {
            StdOut.printf("%d ", i);
        }

        for (int i = 0; i < a.length; i++) {
            StdOut.printf("%n%d ", i + 1);
            for (int j = 0; j < a[0].length; j++) {
                if (a[i][j] == true) {
                    StdOut.print("* ");
                } else {
                    StdOut.print("  ");
                }
            }
        }
    }
}