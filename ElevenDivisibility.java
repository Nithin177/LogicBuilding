import java.util.Scanner;

public class ElevenDivisibility {
    public static void main(String[] args) {
        System.out.println("Welcome to Check if a large number is divisible by 11 or not program");
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the number need to be find ");
        String s=input.next();
        boolean isDivisible= divBy11(s);
        if (divBy11(s))
            System.out.println("true");
        else
            System.out.println("false");

    }
    public static boolean divBy11(String s) {

        // Convert string to int
        int n = Integer.parseInt(s);
        return n % 11 == 0;
    }
}
