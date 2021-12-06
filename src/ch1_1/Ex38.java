package ch1_1;

import java.util.Arrays;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.Stopwatch;

public class Ex38 {
    public static void main(String[] args) {
        int[] whilelist = new In(args[0]).readAllInts();
        int[] allInts = StdIn.readAllInts();
        StdOut.println("All input is read, start testing");

        Stopwatch timer1 = new Stopwatch();
        int result1 = 0;
        for (int i = 0; i < allInts.length; i++) {
            if (bruteForceSearch(allInts[i], whilelist) < 0) {
                result1++;
            }
        }
        StdOut.printf(
                "totol time spent when using BruteForceSearch %.3f, %d result(s) are found that do not exist in the whitelist",
                timer1.elapsedTime(), result1);

        Stopwatch timer2 = new Stopwatch();
        Arrays.sort(whilelist);
        int result2 = 0;
        for (int i = 0; i < allInts.length; i++) {
            if (rank(allInts[i], whilelist) < 0) {
                result2++;
            }
        }
        StdOut.printf(
                "totol time spent when using BinarySearch %.3f, %d result(s) are found that do not exist in the whitelist",
                timer2.elapsedTime(), result2);
    }

    public static int rank(int key, int[] a) {
        int lo = 0;
        int hi = a.length - 1;

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (a[mid] > key) {
                hi = mid - 1;
            } else if (a[mid] < key) {
                lo = mid + 1;
            } else {
                return mid;
            }
        }

        return -1;
    }

    public static int bruteForceSearch(int key, int[] a) {
        for (int i = 0; i < a.length; i++)
            if (a[i] == key)
                return i;
        return -1;
    }

}