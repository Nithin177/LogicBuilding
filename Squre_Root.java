import java.util.Scanner;

public class Squre_Root {
    public static void main(String[] args) {
        System.out.println("Welcome to Square root program");
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the number for which Square root need to be find ");
        int number=input.nextInt();
        float squareRoot = floorSqrt( number);
        System.out.println("The square root of given number is :"+ squareRoot);
    }

    public  static  float floorSqrt(int number){
        float ans=0;
        for(int i=1; i*i<=number;i++){
            ans=i;
        }
        return  ans;
    }

}
