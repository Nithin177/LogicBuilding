import java.util.Scanner;

public class LcmOfNumbers {
    public static void main(String[] args) {
        System.out.println("Welcome to LCM Program");
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the first number");
        int a= input.nextInt();
        System.out.println("Enter the second number");
        int b= input.nextInt();
        int lcm= lcm(a,b);
        System.out.println("LCM of the numbers is  " + lcm);
    }
    public  static  int gcd(int a, int b){
        while (b != 0) {
            int temp = b;
            b = a % b; // remainder
            a = temp;
        }
        return a;
    }

    public static int   lcm(int a, int b){
        int LCM= (a*b)/gcd(a,b);
        return LCM;
    }

    }


    /* HCF and LCM of number relationship
     HCF(a,b) * LCM(a,b)= a*b
     */

