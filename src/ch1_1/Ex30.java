package ch1_1;

import java.util.Arrays;

import edu.princeton.cs.algs4.StdOut;

public class Ex30 {

    public static int gcd(int p, int q) {
        if (q == 0) {
            return p;
        }

        int r = p % q;
        return gcd(q, r);
    }

    public static void main(String[] args) {
        int N = 10;
        boolean[][] a = new boolean[N][N];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j] = gcd(i, j) == 1;
            }
        }

        for (boolean[] b : a) {
            StdOut.println(Arrays.toString(b));
        }
    }
}