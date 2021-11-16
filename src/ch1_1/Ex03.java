package ch1_1;

import edu.princeton.cs.algs4.StdOut;

public class Ex03 {
    public static void main(String[] args) {
        if ((args).equals(null) || args.length < 3) {
            StdOut.println("There are no three arguments");
            return;
        }

        try {
            Integer.parseInt(args[0]);
            if (args[0].equals(args[1]) && args[1].equals(args[2])) {
                StdOut.println("equal");
                return;
            }
            StdOut.println("not equal");
            return;

        } catch (NumberFormatException e) {
            StdOut.println("The input must integers");
        }
    }
}