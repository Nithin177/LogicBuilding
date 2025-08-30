import java.util.Scanner;

public class SquareRootBinarySearch {
    public static void main(String[] args) {
        System.out.println("Welcome to Square root program using Binary Search");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number for which Square root need to be find ");
        int number = input.nextInt();
        float squareRoot = floorSqrt(number);
        System.out.println("The square root of given number is :" + squareRoot);
    }

    public static float floorSqrt(int number) {
        if (number == 0 || number == 1)
            return number;
        int start = 1, end = number, ans = 0;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            // If n is a perfect square
            if (mid * mid == number) {
                return mid;
            }
            // If mid*mid < n, move to right half
            if (mid * mid < number) {
                start = mid + 1;
                ans = mid; // store the floor value
            } else {
                end = mid - 1; // move to left half
            }
        }

        return ans;
    }
}
