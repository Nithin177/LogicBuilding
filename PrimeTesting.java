import java.util.Scanner;

public class PrimeTesting {
    public static void main(String[] args) {
        System.out.println("Welcome To Prime Testing Program");
        Scanner input= new Scanner(System.in);
        System.out.println("Enter number need to be tested for prime");
        int num= input.nextInt();
        boolean  isPrime=primeTesting(num);

        if(isPrime){
            System.out.println("The Given number is prime");
        }
        else {
            System.out.println("The Given number is not prime");
        }
    }

    public  static  boolean primeTesting(int number){
        if(number <=1){
            return  false;
        }
        for(int i=2;i<number;i++){
            if(number%i==0){
                return  false;
            }
        }
        return  true;
    }

}
