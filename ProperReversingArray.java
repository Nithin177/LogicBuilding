import java.util.Scanner;

public class ProperReversingArray {
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

        int n= array.length;
        int start=0;  int end=n-1;

        while (start<end){
            int temp=array[start];
            array[start]=array[end];
            array[end]=temp;
            start++;
            end--;
        }
        for (int arr:array){
            System.out.print(" " + arr + " ");
        }
    }
}
