package ch1_1;

import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdIn;

public class Ex32 {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        double l = Integer.parseInt(args[1]);
        double r = Integer.parseInt(args[2]);
        double[] a = StdIn.readAllDoubles();

        // calculate the count of each range first
        int[] eachRangeCount = new int[N];

        for (double number : a) {
            if (number <= l || number >= r) {
                continue;
            }

            int index = (int) ((number - l) / ((r - l) / N));
            eachRangeCount[index] += 1;
        }

        for (int i = 0; i < eachRangeCount.length; i++) {
            double width = 1.0 / N;
            double hight = 0.8 / a.length * eachRangeCount[i];
            StdDraw.filledRectangle((i + 0.5) * width, hight * 0.5, width * 0.5 * 0.5, hight * 0.5);
        }
    }
}