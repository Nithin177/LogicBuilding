import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        System.out.println("Welcome to Greatest Common Divisor");
        Scanner input= new Scanner(System .in);
        System.out.println("Enter first  positive integer");
        int a= input.nextInt();
        System.out.println("Enter second  positive integer");
        int b= input.nextInt();
        int result=checkFfd(a,b);
        System.out.println("GCD of " + a + " and " + b + " is: " + result);
    }
     public  static  int checkFfd( int a ,int b){
         while (b != 0) {
             int temp = b;
             b = a % b; // remainder
             a = temp;
         }
         return a;
     }
}
