import java.util.Scanner;

public class SumofArray {
    public static void main(String[] args) {
        System.out.println("Welcome to sum of Array Program");
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the size of the array u need to create");
        int size= input.nextInt();

        int array[]=new int[size];

        for (int i=0; i<= array.length-1; i++){
            System.out.println("Enter the value for array");
            array[i]=input.nextInt();
        }

      int sum=0;
        for (int arr:array){
            System.out.print(" " + arr + " ");
            sum= sum+arr;
        }
        System.out.println();

        System.out.println("The Sum of the array is  " + sum);
    }
}
