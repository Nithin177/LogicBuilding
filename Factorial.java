import java.util.Scanner;

public class Factorial {
    public  static  long  findFact(int number){
        int res=1;
        for(int i=2; i<=number;i++){
            res=res*i;
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Factorial Program");
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the number to find the Factorial");
        int number=input.nextInt() ;
        long factorial= findFact(number);
        System.out.println("The Factorial of the number is  " + factorial);
    }
}
