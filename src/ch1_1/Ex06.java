package ch1_1;

public class Ex06 {
    public static void main(String[] args) {
        int f = 0;
        int g = 1;

        for (int i = 0; i <= 15; i++) {
            f = f + g;
            g = f - g;
        }
    }
}