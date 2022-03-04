package ch1_2;

import edu.princeton.cs.algs4.StdOut;

public class Ex05 {
    public static void main(String[] args) {
        // the String is a immutable type
        String s = "Hello World";
        s.toUpperCase();
        s.substring(6, 11);
        StdOut.println(s);
    }
}
