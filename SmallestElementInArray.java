import java.util.Scanner;

public class SmallestElementInArray {
    public static void main(String[] args) {
        System.out.println("Welcome to smallest number in array");
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
        int min= array[0];
        for(int i=0; i<=array.length-1;i++){

            if(array[i]<min){
                min=array[i];

            }

        }
        System.out.println("The lowest value in the array is " + min);

    }
}
