package ch1_1;

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class Ex18 {
    public static void main(String[] args) {
        int a = StdRandom.uniform(1, 11);
        int b = StdRandom.uniform(1, 11);
        StdOut.printf("a = %d, b = %d%n", a, b);
        StdOut.printf("mystery(a, b) = %d%n", mystery(a, b));
        StdOut.printf("a * b = %d%n", a * b);
        StdOut.printf("mystery2(a, b) = %d%n", mystery2(a, b));
        StdOut.printf("Math.pow(a, b) = %f%n", Math.pow(a, b));
    }

    public static int mystery(int a, int b) {
        if (b == 0)
            return 0;
        if (b % 2 == 0)
            return mystery(a + a, b / 2);
        return mystery(a + a, b / 2) + a;
    }

    public static int mystery2(int a, int b) {
        if (b == 0)
            return 1;
        if (b % 2 == 0)
            return mystery2(a * a, b / 2);
        return mystery2(a * a, b / 2) * a;
    }
}