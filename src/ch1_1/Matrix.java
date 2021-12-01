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

    static double[][] mult(double[][] a, double[][] b) {
        // the column count of first matrix must be same with the row count of second
        double[][] result = new double[a.length][b[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                for (int k = 0; k < b[0].length; k++) {
                    result[i][k] += a[i][j] * b[j][k];
                }
            }
        }

        return result;
    }

    static double[][] transpose(double[][] a) {
        double[][] result = new double[a[0].length][a.length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                result[j][i] = a[i][j];
            }
        }

        return result;
    }

    static double[] mult(double[][] a, double[] x) {
        double[] result = new double[a.length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                result[i] += a[i][j] * x[j];
            }
        }

        return result;
    }
}