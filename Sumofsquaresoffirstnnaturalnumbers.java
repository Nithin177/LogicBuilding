import java.util.Scanner;

public class Sumofsquaresoffirstnnaturalnumbers {
    public static void main(String[] args) {
        System.out.println("Welcome to the sum of square natural number  ");
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the natural number");
        int n=input.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            sum=sum+(i*i);
            System.out.println(sum);

        }
        System.out.println("Sum is :" + sum);
    }
}
