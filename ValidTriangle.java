import java.util.Scanner;

public class ValidTriangle {
    public static void main(String[] args) {
        System.out.println("Welcome to Valid Triangle");
        Scanner input= new Scanner(System.in);

        System.out.println("Enter the sides of triangle");
        int a=input.nextInt();
        System.out.println("Enter the sides of triangle");
        int b=input.nextInt();
        System.out.println("Enter the sides of triangle");
        int c=input.nextInt();
        int valid=checkTriangle(a,b,c);

        if(valid==1){
            System.out.println("Valid");
        }
        else {
            System.out.println("Not valid");
        }

    }
    public  static  int checkTriangle(int a, int b, int c){
        if (a + b <= c || a + c <= b || b + c <= a)
            return 0;
        else
            return 1;
    }





}

