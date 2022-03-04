package ch1_1;

import edu.princeton.cs.algs4.StdOut;

public class Ex27 {

    private static long _callCount1 = 0;
    private static long _callCount2 = 0;

    public static void main(String[] args) {
        StdOut.printf("result of betterBinomial: %s, number of calls: %d", betterBinomial(100, 50, 0.25), _callCount2);
        StdOut.printf("result of binomial: %s, number of calls: %d", binomial(100, 50, 0.25), _callCount1);
    }

    public static double binomial(int N, int k, double p) {
        _callCount1++;
        if (N == 0 && k == 0)
            return 1.0;
        if (N < 0 || k < 0)
            return 0.0;

        return (1.0 - p) * binomial(N - 1, k, p) + p * binomial(N - 1, k - 1, p);
    }

    public static double binomialRecur(int N, int k, double p, double[][] matrix, double[][] calculated) {

        if (N == 0 && k == 0)
            return 1.0;
        if (N < 0 || k < 0)
            return 0.0;

        if (calculated[N][k] == 0) {
            calculated[N][k] = 1;
            _callCount2++;
            matrix[N][k] = (1.0 - p) * binomialRecur(N - 1, k, p, matrix, calculated)
                    + p * binomialRecur(N - 1, k - 1, p, matrix, calculated);
        }

        return matrix[N][k];
    }

    public static double betterBinomial(int N, int k, double p) {
        if (N == 0 && k == 0)
            return 1.0;
        if (N < 0 || k < 0)
            return 0.0;

        return binomialRecur(N, k, p, new double[N + 1][k + 1], new double[N + 1][k + 1]);
    }
}