package ch1_1;

public class Ex08 {
    public static void main(String[] args) {
        // it print out the char 'b'
        System.out.println('b');

        // the Unicode of 'b' is 98, of 'c' is 99, so 'b' + 'c' = 197
        System.out.println('b' + 'c');

        // the Unicode of 'a' is 97, the Unicode of 'e' is 101
        System.out.println((char) ('a' + 4));
    }
}