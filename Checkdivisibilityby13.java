import java.util.Scanner;

public class Checkdivisibilityby13 {
    public static void main(String[] args) {
//        String s = "2911285";
        System.out.println("Welcome to Check if a large number is divisible by 13 or not program");
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the number need to be find ");
        String s=input.next();
        boolean isDivisible = divBy13(s);

        if (isDivisible) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
    public static boolean divBy13(String s) {

        // Convert the string to an integer
        int num = Integer.parseInt(s);

        // Check if the number is divisible by 13
        return (num % 13 == 0);
    }
}
