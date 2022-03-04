package ch1_1;

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class Ex05 {
    public static void main(String[] args) {
        double x = StdRandom.uniform(0.0, 2.0);
        double y = StdRandom.uniform(0.0, 2.0);
        StdOut.printf("x: %f, y: %f \n", x, y);

        if (x > 0 && x < 1 && y > 0 && y < 1) {
            StdOut.println(true);
            return;
        }

        StdOut.println(false);
    }
}