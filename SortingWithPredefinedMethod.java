import java.util.Arrays;
import java.util.Scanner;

public class SortingWithPredefinedMethod {
    public static void main(String[] args) {
        System.out.println("Welcome to Selection  Sort");
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the size of the array u need to create");
        int size= input.nextInt();

        int array[]=new int[size];

        for (int i=0; i<= array.length-1; i++){
            System.out.println("Enter the value for array");
            array[i]=input.nextInt();
        }

        for (int arr:array){
            System.out.print(" " + arr + " ");
        }
        System.out.println();
        sort(array);
        for (int arr:array){
            System.out.print(" " + arr + " ");
        }

    }
    public  static  void  sort(int[]arr){
        Arrays.sort(arr);
    }

}
