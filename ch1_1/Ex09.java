package ch1_1;

import edu.princeton.cs.algs4.StdOut;

public class Ex09 {
    public static void main(String[] args) {
        String s = "";
        int n = 8;

        // it's similar to the hexadecimal representation of a positive decimal number
        while (n > 0) {
            s = (n % 2) + s;
            n /= 2;
        }

        StdOut.println(s);
    }
}