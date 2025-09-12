import java.util.Scanner;

public class largestoftwonumbers {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Welcome to program to find the largest of two numbers in java");
        System.out.println("");
        int num1= input.nextInt();
       int num2= input.nextInt();
        if (num1 == num2) {
            System.out.println("both are equal");
        }
        else if (num1 > num2) {
            System.out.println(num1 + " is greater");
        }

        else {
            System.out.println(num2 + " is greater");
        }
    }
}
