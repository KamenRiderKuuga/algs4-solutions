package ch1_2;

import java.lang.reflect.Field;
import java.util.ArrayList;
import edu.princeton.cs.algs4.Interval1D;
import edu.princeton.cs.algs4.Interval2D;
import edu.princeton.cs.algs4.Point2D;
import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class Ex03 {

    private static final Field xField = getInterval2DField("x");
    private static final Field yField = getInterval2DField("y");

    public static void main(String[] args) {
        StdDraw.setPenRadius(0.01);
        int intervalCount = Integer.parseInt(args[0]);

        ArrayList<Interval2D> intervals = new ArrayList<Interval2D>();
        for (int i = 0; i < intervalCount; i++) {
            intervals.add(randomInterval2D());
            intervals.get(i).draw();
        }

        int intersectCount = 0;
        int containCount = 0;
        for (int i = 0; i < intervals.size(); i++) {
            for (int j = i + 1; j < intervals.size(); j++) {
                if (hasContainRelation(intervals.get(i), intervals.get(j))) {
                    containCount++;
                    intersectCount++;
                } else if (intervals.get(i).intersects(intervals.get(j))) {
                    intersectCount++;
                }
            }
        }

        StdOut.println("The count of intervals that have an intersecting relation is " + intersectCount);
        StdOut.println("The count of intervals that have an contain relation is " + containCount);
    }

    public static Field getInterval2DField(String fieldName) {
        try {
            Field field = Interval2D.class.getDeclaredField(fieldName);
            field.setAccessible(true);
            return field;
        } catch (Exception e) {
            return null;
        }
    }

    public static Interval2D randomInterval2D() {
        double firstMin = StdRandom.uniform(0.01, 0.99);
        double firstMax = StdRandom.uniform(firstMin, 0.99);
        double secondMin = StdRandom.uniform(0.01, 0.99);
        double secondMax = StdRandom.uniform(secondMin, 0.99);
        return new Interval2D(new Interval1D(firstMin, firstMax), new Interval1D(secondMin, secondMax));
    }

    public static Boolean hasContainRelation(Interval2D firstInterval, Interval2D secondInterval) {
        try {
            double firstXMin = ((Interval1D) xField.get(firstInterval)).min();
            double firstXMax = ((Interval1D) xField.get(firstInterval)).max();
            double firstYMin = ((Interval1D) yField.get(firstInterval)).min();
            double firstYMax = ((Interval1D) yField.get(firstInterval)).max();
            double secondXMin = ((Interval1D) xField.get(secondInterval)).min();
            double secondXMax = ((Interval1D) xField.get(secondInterval)).max();
            double secondYMin = ((Interval1D) yField.get(secondInterval)).min();
            double secondYMax = ((Interval1D) yField.get(secondInterval)).max();

            if (secondInterval.contains(new Point2D(firstXMin, firstYMin))
                    && secondInterval.contains(new Point2D(firstXMin, firstYMax))
                    && secondInterval.contains(new Point2D(firstXMax, firstYMin))
                    && secondInterval.contains(new Point2D(firstXMax, firstYMax))) {
                return true;
            }

            if (firstInterval.contains(new Point2D(secondXMin, secondYMin))
                    && firstInterval.contains(new Point2D(secondXMin, secondYMax))
                    && firstInterval.contains(new Point2D(secondXMax, secondYMin))
                    && firstInterval.contains(new Point2D(secondXMax, secondYMax))) {
                return true;
            }

            return false;
        } catch (Exception e) {
            return false;
        }
    }
}
