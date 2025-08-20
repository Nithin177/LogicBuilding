import java.util.Scanner;

public class FractionSum {
    public static void main(String[] args) {
        System.out.println("Welcome to Fraction of sum Program");
        Scanner input= new Scanner(System.in);

        System.out.println("Enter numerator  of first fraction");
        int num1= input.nextInt();
        System.out.println("Enter denominator  of first fraction");
        int denom1= input.nextInt();
        System.out.println("Enter numerator  of second fraction");
        int num2= input.nextInt();
        System.out.println("Enter denominator  of second fraction");
        int denom2= input.nextInt();


        int a[]={num1,denom1};
        int b[]={num2,denom2};

        int[] result= addFractions(a,b);
        System.out.println("The result of the Fraction is  :" + result[0] +"/"+ result[1]);
    }

    // function to find gcd
    public static int gcd(int x, int y) {
        while (y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }
        return x;
    }

    public static int[] addFractions(int[] a, int[] b) {
        int num1 = a[0], den1 = a[1];
        int num2 = b[0], den2 = b[1];

        // numerator and denominator of result
        int resultNum = num1 * den2 + num2 * den1;
        int resultDen = den1 * den2;

        // simplify fraction
        int g = gcd(resultNum, resultDen);
        resultNum /= g;
        resultDen /= g;

        return new int[]{resultNum, resultDen};
    }

}
