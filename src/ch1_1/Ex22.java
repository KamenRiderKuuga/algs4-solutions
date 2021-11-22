package ch1_1;

import edu.princeton.cs.algs4.StdOut;

public class Ex22 {
    public static void main(String[] args) {
        int[] a = new int[] { 0, 3, 6, 7, 8, 9, 10, 11, 12, 13, 15, 12, 156 };
        StdOut.println(rank(3, a));
    }

    public static int rank(int key, int[] a) {
        return rank(key, a, 0, a.length - 1, 0);
    }

    public static int rank(int key, int[] a, int lo, int hi, int depth) {
        StdOut.printf(" ".repeat(depth) + "lo: %d hi: %d%n", lo, hi);
        if (lo > hi) {
            return -1;
        }

        int mid = lo + (hi - lo) / 2;
        if (key < a[mid]) {
            return rank(key, a, lo, mid - 1, depth + 1);
        } else if (key > a[mid]) {
            return rank(key, a, mid + 1, hi, depth + 1);
        } else {
            return mid;
        }
    }
}