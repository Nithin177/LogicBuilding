import java.util.Scanner;

public class ArraySortingSelectionSort {
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
        selectionSort(array);
        for (int arr:array){
            System.out.print(" " + arr + " ");
        }
    }

    public  static  void selectionSort(int[]arr){
        for (int i=0;i< arr.length-1;i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }

}
