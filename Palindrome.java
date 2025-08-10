import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println("Welcome to palindrome testing");
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=input.nextInt();
        boolean ispalindromeNumber=palNumber(num);
        if(ispalindromeNumber){
            System.out.println("The given Number is Palindrome");
        }
        else{
            System.out.println("The Given number is Not Palindrome");
        }

            }
    public static boolean palNumber(int number) {
        int originalValue= number;
        int rev = 0;
        int digits = 0;
        while (number > 0) {
            digits = number % 10; //  always gives last digit;
            System.out.println(" Digits---> " + digits);
            rev= rev *10 + digits;
            System.out.println(" rev");
            number/=10 ;// removes  last digits

            System.out.println(rev);
        }
       if(originalValue==rev){
           return  true;
       }
       else {
           return  false;
       }

    }
}



