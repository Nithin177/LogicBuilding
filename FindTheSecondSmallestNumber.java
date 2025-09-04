import java.util.Scanner;

public class FindTheSecondSmallestNumber {
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
        int smallest= array[0];
        for(int i=0; i<=array.length-1;i++) {

            if (array[i] < smallest) {
                smallest = array[i];

            }
        }
        int sec_smallest= Integer.MAX_VALUE;

        for (int i =0;i<array.length-1;i++){
            if(array[i]!=smallest && array[i]<sec_smallest){
                sec_smallest=array[i];
            }
        }
        System.out.println("Second Smallest element in the array is " + sec_smallest);
    }
}
