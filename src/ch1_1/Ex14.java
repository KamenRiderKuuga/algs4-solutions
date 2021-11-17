package ch1_1;

import edu.princeton.cs.algs4.StdOut;

public class Ex14 {
    public static void main(String[] args) {
        StdOut.println(lg(3));
    }

    private static int lg(int n) {
        int guess = -1;
        long calResult = 1;

        while (calResult <= n) {
            calResult *= 2;
            guess += 1;
        }

        return guess;
    }
}