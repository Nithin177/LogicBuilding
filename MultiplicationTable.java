import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        System.out.println("Welcome to Multiplication table");
        Scanner input= new Scanner(System.in);

        System.out.println("Enter the Number You want me to generate the table");
        int number= input.nextInt();
        for( int i =1; i<=10;i++){
            System.out.println(number + "*" + i + "= " + number*i );
        }
    }
}
