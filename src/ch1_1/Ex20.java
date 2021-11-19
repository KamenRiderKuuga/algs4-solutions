package ch1_1;

import edu.princeton.cs.algs4.StdOut;

public class Ex20 {
    public static void main(String[] args) {
        StdOut.println(lnFactorial(10));
    }

    public static double lnFactorial(int n) {
        if (n == 1) {
            return 0;
        }

        return Math.log(n) + lnFactorial(n - 1);
    }
}