import java.util.Scanner;

public class ArmstrongAnyDigits {
    public static void main(String[] args) {
        System.out.println("Welcome to Armstrong Problem");
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the number need to be checked ");
        int number= input.nextInt();
        boolean isArmstrong= isArmstrongTest(number);
        if(isArmstrong){
            System.out.println("The given number is Armstrong");
        }
        else {
            System.out.println("The given number is not  Armstrong");
        }
    }

    public  static  boolean isArmstrongTest(int number){
        int digits=String.valueOf(number).length();
        int a=number;
        int sum=0;
        while (a > 0) {
            int d = a % 10;
            sum += intPow(d, digits); // d^digits (integer power)
            a /= 10;
        }
        return sum == number;
    }

    static int intPow(int base, int exp) {
        int r = 1;
        for (int i = 0; i < exp; i++) r *= base;
        return r;
    }
}
