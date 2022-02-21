package ch1_2;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Ex06 {
    public static void main(String[] args) {
        StdOut.println("please enter the s");
        String s = StdIn.readLine();
        StdOut.println("please enter the t");
        String t = StdIn.readLine();
        Boolean result = s.length() == t.length() && (t + t).indexOf(s) > 0;
        StdOut.println("the s is" + (result ? "" : " not") + " a circular rotation of the t");
    }
}
