package ch1_1;

import java.util.Arrays;

import edu.princeton.cs.algs4.StdOut;

public class Ex33 {
    public static void main(String[] args) {
        // test the dot
        double[] firstArray = new double[] { 1, 2, 3, 4, 5 };
        double[] secondArray = new double[] { 5, 4, 3, 2, 1 };
        StdOut.println(Matrix.dot(firstArray, secondArray));

        // test the mult
        double[][] multA = new double[2][];
        multA[0] = new double[] { 1, 2, 3 };
        multA[1] = new double[] { 4, 5, 6 };

        double[][] multB = new double[3][];
        multB[0] = new double[] { 7, 8 };
        multB[1] = new double[] { 9, 10 };
        multB[2] = new double[] { 11, 12 };

        double[][] multResult = Matrix.mult(multA, multB);
        for (double[] ds : multResult) {
            StdOut.println(Arrays.toString(ds));
        }

        // test the transpose
        double[][] a = new double[5][];
        a[0] = new double[] { 1, 4, 3 };
        a[1] = new double[] { 8, 2, 6 };
        a[2] = new double[] { 7, 8, 3 };
        a[3] = new double[] { 4, 9, 6 };
        a[4] = new double[] { 7, 8, 1 };
        double[][] transposedMatrix = Matrix.transpose(a);
        for (double[] ds : transposedMatrix) {
            StdOut.println(Arrays.toString(ds));
        }
    }
}