import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        System.out.println("Welcome to Perfect number Program");
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number to check whether the number is perfect  or not");
        int number=input.nextInt();
        boolean  isPerfectNumber= isPerfect(number);
        if(isPerfectNumber){
            System.out.println("The given number is Perfect number");
        }
        else {
            System.out.println("THe given number is not a perfect number");
        }

    }
     public  static  boolean isPerfect(int number){
        int sum=0;
     for (int i=1;i<number;i++){
         if(number%i==0){
             sum= sum+i;
         }
     }
     if(sum==number){
         return  true;
     }
     else{
         return  false;
     }
     }
}
