package ch1_1;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Ex21 {
    public static void main(String[] args) {
        Integer rowsCount = 0;
        while (true) {
            try {
                StdOut.print("please enter the number of students: ");
                rowsCount = StdIn.readInt();
                break;
            } catch (Exception e) {
            }
        }

        String result = String.format("|%10s|%10s|%10s|%10s|%n", "Name", "First", "Second", "Rate");
        while (rowsCount > 0) {
            try {
                StdOut.print("Name of student: ");
                String name = StdIn.readString();
                StdOut.print("The first number: ");
                Integer first = StdIn.readInt();
                StdOut.print("The second number: ");
                Integer second = StdIn.readInt();
                Double rate = first * 1.0 / second;
                result += String.format("|%10s|%10s|%10s|%10s|%n", name, first, second, String.format("%.2f", rate));
                rowsCount--;
            } catch (Exception e) {
            }
        }

        StdOut.println(result);
    }
}