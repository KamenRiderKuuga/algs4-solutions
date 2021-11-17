package ch1_1;

import java.util.Arrays;

import edu.princeton.cs.algs4.StdOut;

public class Ex15 {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 1, 0 };
        StdOut.println(Arrays.toString(histogram(a, 3)));
    }

    private static int[] histogram(int[] a, int m) {
        int[] result = new int[m];

        for (int i = 0; i < a.length; i++) {
            if (a[i] >= 0 && a[i] < m) {
                result[a[i]] += 1;
            }
        }

        return result;
    }
}