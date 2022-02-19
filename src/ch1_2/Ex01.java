package ch1_2;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;

import edu.princeton.cs.algs4.Point2D;
import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdRandom;

public class Ex01 {
    public static void main(String[] args) {
        int N = 5;
        StdDraw.setPenRadius(0.01);
        // int N = Integer.parseInt(args[0]);

        Point2D[] pointsArray = new Point2D[N];
        HashSet<Point2D> distinctPoints = new HashSet<Point2D>();
        for (int i = 0; i < N; i++) {
            Point2D point = new Point2D(StdRandom.uniform(0.01, 0.99), StdRandom.uniform(0.01, 0.99));
            pointsArray[i] = point;
            if (distinctPoints.contains(point)) {
                System.out.printf("The points must be different");
                return;
            }
            distinctPoints.add(point);
            point.draw();
        }

        Arrays.sort(pointsArray, Point2D.X_ORDER);

        System.out.printf("The closest distance of two points is %f",
                closestDistance(pointsArray, 0, pointsArray.length - 1));
    }

    public static double closestDistance(Point2D[] points, int left, int right) {
        // point count is 1
        if (left == right) {
            return 0;
        }

        // point count is 2
        if (right - left == 1) {
            return points[left].distanceTo(points[right]);
        }

        // point count is 3
        if (right - left == 2) {
            return Math.max(Math.max(points[left].distanceTo(points[left + 1]), points[left].distanceTo(points[right])),
                    points[left + 1].distanceTo(points[right]));
        }

        int middle = left + (right - left) / 2;
        double leftClosest = closestDistance(points, left, middle);
        double rightClosest = closestDistance(points, middle + 1, right);
        double closest = Math.min(leftClosest, rightClosest);

        // get the left and the right of the middle range
        int middleLeft = Integer.MAX_VALUE;
        int middleRight = 0;
        for (int i = middle; i > left; i--) {
            if (points[middle].x() - points[i].x() >= closest) {
                break;
            }
            middleLeft = i;
        }

        for (int i = middle; i < right; i++) {
            if (points[right].x() - points[middle].x() >= closest) {
                break;
            }
            middleRight = i;
        }

        if (middleRight - middleLeft > 0) {
            closest = Math.min(closest, closestDistance(points, middleLeft, middleRight));
        }

        return closest;
    }
}
