package ch1_1;

import edu.princeton.cs.algs4.StdOut;

public class Ex29 {
    public static int rank(int key, int[] a) {
        int lo = 0;
        int hi = a.length - 1;

        while (hi >= lo) {
            int mid = lo + (hi - lo) / 2;
            if (a[mid] >= key) {
                if (mid == 0) {
                    return 0;
                }
                if (a[mid - 1] < key) {
                    return mid;
                } else {
                    hi = mid - 1;
                }
            } else {
                if (mid == a.length - 1) {
                    return a.length;
                }

                if (a[mid + 1] >= key) {
                    return mid + 1;
                } else {
                    lo = mid + 1;
                }
            }
        }

        return 0;
    }

    public static int count(int key, int[] a) {
        int rank = rank(key, a);

        if (rank == a.length || key != a[rank]) {
            return 0;
        }

        int lo = rank;
        int hi = a.length - 1;
        int lastIndex = 0;

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (a[mid] > key) {
                hi = mid - 1;
            } else if (a[mid] < key) {
                lo = mid + 1;
            } else if (a[mid] == key) {
                if (mid == a.length - 1) {
                    lastIndex = a.length - 1;
                    break;
                }

                if (a[mid + 1] > key) {
                    lastIndex = mid;
                    break;
                } else {
                    lo = mid + 1;
                }
            }
        }

        return lastIndex - rank + 1;
    }

    public static void main(String[] args) {
        int[] a = new int[] { 5, 7, 7, 8, 8, 10 };
        StdOut.println(rank(8, a));
        StdOut.println(count(8, a));
    }
}