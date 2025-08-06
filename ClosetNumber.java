import java.util.Scanner;

public class ClosetNumber {
    public static void main(String[] args) {
        System.out.println("Welcome to the find Closet number ");
        // n/m ----> gives closet Quotient
        // Q*m ----> gives nearest multiple
        Scanner input=new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = input.nextInt();
        System.out.print("Enter m (non-zero): ");
        int m = input.nextInt();


        if (m == 0) {
            System.out.println("m cannot be zero!");
            return;
        }
        int quotient= n/m;
        int lowerMultiple = m * quotient;
        int upperMultiple = (m > 0) ? m * (quotient + 1) : m * (quotient - 1);

        // Step 2: Compare distances
        int distLow = Math.abs(n - lowerMultiple);
        int distUp = Math.abs(n - upperMultiple);

        int result;
        if (distLow < distUp) {
            result = lowerMultiple;
        } else if (distUp < distLow) {
            result = upperMultiple;
        } else {
            // Both are equally close, pick the one with max absolute value
            result = (Math.abs(lowerMultiple) > Math.abs(upperMultiple)) ? lowerMultiple : upperMultiple;
        }

        // Output result
        System.out.println("Closest number to " + n + " divisible by " + m + " is: " + result);

    }
}
