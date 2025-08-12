import java.util.Scanner;

public class DistanceBetweenPoints {
    public static void main(String[] args) {
        System.out.println("Welcome to DistanceBetweenPoints program ");
        Scanner input= new Scanner(System.in);
        System.out.println("Enter X1 Value");
        int x1 = input.nextInt();
        System.out.println("Enter Y1 Value");
        int y1 = input.nextInt();

        // Coordinates of the second point
        System.out.println("Enter x2 Value");
        int x2 = input.nextInt();
        System.out.println("Enter y2 Value");
        int y2 = input.nextInt();

        // Calculate distance using the formula
        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        // Print the result
        System.out.println("Distance between points: " + distance);
    }
}
