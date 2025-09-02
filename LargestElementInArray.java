import java.util.Scanner;

public class LargestElementInArray {
    public static void main(String[] args) {
        System.out.println("Welcome to Array Series ");
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the Size of the array you need to create ");
        int size=input.nextInt();
        System.out.println("Size of Array is " + size);
        int array[]=new int[size];

        for(int i=0;i<array.length; i++){
            System.out.println("Enter the values for array");
            array[i]=input.nextInt();
        }

        int largest=largeElement(array);
        System.out.println("the largest value in the array is  " + largest);

//        for( int num:array){
//            System.out.print("num  "+ num);
//        }
    }
    public static int largeElement(int array[]) {
        int large = array[0];  // assume first element is largest
        for (int i = 1; i < array.length; i++) {  // start from 1
            if (array[i] > large) {
                large = array[i];  // update largest
            }
        }
        return large; // return only after full loop
    }

}
