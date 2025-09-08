import java.util.HashSet;
import java.util.Scanner;

public class DuplicateChecker {
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
        boolean isDuplicatePresent=iSDuplicatePresent(array);
        if(isDuplicatePresent){
            System.out.println("Yes Array has Duplicates");
        }
        else {
            System.out.println("Array does not has duplicates");
        }
    }

    public  static  boolean iSDuplicatePresent(int[]array){
        HashSet<Integer>set=new HashSet<>();
        boolean result=false;

        for(int num:array){
            if(set.contains(num)){
                result=true;
            }
            set.add(num);
        }
        return result;

    }

}
