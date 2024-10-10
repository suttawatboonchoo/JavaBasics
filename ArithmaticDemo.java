package JavaBasics;

public class ArithmaticDemo {
    public static void main(String[] args) {
        int m = 3, n = 2;
        double x, y;
            y = m  + n * 2;
            x = y + m / n;

            System.out.println("The value of y: " + y);
            System.out.println("The value of x: " + x);
            System.out.println("The value of m: " + (m % n));
    }
}
