package ch1_1;

import java.util.Arrays;

import edu.princeton.cs.algs4.StdOut;

public class Ex28 {
    public static void main(String[] args) {
        int[] whitelist = new int[] { 2, 3, 6, 6, 7, 8 };
        Arrays.sort(whitelist);

        if (whitelist.length == 0) {
            StdOut.println(Arrays.toString(whitelist));
            return;
        }

        int preNumber = whitelist[0];
        int currentIndex = 0;

        for (int i = 0; i < whitelist.length; i++) {
            if (whitelist[i] != preNumber) {
                currentIndex += 1;
                whitelist[currentIndex] = whitelist[i];
            }

            preNumber = whitelist[i];
        }

        int[] result = new int[currentIndex + 1];

        for (int i = 0; i <= currentIndex; i++) {
            result[i] = whitelist[i];
        }

        StdOut.println(Arrays.toString(result));
    }
}