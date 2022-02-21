package ch1_2;

import edu.princeton.cs.algs4.StdOut;

public class Ex04 {
    public static void main(String[] args) {
        String string1 = "hello";
        String string2 = string1;
        string1 = "world";
        // string1 is "world"
        StdOut.println(string1);
        // string2 is "hello"
        StdOut.println(string2);
    }
}
