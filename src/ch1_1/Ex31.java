package ch1_1;

import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdRandom;

public class Ex31 {
    public static void main(String[] args) {
        int pointCount = Integer.parseInt(args[0]);
        double possibility = Double.parseDouble(args[1]);
        // radius is 0.35
        double radius = 0.35;
        // center of circle is not (0, 0)
        double offset = 0.5;
        StdDraw.circle(offset, offset, radius);
        StdDraw.setPenRadius(0.05);
        double angleIter = (double) 360 / pointCount;
        double currentAngle = 0;

        double[][] pointStore = new double[2][pointCount];

        for (int i = 0; i < pointCount; i++) {
            double currentX = Math.sin(currentAngle / 180 * Math.PI) * radius + offset;
            double currentY = Math.cos(currentAngle / 180 * Math.PI) * radius + offset;
            pointStore[0][i] = currentX;
            pointStore[1][i] = currentY;
            StdDraw.point(currentX, currentY);
            currentAngle += angleIter;
        }

        StdDraw.setPenColor(StdDraw.GRAY);
        StdDraw.setPenRadius(0.002);

        for (int i = 0; i < pointStore[0].length; i++) {
            for (int j = 0; j < pointStore[0].length; j++) {
                if (StdRandom.bernoulli(possibility)) {
                    StdDraw.line(pointStore[0][i], pointStore[1][i], pointStore[0][j], pointStore[1][j]);
                }
            }
        }
    }
}