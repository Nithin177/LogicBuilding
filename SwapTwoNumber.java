import java.util.Scanner;

public class SwapTwoNumber {
    public static void main(String[] args) {
        System.out.println("Welcome to Swap number");
        Scanner input=new Scanner(System.in);
        System.out.println("assign first number");
        int a= input.nextInt();
        System.out.println("assign second number");
        int b= input.nextInt();
        System.out.println("The given numbers are a : "+ a + " b " + b );
        int c=a;
       a=b;b=c;;
        System.out.println("a "+ a+ " b "+b);
    }
}
