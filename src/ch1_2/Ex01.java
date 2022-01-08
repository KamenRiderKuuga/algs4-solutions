package ch1_2;

import edu.princeton.cs.algs4.Point2D;
import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdRandom;

public class Ex01 {
    public static void main(String[] args) {
        int N = 1000;
        StdDraw.setPenRadius(0.01);
        // int N = Integer.parseInt(args[0]);
        for (int i = 0; i < N; i++) {
            Point2D point = new Point2D(StdRandom.uniform(0.01, 0.99), StdRandom.uniform(0.01, 0.99));
            point.draw();
        }
    }
}
