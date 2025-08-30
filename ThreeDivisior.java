import java.util.Scanner;

public class ThreeDivisior {
    public static void main(String[] args) {
        System.out.println("Welcome to Three Divisor program using Binary Search");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number  ");
        int number = input.nextInt();

        System.out.println("The three divisor  upto  the number :" + number + " is  ");
        numbersWith3Divisors(number);

    }
    // Function to count divisors of a number using two loops
   public static int countDivisors(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        return count;
    }
    // Function to print numbers with exactly 3 divisors
   public static void numbersWith3Divisors(int n) {
        for (int i = 1; i <= n; i++) {
            if (countDivisors(i) == 3) {
                System.out.print(i + " ");
            }
        }
    }

}
