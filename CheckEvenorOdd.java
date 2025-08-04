import java.util.Scanner;

public class CheckEvenorOdd {
    public static void main(String[] args) {
        System.out.println("Welcome to ODD EVEN Checker");
        Scanner input= new Scanner(System.in);
        System.out.println("Please enter the number need to be checked");
         int  num= input.nextInt();

         if(num%2==0){
             System.out.println("The given number is even");
         }
         else {
             System.out.println("The given number odd");
         }
    }
}
