package ch1_1;

public class Ex29 {
    public static int rank(int key, int[] a) {
        int lo = 0;
        int hi = a.length - 1;
        int mid;

        while (hi >= lo) {
            mid = lo + (hi - lo) / 2;
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

    public static void main(String[] args) {
        int[] a = new int[] { 5, 7, 7, 8, 8, 10 };
        System.out.println(rank(8, a));
    }
}