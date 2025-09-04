import java.util.Scanner;

public class FindLargestAndSmallestNumberInArray {
    public static void main(String[] args) {
        System.out.println("Welcome to smallest  and largest number in array");
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size=input.nextInt();
        int array[] =new int[size];
        for(int i=0; i<array.length; i++){
            System.out.println("Enter the number for array");
            array[i]= input.nextInt();
        }
        for( int num:array){
            System.out.print(" "+ num+ " ");
        }
        System.out.println();
        int largest=array[0];
        int smallest= array[0];
        for (int i=0;i<array.length;i++){
            if(array[i]>largest){
                largest=array[i];

            }

            if(array[i]<smallest){
                smallest=array[i];

            }

        }
        System.out.println("The Largest value is  " + largest);
        System.out.println("The Smallest value is "+ smallest);
    }


}
