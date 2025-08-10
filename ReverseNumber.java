import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        System.out.println("Reverse the number");
        Scanner input=new Scanner( System.in);
        int revNumber=input.nextInt();
         int newNumber=revNumber(revNumber);
        System.out.println("New Number--->"  + newNumber);


    }
    public static int revNumber(int number) {
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
        return rev;

    }
}
