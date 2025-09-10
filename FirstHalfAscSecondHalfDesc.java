import java.util.Scanner;

public class FirstHalfAscSecondHalfDesc {
    public static void main(String[] args) {
        System.out.println("Welcome to First Half ASC and second half DESC");
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
        printOrder(array,size);
        for (int arr:array){
            System.out.print(" " + arr + " ");
        }


    }
     public static void printOrder(int[] a, int n)
    {
        int temp;
        for(int i=0;i < n-1;i++)
        {
            // First inner loop: Sort the first half in ascending order
            for(int j = 0;j < n/2; j++) {
                if(a[j]>a[j+1])
            {
                temp=a[j];
                a[j]=a[j+1];
                a[j+1]=temp;
            }
            }

            // Second inner loop: Sort the second half in descending order
            for(int j = n/2;j < n-1; j++)
            {
                if(a[j] < a[j+1])
                {
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        }
}
