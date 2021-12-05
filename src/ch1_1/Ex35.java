package ch1_1;

import java.text.DecimalFormat;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class Ex35 {
    public static void main(String[] args) {
        int SIDES = 6;
        double[] dist = new double[2 * SIDES + 1];
        for (int i = 1; i <= SIDES; i++)
            for (int j = 1; j <= SIDES; j++)
                dist[i + j] += 1.0;
        for (int k = 2; k <= 2 * SIDES; k++)
            dist[k] /= 36.0;

        int tryTimes = 1;
        while (!dice(tryTimes, dist)) {
            tryTimes *= 10;
        }

        StdOut.printf("probability is close after %d times", tryTimes);
    }

    public static boolean dice(int times, double[] standardValue) {
        int[] diceResult = new int[2 * 6 + 1];
        for (int i = 0; i < times; i++) {
            int first = StdRandom.uniform(1, 7);
            int second = StdRandom.uniform(1, 7);
            diceResult[first + second] += 1;
        }

        DecimalFormat df = new DecimalFormat("#.###");

        for (int i = 0; i < diceResult.length; i++) {
            if (!(df.format(1.0 * diceResult[i] / times).equals(df.format(standardValue[i])))) {
                return false;
            }
        }

        return true;
    }
}