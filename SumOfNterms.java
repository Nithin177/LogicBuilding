import java.util.Scanner;

public class SumOfNterms {
    public static void main(String[] args) {
        System.out.println("Welcome to sum of numbers");
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the number to find their sum");
        int num=input.nextInt();
        int result=term(num);
        System.out.println("The Sum of n number is  "+ result);

    }

    public  static  int term(int number){
        int sum=0;
        for(int i=1;i<=number;i++){
           sum=sum+i;

        }
        return sum;
    }

}
