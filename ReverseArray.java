import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        System.out.println("Welcome to Reverse of Array Program");
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

        for(int i= array.length-1; i>=0; i--)
            System.out.print(array[i]+" ");
    }
    }

