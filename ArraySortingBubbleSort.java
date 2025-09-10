import java.util.Scanner;

public class ArraySortingBubbleSort {
    public static void main(String[] args) {
        System.out.println("Welcome to Bubble Sort");
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
        bubbleSort(array,size);
        for (int arr:array){
            System.out.print(" " + arr + " ");
        }

    }

    public static  void  bubbleSort(int[]arr,int n) {

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

}
