import java.util.Scanner;

public class InsertionSort {
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
        insertionSort(array);
        for (int arr:array){
            System.out.print(" " + arr + " ");
        }

    }
    public  static void insertionSort(int[]arr){
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];  // The element to be positioned in the sorted part
            int j = i - 1;     // Start comparing with previous elements

            // Move elements of arr[0..i-1], that are greater than key, to one position ahead
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];  // Shift element rightward
                j--;
            }

            arr[j + 1] = key;  // Insert key at the correct sorted position
        }
    }

}
