import java.util.Scanner;

public class CheckFourDivisible {
    public static void main(String[] args) {
        System.out.println("Welcome to Check if a large number is divisible by 4 or not program");
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the number need to be find ");
        int number=input.nextInt();
        boolean isDivisible= isDivisibleByFour(number);
        if(isDivisible){
            System.out.println("The Given number is divisible by 4");
        }
        else {
            System.out.println("The given number is not visible by 4");
        }
    }
    public  static  boolean isDivisibleByFour(int number){
        if(number%4==0){
            return  true;
        }
        else {
            return  false;
        }
    }

}
