package ch1_1;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Ex26 {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        int c = 0;
        int t = 0;

        while (true) {
            try {
                StdOut.print("a: ");
                a = StdIn.readInt();
                StdOut.print("b: ");
                b = StdIn.readInt();
                StdOut.print("c: ");
                c = StdIn.readInt();
                break;
            } catch (Exception e) {

            }
        }

        if (a > b) {
            t = a;
            a = b;
            b = t;
        }
        if (a > c) {
            t = a;
            a = c;
            c = t;
        }
        if (b > c) {
            t = b;
            b = c;
            c = t;
        }
        StdOut.printf("a: %d, b: %d, c: %d", a, b, c);
    }
}