import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println("Welcome To SumOfNumber");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Number need to be Calculated");
        int num = input.nextInt();
        int sum= sumOfNumber(num);
        System.out.println("The Sum of given number is  : " + sum);


    }

    public static int sumOfNumber(int number) {
         int sum=0;
       while (number >0){
           int digits=number %10;
           System.out.println("Digits--->" + digits);
           sum=sum+digits;
           System.out.println("Sum ---> " + sum);
           number=number/10;
           System.out.println("Number---> " + number);

       }
        return sum;
    }
}