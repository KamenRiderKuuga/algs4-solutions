package ch1_2;

import java.util.ArrayList;

import edu.princeton.cs.algs4.Interval1D;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Ex02 {
    public static void main(String[] args) {
        double intervalCount = Integer.parseInt(args[0]);

        ArrayList<Interval1D> allInterval = new ArrayList<Interval1D>();
        for (int i = 0; i < intervalCount; i++) {
            StdOut.println("please enter the next interval");
            double left = StdIn.readDouble();
            double right = StdIn.readDouble();
            allInterval.add(new Interval1D(left, right));
        }

        for (int i = 0; i < allInterval.size(); i++) {
            for (int j = i + 1; j < allInterval.size(); j++) {
                if (allInterval.get(i).intersects(allInterval.get(j))) {
                    StdOut.println("The interval " + allInterval.get(i) + " intersects with " + allInterval.get(j));
                }
            }
        }
    }
}
