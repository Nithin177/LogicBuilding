import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println("Welcome to Fibonacci problem ");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter n value");
        int n = input.nextInt();

        int a = 0, b = 1, fib = 0;

        if (n == 1) {
            fib = a;
        } else if (n == 2) {
            fib = b;
        } else {
            for (int i = 3; i <= n; i++) {
                fib = a + b;
                a = b;
                b = fib;
            }
        }
        System.out.println("Fibonacci number at position " + n + " is: " + fib);
    }
}
