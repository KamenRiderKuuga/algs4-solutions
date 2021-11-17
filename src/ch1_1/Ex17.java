package ch1_1;

import edu.princeton.cs.algs4.StdOut;

public class Ex17 {
    public static void main(String[] args) {
        StdOut.println(exR2(6));
    }

    public static String exR2(int n) {
        String s = exR2(n - 3) + n + exR2(n - 2) + n;
        // since the `if (n <= 0)` can never be reached,
        // it will cause infinite recursion
        if (n <= 0)
            return "";
        return s;
    }
}