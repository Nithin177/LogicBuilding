import java.util.Scanner;

public class OppositeFaceDice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input
        System.out.print("Enter face number (1 to 6): ");
        int n = sc.nextInt();

        // Check if valid input
        if (n < 1 || n > 6) {
            System.out.println("Invalid face number! Please enter between 1 and 6.");
        } else {
            int opposite = 7 - n;
            System.out.println("The opposite face of " + n + " is: " + opposite);
        }
    }
}
