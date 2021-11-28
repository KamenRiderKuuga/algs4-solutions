package ch1_1;

public class Matrix {
    static double dot(double[] x, double[] y) {
        if ((x == null || y == null) || x.length != y.length) {
            return 0;
        }

        double result = 0;
        for (int i = 0; i < x.length; i++) {
            result += x[i] * y[i];
        }

        return result;
    }
}