package ch1_1;

import edu.princeton.cs.algs4.StdOut;

public class Ex24 {
    // java -cp '.\bin\;.\lib\algs4.jar' 'ch1_1.Ex24' 1111111 1234567
    public static void main(String[] args) {
        int firstNumber = Integer.parseInt(args[0]);
        int secondNumber = Integer.parseInt(args[1]);

        if (firstNumber < 0 || secondNumber < 0) {
            StdOut.println("Both numbers must be non-negative integers");
            return;
        }

        StdOut.println(gcd(firstNumber, secondNumber));
    }

    public static int gcd(int p, int q) {
        StdOut.printf("p:%d, q:%d%n", p, q);
        if (q == 0) {
            return p;
        }

        int r = p % q;
        return gcd(q, r);
    }
}